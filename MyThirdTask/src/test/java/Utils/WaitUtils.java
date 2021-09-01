package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    public static Integer waiting = Integer.parseInt(ConfigManager.getProperties("waitingTime").trim());
    public static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, waiting);
    public static void waitAlertIsPresent() {
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public static void waitElement(By elementBy){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

}
