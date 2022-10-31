package stepDefinitions;


import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import pojoClasses.ReqresPostCallPojo;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class StepDefinition {
    Response response;
    @Given("^Iam on Reqres application$")
    public void iamOnReqresApplication() {
        RestAssured.baseURI="https://reqres.in/";
    }

    @When("^I pass the end point for get list of users$")
    public void iPassTheEndPoint() {
        response=given().
                when().
                header("Content-Type","application/json").
                get("/api/unknown/23\n" +
                        "\n");

    }

    @Then("^I get the status code (.*)$")
    public void iGetTheStatusCode(int expectedStatusCode) {
        int actualStatusCode=response.getStatusCode();
        Assert.assertEquals(actualStatusCode,expectedStatusCode);

    }

    @When("^I pass the end point for post api call$")
    public void iPassTheEndPointForPostApiCall() {
        Map<String,String> payload=new HashMap<>();
        payload.put("name","morpheus");
        payload.put("job","leader");

        String jsonPayload=new Gson().toJson(payload);
        System.out.println(jsonPayload);

        response=given().
                when().
                header("Content-Type","application/json").
                body(jsonPayload).
                post("/api/users");


    }

    @When("^I pass the (.*)for get api call$")
    public void iPassTheEndPointForGetApiCall(String endPoint) {
        response=given().
                when().
                header("Content-Type","application/json").
                get(endPoint);
    }

    @When("I pass the end point for post api call \\( pojo)")
    public void iPassTheEndPointForPostApiCallPojo() {
        ReqresPostCallPojo reqresPostCallPojo=new ReqresPostCallPojo();
        reqresPostCallPojo.setName("Saran");
        reqresPostCallPojo.setJob("Manager");

        response=given().
                when().
                header("Content-Type","application/json").
                body(reqresPostCallPojo).
                post("/api/users");

    }
}
