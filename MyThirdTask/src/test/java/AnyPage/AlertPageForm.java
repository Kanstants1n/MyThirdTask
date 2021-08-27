package AnyPage;

import AnyElements.BaseForm;
import AnyElements.SomeButton;
import AnyElements.TextField;
import Utils.AnyUtils;
import Utils.DriverUtils;
import org.openqa.selenium.By;

public class AlertPageForm extends BaseForm {
    private By alertPage = By.xpath("//div[@id='content']//h3[text()='JavaScript Alerts']");
    private By jsAlert = By.xpath("//div[@id='content']//button[@onclick='jsAlert()']");
    private By jsConfirm = By.xpath("//div[@id='content']//button[@onclick='jsConfirm()']");
    private By jsPrompt = By.xpath("//div[@id='content']//button[@onclick='jsPrompt()']");
    private By alertResult = By.xpath("//p[@id='result']");
    private TextField resultTextAlert = new TextField(this.alertResult, "Result text");
    private SomeButton jsAlertButton = new SomeButton(this.jsAlert, "JS Alert Button");
    private SomeButton jsConfirmButton = new SomeButton(this.jsConfirm, "JS Confirm Button");
    private SomeButton jsPromptButton = new SomeButton(this.jsPrompt, "JS Prompt Button");

    public boolean alertPageIsDisplay() {
        waitForOpen(alertPage, "alertPage");
        return isDisplayed(alertPage, "Alert Page");
    }

    public void clickJsAlertButton() {
        waitForOpen(jsAlert, "JS Alert Button");
        jsAlertButton.jsClick();
    }

    public void clickJsConfirmButton() {
        waitForOpen(jsConfirm, "JS Confirm button");
        jsConfirmButton.jsClick();
    }

    public void clickJsPromptButton() {
        waitForOpen(jsPrompt, "JS Prompt button");
        jsPromptButton.jsClick();
    }

    public void clickAcceptInAlert() {
        DriverUtils.workThisAlertsAccept();
    }

    public String getJSAlertText() {
        return DriverUtils.workThisAlertsText();
    }

    public void sendJSPromptText() {
        DriverUtils.sendAlertText(AnyUtils.randomString);
    }

    public String getResultText() {
        this.waitForOpen(this.alertResult, "alertResult");
        return this.resultTextAlert.getText();
    }
}
