package stepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import pojoClasses.CreateUserPetStorePojo;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PetStoreStepDef {
    Response response;
    @Given("^I am on petstore application$")
    public void iAmOnPetstoreApplication() {
        RestAssured.baseURI="https://petstore.swagger.io/";
    }

    @When("I pass the endpoint for create users")
    public void iPassTheEndpointForCreateUsers() {
        CreateUserPetStorePojo createUserPetStorePojo=new CreateUserPetStorePojo();
        createUserPetStorePojo.setId(30);
        createUserPetStorePojo.setUsername("abcd");
        createUserPetStorePojo.setFirstName("efg");
        createUserPetStorePojo.setLastName("abcde");
        createUserPetStorePojo.setEmail("abcd@gmail.com");
        createUserPetStorePojo.setPassword("aeiou123");
        createUserPetStorePojo.setPhone("0123456789");
        createUserPetStorePojo.setUserStatus(3);

        response=given().when().
                header("Content-Type","application/json").
                body(createUserPetStorePojo).
                post("v2/user");
    }

    @Then("I get the status code (.*)$")
    public void iGetTheStatusCode(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }

    @When("I pass end point for login page")
    public void iPassEndPointForLoginPage() {
        response=given().when().
                header("Content-Type","application/json").
                get("v2/user/login?username=(data.get(validUsername)&password=(data.get(validPassword)");
    }



    @And("I enter the validUsername and validPassword")
    public String iEnterTheValidUsernameAndValidPassword() {
        Map<String,String> inputData=new HashMap<>();
        inputData.put("validUsername","abcd@gmail.com");
        inputData.put("validPassword","aeiou123");
        //System.out.println(inputData);
        // convert java object to json format using Gson
        String data=new Gson().toJson(inputData);
        //System.out.println(data);
        return data;

    }
}

