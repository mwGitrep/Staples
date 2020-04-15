package gluecode;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Methods {
    public static int submitPost(){
        Response response = given().contentType(ContentType.JSON).body("{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}").post(baseURI+basePath+"/login");
        return response.statusCode();
    }
    public static Response responsePost(){
        Response response;
        response = given().contentType(ContentType.JSON).body("{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}").post(baseURI+basePath+"/login");
        return response;
    }
}
