package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard extends BasePage{

    public boolean isUserIsOnDashboard() {
        WebElement dashBoardElement = driver.findElement(By.xpath("//h6"));
        return dashBoardElement.isDisplayed();
    }
}
