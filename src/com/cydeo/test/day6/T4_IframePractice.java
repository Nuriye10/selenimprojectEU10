package com.cydeo.test.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Day4_findElement_checkBox.T5_CheckBoxes.WebDriverFactory;

public class T4_IframePractice {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to website: "https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");


    }


    @Test
    public void iframe_test(){

        // we need to switch drivers focus to iframe
        driver.switchTo().frame("mce_0_ifr");

      //locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());
        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able  to verify the header,  we must switch back to "main HTML"
        driver.switchTo().parentFrame();
        WebElement headerText =driver.findElement(By.xpath("//h3"));


        Assert.assertTrue(headerText.isDisplayed());




    }









}
