import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UnitTests {

      @Test(priority = 1)
      public void getCall(){
          RestAssured.baseURI = "https://reqres.in/";
          Response response = given().when().header("Content-Type", "application/json").
                 get("api/users?page=2").andReturn();
         // String res=response.getBody().asString();
         int StatusCode= response.getStatusCode();
       //   Assert.assertEquals(StatusCode,201);
          Assert.assertEquals(StatusCode,200);
    }

    @Test(priority=2)
    public void postCall(){
RestAssured.baseURI="https://reqres.in/";
Response response=given().when().header("Content-Type","application/json").
      body("{\n" +
              "    \"name\": \"morpheus\",\n" +
              "    \"job\": \"leader\"\n" +
              "}").
        post("api/users").andReturn();
int StatusCode=response.getStatusCode();
Assert.assertEquals(StatusCode,201);
    }
    @Test(priority=3)
    public void putCall()
    {RestAssured.baseURI="https://reqres.in/";
        Response response=given().when().header("Content-Type","application/json").
             body("{\n" +
                     "    \"name\": \"morpheus\",\n" +
                     "    \"job\": \"zion resident\"\n" +
                     "}\n")  . put("api/users/2").andReturn();
        int StatusCode=response.getStatusCode();
        Assert.assertEquals(StatusCode,200);


    }
    @Test(priority=4)
    public void deleteCall() {
        RestAssured.baseURI = "https://reqres.in/";
        Response response = given().when().header("Content-Type", "application/json").
                delete("api/users/2").andReturn();
        int StatusCode = response.getStatusCode();
        Assert.assertEquals(StatusCode, 204);

    }
    }