package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class stepDefintion
{
    Response response;

    @Given("^I am on Reqres application$")
    public void iAmOnReqresApplication()
    {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @When("^I pass the (.*) for get Api call$")
    public void iPassTheEndpoint(String endPoint)
    {
        response = given().
                   when().
                   header("Content-Type","application/json").
                   get(endPoint);
    }

    @Then("^I get the statusCode (.*)$")
    public void iGetTheStatusCode(int expectedStatusCode)
    {
        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }


    @When("^I pass the endpoint for post Api call$")
    public void iPassTheEndpointForPostApiCall()
    {
        response = given().
                when().
                header("Content-Type","application/json").
                body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").
                post("api/users");
    }
}
