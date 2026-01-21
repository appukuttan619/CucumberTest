package com.automation.stepDefinition;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        DriverManager.initDriver();
        ConfigReader.initConfig();
        DriverManager.goToSite(ConfigReader.getValue("base.url"));
    }

    @After
    public void tearDown(){
        DriverManager.closeDriver();
    }
}
