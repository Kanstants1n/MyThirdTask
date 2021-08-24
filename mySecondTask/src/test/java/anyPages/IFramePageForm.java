package anyPages;

import BaseElements.BaseForm;
import BaseElements.KeyActions;
import BaseElements.SomeButton;
import BaseElements.TextField;
import Utils.DriverUtils;
import org.openqa.selenium.By;

public class IFramePageForm extends BaseForm {

    private By iFramePage = By.xpath("//div[@class = 'tox-editor-container']");
    private By iFrame = By.xpath("//iframe[@id = 'mce_0_ifr']");
    private By alignLeft = By.xpath("//button[@title = 'Align left']");
    private By iFrameTextBody = By.xpath("//body[@id = 'tinymce']//p");
    private By iFrameTextSpan = By.xpath("//body[@id = 'tinymce']//p//span");
    private By formatButton = By.xpath("//button[(contains(@class, 'tox-mbtn--select'))]//span[text()='Format']");
    private By fontSizeButton = By.xpath("//div[@title = 'Font sizes']");
    private By sizeButton = By.xpath("//div[@class= 'tox-collection__group']//div[@title = '8pt']");
    private By checkSizeText = By.xpath("//body[@id = 'tinymce']//p//span");
    private By fileButton = By.xpath("//button[(contains(@class, 'tox-mbtn--select'))]//span[text()='File']");
    private By newDocumentButton = By.xpath("//div[@class= 'tox-collection__group']//div[@title = 'New document']");

    private SomeButton alignLeftButton = new SomeButton(alignLeft, "Align Left Button");
    private SomeButton selectIFrame = new SomeButton(iFrame, "IFrame area");
    private SomeButton exitFrame = new SomeButton(iFrameTextBody, "IFrame area");
    private TextField getCssAttrText = new TextField(iFrameTextBody, "Text align");
    private TextField getAnyTextInFrame = new TextField(iFrameTextBody, "Text in Frame");
    private TextField getStringLength = new TextField(iFrameTextBody, "Length string");
    private TextField getStringLengthSpan = new TextField(iFrameTextSpan, "Length string");
    private SomeButton clickFormatButton = new SomeButton(formatButton, "Format button");
    private SomeButton clickFormatSizeButton = new SomeButton(fontSizeButton, "Format Size button");
    private SomeButton clickSizeButton = new SomeButton(sizeButton, "Size button");
    private TextField getCSSSizeAttr = new TextField(checkSizeText, "Font size");
    private SomeButton clickFileButton = new SomeButton(fileButton, "File button");
    private SomeButton clickNewDocumentButton = new SomeButton(newDocumentButton, "New document");

    public IFramePageForm switchToFrame() {
        waitForOpen(iFrame);
        selectIFrame.switchToIFrame();
        return this;
    }

    public IFramePageForm exitFrameContent() {
        exitFrame.defaultContent();
        return this;
    }

    public boolean iFramePageIsOpen() {
        waitForOpen(iFramePage);
        return isDisplayed(iFramePage, "IFrame page");
    }

    public IFramePageForm clickAlignLeftButton() {
        waitForOpen(alignLeft);
        alignLeftButton.click();
        return this;
    }

    public String verifyTextAlign() {
        waitForOpen(iFrameTextBody);
        return getCssAttrText.getCssValue("text-align");
    }

    public int stringLength() {
        waitForOpen(iFrameTextBody);
        return getStringLength.lengthString();
    }
    public int stringSpanLength(){
        waitForOpen(iFrameTextSpan);
        return getStringLengthSpan.lengthString();
    }

    public IFramePageForm pushKeySelectFirstHalfOfTextSymbols() {
        DriverUtils.holdShift();
        return this;
    }

    public IFramePageForm presKeySelectFirstHalfOfTextSymbols() {
        DriverUtils.pushArrowRight(stringLength()/2);
        return this;
    }

    public IFramePageForm clickFormatButton() {
        waitForOpen(formatButton);
        clickFormatButton.click();
        return this;
    }

    public IFramePageForm clickFormatSizeButton() {
        waitForOpen(fontSizeButton);
        clickFormatSizeButton.click();
        return this;
    }

    public IFramePageForm clickSizeButton() {
        waitForOpen(sizeButton);
        clickSizeButton.click();
        return this;
    }

    public String verifyCSSFont() {
        waitForOpen(checkSizeText);
        return getCSSSizeAttr.getCssValue("font-size");
    }

    public IFramePageForm clickFileButton() {
        waitForOpen(fileButton);
        clickFileButton.click();
        return this;
    }

    public IFramePageForm clickNewDocumentButton() {
        waitForOpen(newDocumentButton);
        clickNewDocumentButton.click();
        return this;
    }
    public String getTextInFrame(){
        waitForOpen(iFrameTextBody);
        return getAnyTextInFrame.getText();
    }
    public String verifyAllCssValue(){
        return getCssAttrText.getCssValue("text-align");
    }

}
