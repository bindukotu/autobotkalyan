package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.PetStoreRoot;
import pojos.ReqresRoot;
import pojos.Swagger.Category;
import pojos.Swagger.Root;
import pojos.Swagger.Tags;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PetStoreSteps {
    Response response;
     Faker faker = new Faker();
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

    @When("^I pass the endpoint for Pet object that needs to be added to the store$")
    public void iPassTheEndpointForPetObjectThatNeedsToBeAddedToTheStore() {
        Category category = new Category();
        category.setName(faker.name().name());
        category.setId(faker.number().numberBetween(1, 10));
        Tags tags = new Tags();
        tags.setId(faker.number().numberBetween(1, 10));
        tags.setName(faker.name().name());
        List<String> photoUrls = new ArrayList<>();
        photoUrls.add(faker.name().name());
        List<Tags> listtags = new ArrayList<>();
        listtags.add(tags);

        Root root = new Root();
        root.setCategory(category);
        root.setId(faker.number().numberBetween(1,10));
        root.setTags(listtags);
        root.setStatus("available");
        root.setPhotoUrls(photoUrls);
        root.setName(faker.name().name());

        response = given().
                when().
                header("Content-Type","application/json").
                body(root).
                post("v2/pet").andReturn();
        String res =response.getBody().asString();
        System.out.println(res);
    }
}

