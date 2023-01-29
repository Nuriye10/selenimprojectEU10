package com.cydeo.tests.day3_xpath_css;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {
      //1. Open Chrome browser

        webDriverFactory WebDriverFactory;
        WebDriver driver = webDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
      //2.Go to :https://login1.nextbasecrm.com/?forgot password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot password=yes");
      //3.Verify "Reset password " button is as expected:
      //Expected : Reset password
       // WebElement resetPassWordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        WebElement resetPassWordButton = driver.findElement(By.cssSelector("button[value='Reset password']"
                ));

        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText =resetPassWordButton.getText();

        if(actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Button text verification PASSED! ");
        }else{
            System.out.println("Button text verification FAILED!!!" );
        }


    }
}
