import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class SrideviUnitTesting_NG
    {
    @Test(priority = 1)
    public void getCall()
    {
        RestAssured.baseURI = "https://reqres.in/";
        Response response = given().
                when().
                header("content-type", " application/json").
                get("api/users?page=2").andReturn();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    public void putCall()
    {
        RestAssured.baseURI = "https://reqres.in/";
        Response response = given().
                when().
                header("content-type", " application/json").
                body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}").
                put("api/users/2").andReturn();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    public void postCall()
    {
        RestAssured.baseURI = "https://reqres.in/";
        Response response = given().
                when().
                header("content-type", " application/json").
                post("api/users?page=2").andReturn();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);
    }
        public void deleteCall()
        {
            RestAssured.baseURI = "https://reqres.in/";
            Response response=given().
                                when().
                    header("content-type", " application/json").
                    delete("api/users?page=2").andReturn();
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 204);
        }
    }

