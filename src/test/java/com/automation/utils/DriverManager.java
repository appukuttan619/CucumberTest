package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {
    static WebDriver driver;

    public static void initDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
    public static void closeDriver(){
        driver.close();
    }

    public static void changeTimer(int secs){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
    }

    public static void goToSite(String url){
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
