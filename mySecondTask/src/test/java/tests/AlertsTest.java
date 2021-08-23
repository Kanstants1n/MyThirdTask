package tests;

import Utils.AnyUtils;
import Utils.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends AuthorizationAndAlertsBaseTest {

    @Test (description = "This test check Alerts!")
    public void testAlertsWindows() {
        DriverUtils.goToUrl(protocol + host + pageTwo);
        Assert.assertTrue(alertPageForm.alertPageIsOpen(), "Alert page is not open!");
        alertPageForm.clickJSAlertButton();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS Alert");
        alertPageForm.getJSAlertButtonText();
        Assert.assertEquals(alertPageForm.getResultText(), "You successfully clicked an alert");
        alertPageForm.clickJSConfirmButton();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS Confirm");
        alertPageForm.getJSAlertButtonText();
        Assert.assertEquals(alertPageForm.getResultText(), "You clicked: Ok");
        alertPageForm.clickJSjsPromptButton();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS prompt");
        alertPageForm.alertPromptTextSend(AnyUtils.randomString);
        alertPageForm.getJSAlertButtonText();
        Assert.assertEquals(alertPageForm.getResultText(), "You entered: " + AnyUtils.randomString);
    }
}
