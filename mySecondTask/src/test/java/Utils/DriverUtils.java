package Utils;

import BaseElements.BaseForm;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverUtils {
    private Logger logger = LoggerFactory.getLogger(DriverUtils.class);

    public void goToUrl(String startPage){
        DriverFactory.driver.get(startPage);
        logger.info("You go to url: {}", startPage);
    }

    public String workThisAlertsText() {
        logger.info("Alert contains the following text: {}", DriverFactory.driver.switchTo().alert().getText());
        return DriverFactory.driver.switchTo().alert().getText();
    }
    public void waitAlertIsPresent(){
        WaitUtils.wait.until(ExpectedConditions.alertIsPresent());
    }

    public void workThisAlertsAccept() {
        DriverFactory.driver.switchTo().alert().accept();
        logger.info("Ok button was pressed in Alert!");
    }

    public void sendAlertText(String anyString) {
        DriverFactory.driver.switchTo().alert().sendKeys(anyString);
        logger.info("Introduced the following string in the alert text field: {}", anyString);
    }

}
