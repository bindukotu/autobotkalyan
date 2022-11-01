package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class stepDefinition {
    Response response;
    @Given("^I am on the reqres application$")
    public void iAmOnTheReqresApplication() {
        RestAssured.baseURI="https://reqres.in/";
    }

    @When("^I pass the (.*) for get api call$")
    public void iPassTheEndpoint(String endpoint) {
        response = given().
                when().
                header("Content-Type","application/json").
                get(endpoint);
    }

    @Then("^I get the statusCode (.*)$")
    public void iGetTheStatusCode(int expectedStatusCode) {
        int actualStatusCode=response.getStatusCode();
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }

    @When("^I pass the endpoint for post api call$")
    public void iPassTheEndpointForPostApiCall() {
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
