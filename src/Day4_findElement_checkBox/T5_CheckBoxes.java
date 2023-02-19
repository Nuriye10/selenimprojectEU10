package Day4_findElement_checkBox;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_CheckBoxes {

    private static webDriverFactory WebDriverFactory;

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //we have tp locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath(""));
        WebElement checkbox2 = driver.findElement(By.xpath(""));


    }


}
