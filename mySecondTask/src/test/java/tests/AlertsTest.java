package tests;

import Utils.AnyUtils;
import Utils.DriverUtils;
import Utils.UnchangeableClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends AuthorizationAndAlertsBaseTest {

    @Test (description = "This test check Alerts!")
    public void testAlertsWindows() {
        DriverUtils.goToUrl(protocol + host + pageTwo);
        Assert.assertTrue(alertPageForm.alertPageIsOpen(), UnchangeableClass.alertPageIsNotOpen);
        alertPageForm.clickJSAlertButton();
        Assert.assertEquals(alertPageForm.jsAlertText(), UnchangeableClass.jsAlertText);
        alertPageForm.getJSAlertButtonText();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableClass.resultTextJsAlert);
        alertPageForm.clickJSConfirmButton();
        Assert.assertEquals(alertPageForm.jsAlertText(), UnchangeableClass.jsConfirmText);
        alertPageForm.getJSAlertButtonText();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableClass.resultTextJsConfirm);
        alertPageForm.clickJSjsPromptButton();
        Assert.assertEquals(alertPageForm.jsAlertText(), UnchangeableClass.jsPromptText);
        alertPageForm.alertPromptTextSend(AnyUtils.randomString);
        alertPageForm.getJSAlertButtonText();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableClass.resultTextJsPrompt + AnyUtils.randomString);
    }
}
