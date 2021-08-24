package BaseElements;

import Utils.DriverFactory;
import Utils.DriverUtils;
import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class BaseElement {

    private By elementBy;
    private String loggerName;
    private Logger logger = LoggerFactory.getLogger(BaseElement.class);
    public Actions action = new Actions(DriverFactory.driver);

    public BaseElement(By elementBy, String loggerName) {
        this.elementBy = elementBy;
        this.loggerName = loggerName;
    }

    protected WebElement findElement() {
        return DriverFactory.driver.findElement(elementBy);
    }

    public boolean isDisplay() {
        logger.info("Display {}", loggerName);
        return findElement().isDisplayed();
    }

    public void click() {
        logger.info("Clicked {}", loggerName);
        findElement().click();
    }

    public String getText() {
        logger.info("{} text get: {}", loggerName, findElement().getText());
        return findElement().getText();
    }

    public void actionMouse(int x, int y) {
        logger.info("Move cursor to {}", loggerName);
        action.moveToElement(findElement()).build().perform();
    }

    public String getAttr(String anyAttr) {
        logger.info("{} attribute — {}", loggerName, findElement().getAttribute(anyAttr));
        return findElement().getAttribute(anyAttr);
    }

    public void pushKeyRight() {
        logger.info("Push right");
        findElement().sendKeys(Keys.ARROW_RIGHT);
    }

    public void switchToIFrame() {
        logger.info("Select {}", loggerName);
        DriverFactory.driver.switchTo().frame(findElement());
    }

    public void defaultContent() {
        logger.info("Exit — {}", loggerName);
        DriverFactory.driver.switchTo().defaultContent();
    }

    public String getCssValue(String anyCssValue) {
        logger.info("Get CSS value — {}", loggerName);
        return findElement().getCssValue(anyCssValue);
    }

}
