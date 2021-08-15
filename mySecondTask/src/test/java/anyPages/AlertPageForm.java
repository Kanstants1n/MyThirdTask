package anyPages;

import BaseElements.BaseForm;
import Utils.DriverUtils;
import org.openqa.selenium.By;

public class AlertPageForm extends BaseForm {

    private DriverUtils driverUtils = new DriverUtils();

    private By alertPage = By.xpath("//div[@id='content']//h3[text()='JavaScript Alerts']");
    private By jsAlert = By.xpath("//div[@id='content']//button[@onclick='jsAlert()']");
    private By jsConfirm = By.xpath("//div[@id='content']//button[@onclick='jsConfirm()']");
    private By jsPrompt = By.xpath("//div[@id='content']//button[@onclick='jsPrompt()']");
    private By alertResult = By.xpath("//p[@id='result']");



    public boolean alertPageIsOpen() {
        return isDisplayed(alertPage);
    }

    public void clickJSAlert() {
        click(jsAlert);
    }

    public void clickJSConfirm() {
        click(jsConfirm);
    }

    public void clickJSPrompt() {
        click(jsPrompt);
    }

    public String jsAlertText() {
        return driverUtils.workThisAlertsText();
    }

    public void jsAlertButton() {
        driverUtils.workThisAlertsAccept();
    }

    public String getResultText() {
        return getSomeThingText(alertResult);
    }

    public void alertPromptTextSend(String anyText) {
        driverUtils.sendAlertText(anyText);
    }

}
