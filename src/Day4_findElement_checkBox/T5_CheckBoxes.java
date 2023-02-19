package Day4_findElement_checkBox;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_CheckBoxes {

    private static webDriverFactory WebDriverFactory;

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //we have tp locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        // Confirm checkbox1  is not selected by default.
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        // Confirm checkbox2 is selected by default.
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //4.Click check box 1 to select it
        Thread.sleep(2000);
        checkbox1.click();
        //Click checkbox 2 to deselect
        Thread.sleep(2000);

        //Confirm checkbox 1 is SELECTED.
        System.out.println("checkbox1.isSelected(),expecting true = " + checkbox1.isSelected());
        System.out.println("checkbox1.isSelected(),expecting true = " + checkbox1.isSelected());
     //Confirm checkbox 2 is not selected.
         System.out.println("checkbox2.isSelected(),expecting false = " + checkbox2.isSelected());


    }


}
