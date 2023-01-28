package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverFactory {
    public static WebDriver getDriver(String browserType) {


        if(browserType.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("Given browser type does not exit/or is currently supported");
            System.out.println("Driver= null");
            return null;

        }

    }


}





