import PojoClass.PetPojo;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class PetStepdefs {
   Response response;

    @Given("^I am on petstore apllication$")
    public void iAmOnPetstoreApllication() {
        RestAssured.baseURI="https://petstore.swagger.io/";
    }

    @When("I pass the endpoint for post api call")
    public void iPassTheEndpointForPostApiCall()
    {
     PetPojo petPojo=new PetPojo();
     petPojo.setId(23);
     petPojo.setUsername("Bindu");
     petPojo.setFirstName("Hima");
     petPojo.setLastName("kotu");
     petPojo.setEmail("bindu@gmail.com");
     petPojo.setPassword("bindu");
     petPojo.setPhone("8844335566");
     petPojo.setUserStatus(200);
     String jsonObject=new Gson().toJson(petPojo);
     response = given().when().header("Content-Type","application/json").
                body(jsonObject) .
                post("#/user/createUser");
    }

    @Then("I get the statusCode {int}")
    public void iGetTheStatusCode(int expectedStatusCode) {
     int actualStatusCode=response.getStatusCode();
     System.out.println(actualStatusCode);
    Assert.assertEquals(actualStatusCode,expectedStatusCode);

    }

 @When("I pass the endpoint for get Api call")
 public void iPassTheEndpointForGetApiCall() {
     response =given().when().header("Content-Type","application/json").get("#/user/logoutUser");
     String s=response.getBody().asString();
  System.out.println(s);
 }
}
