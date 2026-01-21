package com.automation.stepDefinition;

import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        DriverManager.initDriver();
        DriverManager.goToSite("https://opensource-demo.orangehrmlive.com/");
    }

    @After
    public void tearDown(){
        DriverManager.closeDriver();
    }
}
