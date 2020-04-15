package gluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

public class Test_Steps_UsersList {
    @Given("^I want to execute List Users endpoint$")
    public void step1() {
        baseURI = "https://reqres.in";
        basePath = "/api/users/2";
    }

    @When("^I submit the GET request$")
    public void step2() {
        Assert.assertEquals(get(baseURI + basePath).statusCode(), 200);
    }

    @Then("^I should get 200 Success Status code$")
    public void step3(){
        Response response = get(baseURI + basePath);
        int statuscode = response.getStatusCode();
        Assert.assertEquals(statuscode,200);

        System.out.println(statuscode);
    }
}