package com.cydeo.test.day6;

import Day4_findElement_checkBox.T5_CheckBoxes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class drop_downP6 {

    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        driver = T5_CheckBoxes.WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

        }
        @Test
        public void dropdown_task7 () throws InterruptedException{
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

            //3. sSelect Illinois

            stateDropdown.selectByVisibleText("Illinois");
            //4. Select Virginia
            stateDropdown.selectByValue("VA");


            //5.Select California

            stateDropdown.selectByIndex(5);
            //Verify final selected option is California
            String expectedOptionText = "California";
            String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

            Assert.assertEquals(actualOptionText, expectedOptionText);

        }





        }



