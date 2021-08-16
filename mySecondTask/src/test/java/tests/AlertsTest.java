package tests;

import Utils.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends AuthorizationAndAlertsBaseTest {

    @Test (description = "This test check Alerts!")
    public void testAlertsWindows() {
        driverUtils.goToUrl(protocol + host + pageTwo);
        Assert.assertTrue(alertPageForm.alertPageIsOpen(), "Alert page is not open!");
        alertPageForm.clickJSAlert();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS Alert");
        alertPageForm.jsAlertButton();
        Assert.assertEquals(alertPageForm.getResultText(), "You successfully clicked an alert");
        alertPageForm.clickJSConfirm();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS Confirm");
        alertPageForm.jsAlertButton();
        Assert.assertEquals(alertPageForm.getResultText(), "You clicked: Ok");
        alertPageForm.clickJSPrompt();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS prompt");
        alertPageForm.alertPromptTextSend(promptText);
        alertPageForm.jsAlertButton();
        Assert.assertEquals(alertPageForm.getResultText(), "You entered: " + promptText);
    }
}
