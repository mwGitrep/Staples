package gluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpEntity;

import static io.restassured.RestAssured.*;

public class Test_Steps_Login_Successful {
    @Given("^I want to execute login endpoint")
    public void method1()throws Throwable{
        baseURI = "https://reqres.in";
        basePath = "/api";
    }

    @When("^I submit the POST Method")
    public void method2()throws Throwable{
        given().contentType(ContentType.JSON).body("{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}").post(baseURI+basePath+"/login");
    }

    @Then("^I should get token$")
    public void method3(){
        Response response = given().contentType(ContentType.JSON).body("{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}").post(baseURI+basePath+"/login");
        System.out.println(response.asString());
    }

}