package testNgPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDownTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.compiler"));
        System.out.println(System.getProperty("os.name"));
    }


}
