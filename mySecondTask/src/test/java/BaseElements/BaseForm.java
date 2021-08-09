package BaseElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseForm extends BaseElement {

    public BaseForm(WebDriver driver) {
        super(driver);
    }

    private String loggerName;
    private By basicAuth = By.xpath("//div[@id='content']//p[(contains(text(), 'Congratulations! You must have the proper credentials.'))]");



    public boolean congPageIsDisplayed() {
        waitVisibility(basicAuth);
        elementIsDisplayed(basicAuth);
        return true;
    }

}
