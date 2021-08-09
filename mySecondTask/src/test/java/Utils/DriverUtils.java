package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils{
    public WebDriver driver;

    public DriverUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo(String startPage) {
        driver.get(startPage);
    }




}
