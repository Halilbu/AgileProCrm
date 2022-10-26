package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.pages.LoginPage;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class Login_StepDefinitions {


    LoginPage loginPage = new LoginPage();


    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("HR user types a valid username {string}")
    public void hrUserTypesAValidUsername(String username) {
    loginPage.inputUsername.sendKeys(username);
    }

    @When("HR user types a valid password {string}")
    public void hrUserTypesAValidPassword(String password) {
        loginPage.inputUserPassword.sendKeys(password);
    }

    @When("HR user click the login button")
    public void hrUserClickTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("HR user should log in on the homepage")
    public void hrUserShouldLogInOnTheHomepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));

    }


    @When("Helpdesk user types a valid username {string}")
    public void helpdeskUserTypesAValidUsername(String username) {
        loginPage.inputUsername.sendKeys(username);
    }

    @When("Helpdesk user types a valid password {string}")
    public void helpdeskUserTypesAValidPassword(String password) {
        loginPage.inputUserPassword.sendKeys(password);
    }

    @When("Helpdesk user click the login button")
    public void helpdeskUserClickTheLoginButton() {
        loginPage.loginButton.click();

    }

    @Then("Helpdesk user should log in on the homepage")
    public void helpdeskUserShouldLogInOnTheHomepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }

    @When("Marketing user types a valid username {string}")
    public void marketingUserTypesAValidUsername(String username) {
        loginPage.inputUsername.sendKeys(username);
    }

    @When("Marketing user types a valid password {string}")
    public void marketingUserTypesAValidPassword(String password) {
        loginPage.inputUserPassword.sendKeys(password);
    }

    @When("Marketing user click the login button")
    public void marketingUserClickTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("Marketing user should log in on the homepage")
    public void marketingUserShouldLogInOnTheHomepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }


    @And("User click the login button")
    public void userClickTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("User should not log in in the homepage")
    public void userShouldNotLogInInTheHomepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }


    @When("User types invalid username {string}")
    public void userTypesInvalidUsername(String username) {
        loginPage.inputUsername.sendKeys(username);
    }

    @When("User types invalid password {string}")
    public void userTypesInvalidPassword(String password) {
        loginPage.inputUserPassword.sendKeys(password);
    }
}
