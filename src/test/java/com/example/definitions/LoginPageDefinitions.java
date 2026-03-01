package com.example.definitions;

import com.example.actions.HomePageActions;
import com.example.actions.LoginPageActions;
import com.example.utils.ConfigFileReader;
import com.example.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginPageDefinitions {

    private HomePageActions homePageActions;
    private LoginPageActions loginPageActions;
    private ConfigFileReader configFileReader;

    public LoginPageDefinitions() {
        homePageActions = new HomePageActions();
        loginPageActions = new LoginPageActions();
        configFileReader = new ConfigFileReader();
    }

    // ========== BACKGROUND ==========
    @Given("User is on HRMLogin page")
    public void userIsOnHrmLoginPage() {
        HelperClass.getDriver().get(configFileReader.getProperty("home.url"));
    }

    // ========== LOGIN ==========
    @When("User enters valid credentials")
    public void userEntersValidCredentials() {

        loginPageActions.getUserName().sendKeys(configFileReader.getProperty("home.username"));
        loginPageActions.getPassword().sendKeys(configFileReader.getProperty("home.password"));
        loginPageActions.getLoginButton().click();
    }

    @Then("User should be able to login successfully and new page open {string}")
    public void userShouldBeAbleToLoginSuccessfullyAndNewPageOpen(String message) {
        // Vérify Dashboard text via HomePageActions
        Assertions.assertEquals(homePageActions.verifyHomePage(),message);
    }
}

