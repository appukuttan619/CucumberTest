package com.automation.stepDefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Dashboard {
    com.automation.pages.Dashboard dashboard = new com.automation.pages.Dashboard();
    @Then("verify user is on dashboard")
    public void verify_user_is_on_dashboard() {
        Assert.assertTrue(dashboard.isUserIsOnDashboard());
    }
}
