package stepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

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
        Map<String,String> payload = new HashMap<>();
        payload.put("name","morpheus");
        payload.put("job","leader");

        //We need to convert Java Objects into JSON respresentation for that we are using Gson
        String JsonPayload = new Gson().toJson(payload);

        System.out.println(JsonPayload);

        response = given().
                when().
                header("Content-Type","application/json").
                body(JsonPayload).
                post("api/users");
    }
}
