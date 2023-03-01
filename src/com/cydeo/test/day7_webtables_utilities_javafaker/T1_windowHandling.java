package com.cydeo.test.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_windowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        webDriverFactory WebDriverFactory = null;
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void window_handling_test(){
        //2, Goto: https://www.amazon.com
        driver.get(" https://www.amazon.com");

        //3.Copy-past the lines from below into your class

        ((JavaScriptExecutor) driver).executeScript("window.open(https://google.com','_blank');\");");
        ((JavaScriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavaScriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");






        //4. Create a logic to switch to the tab where Etsy.com is open
        //5.Assert : Title contains "Etsy"
        //Lines to ba pasted:





    }
}
