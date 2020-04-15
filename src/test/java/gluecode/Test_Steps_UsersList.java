package gluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

public class Test_Steps_UsersList {
    @Given("^I want to execute getUsersList endpoint$")
    public void method1()throws Throwable{
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";
    }

    @When("^I submit the GET request$")
    public void method2()throws Throwable{
        get(baseURI + basePath + "/users/2");
    }

    @Then("^I should get 200 Success Status code$")
    public void method3(){
        Response response = get(baseURI + basePath + "/users/2");
        int statuscode = response.getStatusCode();
        Assert.assertEquals(statuscode,200);
        System.out.println(statuscode);
    }
}