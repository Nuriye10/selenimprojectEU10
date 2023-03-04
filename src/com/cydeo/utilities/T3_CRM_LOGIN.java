package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){


        webDriverFactory WebDriverFactory = null;
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void crm_login_test(){
    driver.get("https://login1.nextbasecrm.com/");





    }



}
