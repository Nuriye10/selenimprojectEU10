package com.cydeo.test.day5_testNG_intro_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        WebElement hockeyRadioButton= driver.findElement(By.xpath("//input[@id='hockey']"));


        hockeyRadioButton.click();

     //4. Verify "Hockey" radio button is selected after clicking.

       if(hockeyRadioButton.isSelected()){

           System.out.println("Button is selected. Verification PASSED!");
       }else{
           System.out.println("Button is not selected. Verification FAILED!!!");
       }



    }


}
