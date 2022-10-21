import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UnitTests {
    @Test
    public void getCall(){
        RestAssured.baseURI="https://reqres.in/";
        Response response=given().
                when().
                header("Content-type","application/json").
                get("api/users/2").andReturn();
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }
    @Test
    public void postCall(){
        RestAssured.baseURI="https://reqres.in/";
        Response response=given().
                when().
                header("Content-type","application/json").
                body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}").post("api/users");
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,201);
    }
    @Test
    public void putCall(){
        RestAssured.baseURI="https://reqres.in/";
        Response response=given().
                when().
                header("Content-type","application/json").
                body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}").put("api/users/2");
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }
    @Test
    public void deleteCall(){
        RestAssured.baseURI="https://reqres.in/";
        Response response=given().
                when().
                header("Content-type","application/json").
                delete("api/users/2").andReturn();
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,204);


    }


}
