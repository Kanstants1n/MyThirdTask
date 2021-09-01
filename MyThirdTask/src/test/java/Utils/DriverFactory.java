package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverFactory {
    public static WebDriver driver;
    public static Logger logger = LoggerFactory.getLogger(DriverFactory.class);
    public static String browserName = ConfigManager.getProperties("browser");
    public static int waitingPageLoad = Integer.parseInt(ConfigManager.getProperties("pageTimeLoader").trim());

    public static void initialize() {
        if (driver == null) {
            if (browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("FF")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("internet explorer")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else {
                logger.info("Driver not found");
            }
        }

        driver.manage().timeouts().pageLoadTimeout(waitingPageLoad, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void quit() {
        driver.quit();
    }
}
