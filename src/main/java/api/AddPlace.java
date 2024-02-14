package api;

import files.Payload;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AddPlace {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // validate if Add Place API is working as expected
        //given - all input details
        //when - Submit the API - resource,http method
        //Then - validate the response

        RestAssured.baseURI="https://rahulshettyacademy.com";
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(Payload.AddPlace()).when().post("maps/api/place/add/json").then().log().all()
                .assertThat().statusCode(200)
                .body("scope",equalTo("APP"))
                .header("Server",equalTo("Apache/2.4.52 (Ubuntu)"));
    }
}
