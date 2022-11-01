package Day2;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UsingJson
{
    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/";
        Response response = given().when().header("Content-Type","application/json").
                            get("/api/users?page=2").andReturn();

        String res = response.getBody().asString();

//        System.out.println(res);

        //To retrieve value micheal from the data
        String firstName = JsonPath.read(res,"$.support.text");
        System.out.println(firstName);

    }
}
