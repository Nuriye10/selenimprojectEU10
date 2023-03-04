package com.cydeo.utilities;

import com.google.common.base.Predicates;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    private static CharSequence expectedInTitle;
    private static Predicates actualTitle;

    public static void verifyTitle(WebDriver driver, String portal) {
    }
    /*
    This method will accept int (in second) and execute  Thread.sleep for given duration
     */

    public void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {


        }
    }

    public static void switchWindowAndVerify(WebDriver driver,String expectedInUrl){
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);

            System.out.println("Current URL:" + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {

                break;
            }
        }

                 String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));








        }





    }




