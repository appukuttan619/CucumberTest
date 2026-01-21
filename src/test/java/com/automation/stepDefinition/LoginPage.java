package com.automation.stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginPage {

    com.automation.pages.LoginPage loginPage = new com.automation.pages.LoginPage();

    @Given("user is on landing page")
    public void user_is_on_landing_page() {
        Assert.assertTrue(loginPage.isLoginPageVisible());
    }

    @When("user gives userName")
    public void user_gives_user_name() {
        loginPage.userGivesUserName();
    }

    @When("user gives password")
    public void user_gives_password() {
        loginPage.userGivesPassword();
    }

    @When("clicks on login")
    public void clicks_on_login() {
        loginPage.clicksOnLoginBttn();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
