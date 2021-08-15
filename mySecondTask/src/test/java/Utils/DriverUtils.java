package Utils;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class DriverUtils {
    public static void goToUrl(String startPage){
        DriverFactory.driver.get(startPage);
    }
    public String workThisAlertsText() {
        return DriverFactory.driver.switchTo().alert().getText();
    }
    public void waitAlertIsPresent(){
        WaitUtils.wait.until(ExpectedConditions.alertIsPresent());
    }

    public void workThisAlertsAccept() {
        DriverFactory.driver.switchTo().alert().accept();
    }

    public void sendAlertText(String anyString) {
        DriverFactory.driver.switchTo().alert().sendKeys(anyString);
    }

}
