package day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UsingJson {
    public static void main(String[] args) {


        RestAssured.baseURI = "https://reqres.in/";
        Response response = given().
                when().
                header("Content-type", "application/json").
                get("api/users/2").andReturn();
        int statusCode = response.getStatusCode();
        String res = response.getBody().asString();
        System.out.println(res);
        System.out.println(statusCode);
    }
}