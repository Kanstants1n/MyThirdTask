package tests;

import Utils.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends AuthorizationAndAlertsBaseTest {

    @Test (description = "This test check Alerts!")
    public void testAlertsWindows() {
        driverUtils.goToUrl(protocol + host + pageTwo);
        alertPageForm.alertPageIsOpen();
        Assert.assertTrue(alertPageForm.alertPageIsOpen(), "Alert page is not open!");
        alertPageForm.clickJSAlert();
        alertPageForm.jsAlertText();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS Alert");
        alertPageForm.jsAlertButton();
        alertPageForm.getResultText();
        Assert.assertEquals(alertPageForm.getResultText(), "You successfully clicked an alert");
        alertPageForm.clickJSConfirm();
        alertPageForm.jsAlertText();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS Confirm");
        alertPageForm.jsAlertButton();
        alertPageForm.getResultText();
        Assert.assertEquals(alertPageForm.getResultText(), "You clicked: Ok");
        alertPageForm.clickJSPrompt();
        alertPageForm.jsAlertText();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS prompt");
        alertPageForm.alertPromptTextSend(promptText);
        alertPageForm.jsAlertButton();
        alertPageForm.getResultText();
        Assert.assertEquals(alertPageForm.getResultText(), "You entered: " + promptText);
    }
}
