package gluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpEntity;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

public class Test_Steps_Login_Successful {
    @Given("^I want to execute login endpoint")
    public void step1() {
        baseURI = "https://reqres.in";
        basePath = "/api";
    }

    @When("^I submit the POST Method")
    public void step2() {
        Assert.assertEquals(Methods.submitPost(), 200);
    }

    @Then("^I should get token$")
    public void step3(){
        Response response = Methods.responsePost();
        if (response != null) System.out.println(response.asString());
    }
}