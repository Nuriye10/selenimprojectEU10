package com.cydeo.test.day5_testNG_intro_dropdown;


import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) {
        //TC 1.   StaleElementReferenceException handling
        //1. Open Chrome browser
        webDriverFactory WebDriverFactory = null;

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3.Click to "add elements" button
        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));

        addElementBtn.click();


        //4.Verify "Delete" button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());


        //5.Click to "Delete" button.
        deleteButton.click();

        //6.Verify "Delete" button is NOT displayed after clicking.

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

    }
}










