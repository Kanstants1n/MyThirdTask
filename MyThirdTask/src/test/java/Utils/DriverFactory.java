package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.IE;

public class DriverFactory {

    public static WebDriver driver;
    public static String browserName = ConfigManager.getProperties("browser");

    public static void initialize() {
        if (driver == null) {
            if (browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("FF")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase(IE)) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            }
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void quit() {
        System.out.println("Quiting the browser");
        driver.quit();
    }
}
