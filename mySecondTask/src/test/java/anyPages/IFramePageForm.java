package anyPages;

import BaseElements.BaseForm;
import BaseElements.SomeButton;
import BaseElements.TextField;
import org.openqa.selenium.By;

public class IFramePageForm extends BaseForm {

    private By iFramePage = By.xpath("//div[@class = 'tox-editor-container']");
    private By iFrame = By.xpath("//iframe[@id = 'mce_0_ifr']");
    private By alignLeft = By.xpath("//button[@title = 'Align left']");
    private By iFrameTextBody = By.xpath("//body[@id = 'tinymce']//p");
    private By formatButton = By.xpath("//button[(contains(@class, 'tox-mbtn--select'))]//span[text()='Format']");
    private By fontSizeButton = By.xpath("//div[@title = 'Font sizes']");
    private By sizeButton = By.xpath("//div[@class= 'tox-collection__group']//div[@title = '8pt']");

    private SomeButton alignLeftButton = new SomeButton(alignLeft, "Align Left Button");
    private SomeButton selectIFrame = new SomeButton(iFrame, "IFrame area");
    private TextField getCssAttrText = new TextField(iFrameTextBody, "Text align");

    protected void switchToFrame(){
        waitForOpen(iFrame);
        selectIFrame.switchToIFrame();
    }
    public boolean iFramePageIsOpen() {
        waitForOpen(iFramePage);
        return isDisplayed(iFramePage, "IFrame page");
    }
    public void selectIFrame (){
        waitForOpen(iFrame);
        selectIFrame.click();
    }
    public void clickAlignLeftButton(){
        waitForOpen(alignLeft);
        alignLeftButton.click();
    }
    public String verifyTextAlign(){
        switchToFrame();
        waitForOpen(iFrameTextBody);
        return getCssAttrText.getCssValue("text-align");
    }

}
