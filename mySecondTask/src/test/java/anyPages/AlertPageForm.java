package anyPages;

import BaseElements.BaseForm;
import BaseElements.SomeButton;
import BaseElements.TextField;
import Utils.DriverUtils;
import org.openqa.selenium.By;

public class AlertPageForm extends BaseForm {

    private By alertPage = By.xpath("//div[@id='content']//h3[text()='JavaScript Alerts']");
    private By jsAlert = By.xpath("//div[@id='content']//button[@onclick='jsAlert()']");
    private By jsConfirm = By.xpath("//div[@id='content']//button[@onclick='jsConfirm()']");
    private By jsPrompt = By.xpath("//div[@id='content']//button[@onclick='jsPrompt()']");
    private By alertResult = By.xpath("//p[@id='result']");

    private SomeButton jsAlertButton = new SomeButton(jsAlert, "JS Alert Button: ");
    private SomeButton jsConfirmButton = new SomeButton(jsConfirm, "JS Confirm Button: ");
    private SomeButton jsPromptButton = new SomeButton(jsPrompt, "JS Prompt Button: ");
    private TextField getResultText = new TextField(alertResult, "Result alert message: ");


    public boolean alertPageIsOpen() {
        waitForOpen(alertPage);
        return isDisplayed(alertPage, "Alert page");
    }

    public void clickJSAlertButton() {
        waitForOpen(jsAlert);
        jsAlertButton.click();
    }

    public void clickJSConfirmButton() {
        waitForOpen(jsConfirm);
        jsConfirmButton.click();
    }

    public void clickJSjsPromptButton() {
        waitForOpen(jsPrompt);
        jsPromptButton.click();
    }

    public String jsAlertText() {
        return DriverUtils.workThisAlertsText();
    }

    public void getJSAlertButtonText() {
        DriverUtils.workThisAlertsAccept();
    }

    public String getResultText() {
        waitForOpen(alertResult);
        return getResultText.getText();
    }

    public void alertPromptTextSend(String anyText) {
        DriverUtils.sendAlertText(anyText);
    }

}
