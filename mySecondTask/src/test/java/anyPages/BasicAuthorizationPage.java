package anyPages;

import BaseElements.BaseForm;
import org.openqa.selenium.By;

public class BasicAuthorizationPage extends BaseForm{

    private By basicAuth = By.xpath("//div[@id='content']//p[(contains(text(), 'Congratulations! You must have the proper credentials.'))]");

    public boolean congratulationsPageIsDisplayed(){
        return isDisplayed(basicAuth, "Congratulation page");
    }
}
