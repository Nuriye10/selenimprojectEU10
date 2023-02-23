package com.cydeo.test.day6_alerts_iframes_windows;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Day4_findElement_checkBox.T5_CheckBoxes.WebDriverFactory;

public class DropDown_task6 {

   @Test
    public void dropdown_task6(){

       WebDriver driver= WebDriverFactory.getDriver("chrome");

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://pracice.cydeo.com/dropdown");
   }

}
