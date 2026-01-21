package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(){
        driver = DriverManager.getDriver();
    }
}
