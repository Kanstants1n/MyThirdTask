package Utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private static Integer waiting = Integer.parseInt(ConfigManager.getProperties("waitingTime").trim());
    public static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, waiting);
    public static void waitAlertIsPresent(){
        wait.until(ExpectedConditions.alertIsPresent());
    }

}
