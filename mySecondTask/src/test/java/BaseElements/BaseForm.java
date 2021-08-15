package BaseElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseForm {
    private String loggerName;
    private BaseElement baseElement = new BaseElement();

    public boolean isDisplayed(By elementBy) {
        baseElement.waitVisibility(elementBy);
        return baseElement.elementIsDisplayed(elementBy);
    }

    public void click(By elementBy) {
        baseElement.waitVisibility(elementBy);
        baseElement.clickElement(elementBy);
    }
    public String getSomeThingText (By elementBy){
        baseElement.waitVisibility(elementBy);
        return baseElement.getText(elementBy);
    }

}
