package com.cydeo.test.day6;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Day4_findElement_checkBox.T5_CheckBoxes.WebDriverFactory;

public class T1_Alerts_Practices {

    WebDriver driver;

  @BeforeMethod
  public void setupMethod(){
      //1.Open browser

      driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //2.Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

  }
     @Test
    public void alert_test1(){


     }

}
