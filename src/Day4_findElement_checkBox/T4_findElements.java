package Day4_findElement_checkBox;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {

        webDriverFactory WebDriverFactory = new webDriverFactory();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wit time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get(" https://practice.cydeo.com/abtest");
        //3- Locate qll the links in the page .
        //4- print out the number of the links on the page .
        //5-Print out the texts of the links.
        //6-print out the HREF attribute values of the links

    }
}
