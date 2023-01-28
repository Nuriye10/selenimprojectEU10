package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_getAttribute {
    public static void main(String[] args) {

        // 1.open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

       //2.go to :https://practice.cydeo.com/registration_form
       driver.get("https://practice.cydeo.com/registration_form");

       //3.Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));

       String expectedHeaderText="Registration form";

       String actualHeaderText=headerText.getText();

       if(actualHeaderText.equals(expectedHeaderText)){
           System.out.println("Header text verification PASSED!");
       }else{
           System.out.println("Header text verification FAILED!!!");
       }

       //4.
        WebElement firstNameInput=driver.findElement(By.name("First name"));
       //5.

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder =firstNameInput.getAttribute("placeholder");

    }


}