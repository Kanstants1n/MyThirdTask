package BaseElements;

import Utils.DriverFactory;
import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BaseElement {

    private String loggerName;
    private static final Logger logger = LoggerFactory.getLogger(BaseElement.class);

    public void waitVisibility(By elementBy) {
        WaitUtils.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public boolean elementIsDisplayed(By elementBy) {
        return DriverFactory.driver.findElement(elementBy).isDisplayed();
    }

    public void clickElement(By elementBy){
        DriverFactory.driver.findElement(elementBy).click();
    }

    public String getText(By elementBy) {
        return DriverFactory.driver.findElement(elementBy).getText();
    }

}
