//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package AnyElements;

import Utils.DriverFactory;
import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseForm {
    private Logger logger = LoggerFactory.getLogger(BaseForm.class);

    public void waitForOpen(By elementBy, String loggerName) {
        WaitUtils.wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
        logger.info("Waiting element: {}", loggerName);
    }

    public boolean isDisplayed(By elementBy, String loggerName) {
        logger.info("Display — {}", loggerName);
        return DriverFactory.driver.findElement(elementBy).isDisplayed();
    }
}
