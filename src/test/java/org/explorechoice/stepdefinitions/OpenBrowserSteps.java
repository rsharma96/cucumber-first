package org.explorechoice.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenBrowserSteps {

    @Given("I am able to open hubspot CRM url")
    public void i_am_able_to_open_hubspot_CRM_url() {
        System.out.println("Opening url");
    }

    @When("I enter valid username {string}")
    public void i_enter_valid_username(String uname) {
        System.out.println("Entering username - " + uname);
    }

    @When("I enter valid password {string}")
    public void i_enter_valid_password(String password) {
        System.out.println("Entering username - " + password);
    }

    @Then("I should able to login successfully")
    public void i_should_able_to_login_successfully() {
        System.out.println("I am able to login successfully");
    }

    @Then("I should able to see {string}")
    public void i_should_able_to_see(String string) {
        System.out.println("I can see restart demo");
    }


}
