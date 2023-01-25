package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_LibraryLogInPage {

    public static void main(String[] args) {
     //TC.4. Library  verification.

       // 1.open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();






     //2.Go to http://library2.cybertekschool.com/login.html

        driver.get("http://library2.cybertekschool.com/login.html"
        );


     //3.Enter username:"incorrect@email.com"

        WebElement usernameInput= driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@emai.com");

     //4.Enter password:"incorrect password"
     //5.Click to sign in button.
     //6.Verify:visually "Sorry,Wrong Email or Password"


    }
}
