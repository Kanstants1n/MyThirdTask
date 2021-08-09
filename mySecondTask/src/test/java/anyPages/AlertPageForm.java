package anyPages;

import BaseElements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPageForm extends BaseElement {
    public AlertPageForm(WebDriver driver) {
        super(driver);
    }

    private By alertPage = By.xpath("//div[@id='content']//h3[text()='JavaScript Alerts']");
    private By jsAlert = By.xpath("//div[@id='content']//button[@onclick='jsAlert()']");
    private By jsConfirm = By.xpath("//div[@id='content']//button[@onclick='jsConfirm()']");
    private By jsPrompt = By.xpath("//div[@id='content']//button[@onclick='jsPrompt()']");
    private By alertResult = By.xpath("//p[@id='result']");

    public boolean alertPageIsOpen() {
        waitVisibility(alertPage);
        elementIsDisplayed(alertPage);
        return true;
    }

    public void clickJSAlert() {
        waitVisibility(jsAlert);
        clickElement(jsAlert);
    }

    public void clickJSConfirm() {
        waitVisibility(jsConfirm);
        clickElement(jsConfirm);
    }

    public void clickJSPrompt() {
        waitVisibility(jsPrompt);
        clickElement(jsPrompt);
    }

    public String jsAlertText() {
        workThisAlertsText();
        return workThisAlertsText();
    }

    public void jsAlertButtom() {
        workThisAlertsAccept();
    }

    public String getResulText() {
        String resultText = getText(alertResult);
        return resultText;
    }

    public void alertPromptTextSend(String anyText) {
        sendAlertText(anyText);
    }

}
