package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static void initConfig(){
        prop = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config/config.properties");
            prop.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key){
        return prop.getProperty(key);
    }
}
