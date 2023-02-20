package Day4_findElement_checkBox;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;



public class T6_StaleElementTest {

    public static void main(String[] args) {

        webDriverFactory WebDriverFactory = null;//a[text()='CYDEO']
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to : https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3. Locate "CYDEO" link , verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


        //4. Refresh the page
        driver.navigate().refresh();

        //5.Verify it is displayed ,again.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());




    }
}
