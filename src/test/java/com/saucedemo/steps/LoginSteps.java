package com.saucedemo.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I enter username \"standard_user”$")
    public void iEnterUsernameStandard_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter password “secret_sauce”$")
    public void iEnterPasswordSecret_sauce() {
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
    }

    @Then("^I should navigate to Login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }
}
