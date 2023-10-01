package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class config {
    public static WebDriver driver;

    public static WebDriver setupBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("ch")) {
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("ff")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser choice");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        return driver;
    }
}
