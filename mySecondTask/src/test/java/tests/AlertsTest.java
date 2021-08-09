package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends AuthorizationAndAlertsBaseTest {

    @Test (description = "This test check Alerts!")
    public void testAlertsWindows() {
        utils.goTo("https://" + host + pageTwo);
        alertPageForm.alertPageIsOpen();
        Assert.assertTrue(alertPageForm.alertPageIsOpen(), "Alert page is not open!");
        alertPageForm.clickJSAlert();
        alertPageForm.jsAlertText();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS Alert");
        alertPageForm.jsAlertButtom();
        alertPageForm.getResulText();
        Assert.assertEquals(alertPageForm.getResulText(), "You successfully clicked an alert");
        alertPageForm.clickJSConfirm();
        alertPageForm.jsAlertText();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS Confirm");
        alertPageForm.jsAlertButtom();
        alertPageForm.getResulText();
        Assert.assertEquals(alertPageForm.getResulText(), "You clicked: Ok");
        alertPageForm.clickJSPrompt();
        alertPageForm.jsAlertText();
        Assert.assertEquals(alertPageForm.jsAlertText(), "I am a JS prompt");
        alertPageForm.alertPromptTextSend(promptText);
        alertPageForm.jsAlertButtom();
        alertPageForm.getResulText();
        Assert.assertEquals(alertPageForm.getResulText(), "You entered: " + promptText);
    }
}
