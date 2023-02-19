package Day4_findElement_checkBox;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
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
        //3- Locate all the links in the page .
        //windows: alt+enter
        List<WebElement> allLinks = (List<WebElement>) driver.findElement(By.tagName("a"));

        //4- print out the number of the links on the page .
        System.out.println("allLinks.size = " + allLinks.size());

        //5-Print out the texts of the links.
        for (WebElement each : allLinks) {
            System.out.println("Text of link:" + each.getText());
            System.out.println("HREF Values:" + each.getAttribute("href"));
        }
        //6-print out the HREF attribute values of the links



    }
}
