package com.cydeo.test.day5_testNG_intro_dropdown;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static Day4_findElement_checkBox.T5_CheckBoxes.WebDriverFactory;

public class T2_RadioButton {
    public static void main(String[] args) {

     //1. Open Chrome browser
        WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


     //2.Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

     //3.Click to "Hockey" radio button
     //4. Verify "Hockey" radio button is selected after clicking.



    }


}
