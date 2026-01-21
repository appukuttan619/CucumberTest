package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public void userGivesUserName() {
        WebElement userName = driver.findElement(By.xpath("//input[@name = 'username']"));
        userName.sendKeys("Admin");
    }
    public void userGivesPassword() {
        WebElement userName = driver.findElement(By.xpath("//input[@name = 'password']"));
        userName.sendKeys("admin123");
    }
    public void clicksOnLoginBttn() {
        WebElement loginbtn= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginbtn.click();

    }

    public boolean isLoginPageVisible() {
        WebElement loginText = driver.findElement(By.xpath("//h5"));
        return loginText.isDisplayed();
    }
}
