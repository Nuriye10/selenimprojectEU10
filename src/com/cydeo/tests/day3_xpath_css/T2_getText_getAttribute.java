package com.cydeo.tests.day3_xpath_css;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {
       //TC. NextBaseCRM, locators, getText(), getAttribute() practice
        //1, Open a Chrome browser

        webDriverFactory WebDriverFactory = null;
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2, Go to :https://login.nextbasecrm.com/
        driver.get("https://login.nextbasecrm.com/");
        //3, Verify "remember me" label text is expected:
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));


        //Expected:Remember me on this computer
        //4, Verify "Forgot password " link text is expected:
        //5, Verify "forgot password"href attributes  value contains expected:
        //Expected:forgot_password=yes




    }
}
