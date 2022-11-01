package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.PetStoreRoot;
import pojos.ReqresRoot;

import static io.restassured.RestAssured.given;

public class PetStoreSteps {
    Response response;
    @Given("^I am on the petstore applicaton$")
    public void iAmOnThePetstoreApplicaton() {
        RestAssured.baseURI="https://petstore.swagger.io/";
    }

    @When("^I pass the endpoint for the postapi call$")
    public void iPassTheEndpointForThePostapiCall() {
       PetStoreRoot petStoreRoot = new PetStoreRoot();
       petStoreRoot.setEmail("string");
       petStoreRoot.setId(0);
       petStoreRoot.setFirstName("string");
       petStoreRoot.setLastName("string");
       petStoreRoot.setPassword("string");
       petStoreRoot.setPhone("string");
       petStoreRoot.setUsername("string");
       petStoreRoot.setUserStatus(0);


        response = given().
                when().
                header("Content-Type","application/json").
                body(petStoreRoot).
                post("v2/user");
    }

    @Then("^I get the status code (.*)$")
    public void iGetTheStatusCode(int expectedStatusCode) {
        int actualStatusCode=response.getStatusCode();
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }
}
