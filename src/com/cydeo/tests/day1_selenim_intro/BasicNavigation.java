package com.cydeo.tests.day1_selenim_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {


        //1. set up the browser driver
        WebDriverManager.chromedriver().setup();



        //2.Create instance of the selenium WebDriver
        // this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //this will maximize the browser size
        driver.manage().window().maximize();

        //3. Go to "https://www.tesla.com"
        driver.get("https://tesla.com");

        //get the title of the page

        String currentTitle = driver.getTitle();
        System.out.println("driver.getTitle="+ driver.getTitle());

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);


        //use navigate().to():
        driver .navigate().to("https://www.google.com");

        //get the title of the page

        System.out.println("driver.getTitle()="+driver.getTitle());


        String getCurrentUrl= driver.getCurrentUrl();
        System.out.println("CurrentURL=" + getCurrentUrl);

      driver.close();

      driver.quit();

    }
}
