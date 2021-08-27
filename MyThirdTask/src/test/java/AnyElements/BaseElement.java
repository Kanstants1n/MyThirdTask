package AnyElements;

import Utils.DriverFactory;
import Utils.JavaScriptActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseElement {

    private By elementBy;
    private String loggerName;
    private Logger logger = LoggerFactory.getLogger(BaseElement.class);

    public BaseElement(By elementBy, String loggerName) {
        this.elementBy = elementBy;
        this.loggerName = loggerName;
    }

    protected WebElement findElement() {
        return DriverFactory.driver.findElement(elementBy);
    }

    public int numberElements() {
        return DriverFactory.driver.findElements(elementBy).size();
    }

    public boolean isDisplay() {
        logger.info("Display {}", loggerName);
        return findElement().isDisplayed();
    }

    public String getText() {
        logger.info("{} text get: {}", loggerName, findElement().getText());
        return findElement().getText();
    }

    public void jsClick() {
        JavaScriptActions.clickElementWithJS(findElement());
        logger.info("Clicked element with JS help — {}", loggerName);
    }

    public void scrollTo() {
        JavaScriptActions.scrollToSomeElement(findElement());
        logger.info("Scroll to — {}", loggerName);
    }

    public void senKeys(String anyString) {
        findElement().sendKeys(anyString);
    }
}
