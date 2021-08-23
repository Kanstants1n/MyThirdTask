package BaseElements;

import Utils.DriverFactory;
import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseForm {
    private String loggerName;
    private BaseElement baseElement;
    private Logger logger = LoggerFactory.getLogger(BaseForm.class);

    public void waitForOpen(By elementBy){
        WaitUtils.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        logger.info("{}: Waiting element", loggerName);
    }

    public boolean isDisplayed(By elementBy, String loggerName) {
        logger.info("Display — {}", loggerName);
        return DriverFactory.driver.findElement(elementBy).isDisplayed();
    }

}
