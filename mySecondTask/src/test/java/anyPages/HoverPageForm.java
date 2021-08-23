package anyPages;

import BaseElements.BaseForm;
import BaseElements.MouseAction;
import BaseElements.SomeButton;
import BaseElements.TextField;
import org.openqa.selenium.By;

public class HoverPageForm extends BaseForm {

    private By hoverPage = By.xpath("//div[@class='example']//h3[text()='Hovers']");
    private String anyXPath = "//div[@class='figure'][";
    public boolean hoverPageIsOpen() {
        waitForOpen(hoverPage);
        return isDisplayed(hoverPage, "Hover page");
    }

    public void moveMouseForAnyLabel(String userNumber) {
        By hoverUsers = By.xpath(anyXPath + userNumber + "]");
        MouseAction hoverMouseUser = new MouseAction(hoverUsers, "User" + userNumber);
        waitForOpen(hoverUsers);
        hoverMouseUser.actionMouse();
    }

    public String verificationUserName(String userNumber) {
        By hoverUsersName = By.xpath(anyXPath + userNumber + "]//h5");
        TextField getUserName = new TextField(hoverUsersName, "User" + userNumber);
        waitForOpen(hoverUsersName);
        return getUserName.getText();
    }

    public boolean userLinkIsDisplay(String userNumber) {
        By hoverLinks = By.xpath(anyXPath + userNumber + "]//a");
        waitForOpen(hoverLinks);
        return isDisplayed(hoverLinks, "Link to profile user" + userNumber + " displayed");
    }

    public void clickUserLink(String userNumber) {
        By hoverLinks = By.xpath(anyXPath + userNumber + "]//a");
        SomeButton clickUserLinkButton = new SomeButton(hoverLinks, "User" + userNumber);
        waitForOpen(hoverLinks);
        clickUserLinkButton.click();
    }

    public String getHrefAttr(String userNumber) {
        By hoverLinks = By.xpath(anyXPath + userNumber + "]//a");
        SomeButton getUserAttrHref = new SomeButton(hoverLinks, "User" + userNumber);
        return getUserAttrHref.getAttr("href");

    }


}
