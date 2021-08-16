package BaseElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseForm {
    private String loggerName;
    private BaseElement baseElement = new BaseElement();
    private Logger logger = LoggerFactory.getLogger(BaseForm.class);



    public boolean isDisplayed(By elementBy) {
        logger.info("Page element is display");
        baseElement.waitVisibility(elementBy);
        return baseElement.elementIsDisplayed(elementBy);
    }

    public void click(By elementBy) {
        baseElement.waitVisibility(elementBy);
        baseElement.clickElement(elementBy);
        logger.info("Element clicked");
    }
    public String getSomeThingText (By elementBy){
        baseElement.waitVisibility(elementBy);
        logger.info("Something text: {}", baseElement.getText(elementBy));
        return baseElement.getText(elementBy);
    }

}
