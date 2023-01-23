package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) {

        //TC. Back and forth navigation
        //1. Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();





        //2. Go to :https://practice.cydeo.com
        //3.Click to A/B testing from top of the list.
        //4.Verify title is:
        //Expected: NO A/B test
        //5.Go back to home page by using the .back();
        //6.Verify title equals:
        // Expected :Practice
    }
}
