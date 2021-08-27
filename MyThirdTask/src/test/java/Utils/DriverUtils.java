package Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverUtils {
    private static Logger logger = LoggerFactory.getLogger(DriverUtils.class);

    public static void goToUrl(String startPage) {
        DriverFactory.driver.get(startPage);
        logger.info("You go to url: {}", startPage);
    }

    public static String workThisAlertsText() {
        WaitUtils.waitAlertIsPresent();
        logger.info("Alert contains the following text: {}", DriverFactory.driver.switchTo().alert().getText());
        return DriverFactory.driver.switchTo().alert().getText();
    }

    public static void workThisAlertsAccept() {
        WaitUtils.waitAlertIsPresent();
        DriverFactory.driver.switchTo().alert().accept();
        logger.info("Ok button was pressed in Alert!");
    }

    public static void sendAlertText(String anyString) {
        WaitUtils.waitAlertIsPresent();
        DriverFactory.driver.switchTo().alert().sendKeys(anyString);
        logger.info("Introduced the following string in the alert text field: {}", anyString);
    }
}
