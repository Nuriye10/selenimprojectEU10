package com.cydeo.test.day6;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

        //2.Go to website: "https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");


    }

    @Test
    public void multiple_Window_Test(){

        //Storing the main pages window handle as string is
        //good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println( "mainHandle =" + mainHandle);

        //4. Assert: Title is " windows"

        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        //5. Switch to new window.
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        actualTitle = driver.getTitle();
        System.out.println("Title after click: " + actualTitle);

        //6.Assert : Title is " New Window"

        for(String each: driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("Current title while switching the window:"+ driver.getTitle());
        }








    }

}
