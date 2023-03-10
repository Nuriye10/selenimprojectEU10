package Day4_findElement_checkBox;

import com.cydeo.utilities.webDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice{

    public static void main(String[] args) {
        //DU NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC1: XPATH and cssSelector practices
        //1.Open Chrome browser

        webDriverFactory WebDriverFactory = null;
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //2.Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. locate all the WebElements on the page using XPATH and CSS
        //locator only total of 6
        //a. "Home" link
        //locate home link using cssSelector
        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));


        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));

        WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href='/']"));


        //b."forgot password header"
        //Locate header using cssSelector :locate parent elements and move down to h2
        WebElement header_ex1 = driver.findElement(By.xpath("h2[text()='Forgot Password']"));
        //c."E-mail" text

        WebElement emailLabel= driver.findElement(By.xpath("//label[@for ='email']"));
        //d. E-mail input box

        WebElement inputBox_ex1= driver.findElement(By.xpath("//input[@name='email']"));

        //Locate inputBox using xpath contains method
        //tagName[contains(@attribute, 'value')]
        //e.Retrieve password " button
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));
        //f.Powered by Cydeo text
          WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center]"));

        //4. Verify all web elements are displayed.

        System.out.println("homeLink_ex1.isDisplayed()="+homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        driver.close();
    }


}
