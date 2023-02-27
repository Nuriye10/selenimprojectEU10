package com.cydeo.test.day6;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {


        webDriverFactory WebDriverFactory = null;
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to website: "https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");


    }

    @Test
    public void multiple_Window_Test(){



    }

}
