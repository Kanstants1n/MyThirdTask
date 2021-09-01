package AnyPage;

import AnyElements.BaseForm;
import AnyElements.Button;
import AnyElements.TextField;
import Utils.DriverUtils;
import Utils.WaitUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class AlertPageForm{
    public String randomString = RandomStringUtils.randomAlphabetic(10);


    private By alertPage = By.xpath("//div[@id='content']//h3[text()='JavaScript Alerts']");
    private By jsAlert = By.xpath("//div[@id='content']//button[@onclick='jsAlert()']");
    private By jsConfirm = By.xpath("//div[@id='content']//button[@onclick='jsConfirm()']");
    private By jsPrompt = By.xpath("//div[@id='content']//button[@onclick='jsPrompt()']");
    private By alertResult = By.xpath("//p[@id='result']");

    private TextField alertPageIsOpen = new TextField(alertPage, "Alert Page");
    private TextField resultTextAlert = new TextField(alertResult, "Result text");
    private Button jsAlertButton = new Button(jsAlert, "JS Alert Button");
    private Button jsConfirmButton = new Button(jsConfirm, "JS Confirm Button");
    private Button jsPromptButton = new Button(jsPrompt, "JS Prompt Button");
    private BaseForm alertPageIsDisplayed = new BaseForm(alertPageIsOpen, "Alert page is Displayed");

    public boolean alertPageIsDisplay() {
        WaitUtils.waitElement(alertPage);
        return alertPageIsDisplayed.isDisplayed();
    }

    public void clickJsAlertButton() {
        WaitUtils.waitElement(jsAlert);
        jsAlertButton.jsClick();
    }

    public void clickJsConfirmButton() {
        WaitUtils.waitElement(jsConfirm);
        jsConfirmButton.jsClick();
    }

    public void clickJsPromptButton() {
        WaitUtils.waitElement(jsPrompt);
        jsPromptButton.jsClick();
    }

    public void clickAcceptInAlert() {
        DriverUtils.workThisAlertsAccept();
    }

    public String getJSAlertText() {
        return DriverUtils.workThisAlertsText();
    }

    public void sendJSPromptText() {
        DriverUtils.sendAlertText(randomString);
    }

    public String getResultText() {
        WaitUtils.waitElement(alertResult);
        return this.resultTextAlert.getText();
    }
}
