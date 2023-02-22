package com.cydeo.test.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Drop_Down {

    @BeforeMethod
    public void setupMethod(){


        //1. Open Chrome browser
  //2. Go to https://practice.cydeo.com/dropdown
     webDriverFactory WebDriverFactory = null;
     WebDriver driver =WebDriverFactory.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practic.cydeo.com/dropdown");


 }
    @Test
    public void simpleDropDown(){



}
}
