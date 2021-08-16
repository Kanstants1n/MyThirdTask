package BaseElements;

import Utils.DriverFactory;
import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BaseElement {

    private Logger logger = LoggerFactory.getLogger(BaseElement.class);

    public void waitVisibility(By elementBy) {
        WaitUtils.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        logger.info("Waiting element");
    }

    public boolean elementIsDisplayed(By elementBy) {
        logger.info("Display element");
        return DriverFactory.driver.findElement(elementBy).isDisplayed();
    }

    public void clickElement(By elementBy){
        DriverFactory.driver.findElement(elementBy).click();
        logger.info("Click element");
    }

    public String getText(By elementBy) {
        logger.info("Get attribute text");
        return DriverFactory.driver.findElement(elementBy).getText();

    }

}
