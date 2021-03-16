package com.orangeHRM2021.stepdefinitions;

import com.orangeHRM2021.base.ConfigReader;
import com.orangeHRM2021.pages.HomePage;
import com.orangeHRM2021.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {
    @Given("I am on the login page")
    public void verifyTitleTest(){
        Assert.assertEquals("OrangeHRM", LoginPage.verifyTitle());
    }

    @When("I enter correct username in the username field")
    public void enterValidUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }

    @And("I enter password in the password field")
    public void enterValidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("I click on the login button")
    public void ClickOnLogin() {
        LoginPage.clickLoginBtn();
    }

    @Then("I see the home page")
    public void verifyHomePageTitle() {
        Assert.assertEquals("OrangeHRM", HomePage.verifyTitle());
    }

    @When("I enter incorrect username in the username field")
    public void enterInvalidUsername(){
        LoginPage.enterUserName(ConfigReader.getProperty("invalidusername"));
    }

    @And("I enter incorrect password in the password field")
    public void enterInvalidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("invalidpassword"));
    }

    @Then("I see the error message on the login page")
    public void verifyErrorMessage(){
        Assert.assertEquals("Invalid credentials", LoginPage.getErrorMessage());
    }

}
