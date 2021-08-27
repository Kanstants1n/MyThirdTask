package AnyTests;

import Utils.AnyUtils;
import Utils.DriverUtils;
import Utils.UnchangeableValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testAlertPage extends ConfigurationForTests {

    @Test
    public void testJavaScriptAlerts() {
        DriverUtils.goToUrl(urlFirstPage);
        Assert.assertTrue(alertPageForm.alertPageIsDisplay(), UnchangeableValue.alertPageIsNotOpen);
        alertPageForm.clickJsAlertButton();
        Assert.assertEquals(alertPageForm.getJSAlertText(), UnchangeableValue.jsAlertText, UnchangeableValue.messageIfValueNotEqual);
        alertPageForm.clickAcceptInAlert();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableValue.resultTextJsAlert, UnchangeableValue.messageIfValueNotEqual);
        alertPageForm.clickJsConfirmButton();
        Assert.assertEquals(alertPageForm.getJSAlertText(), UnchangeableValue.jsConfirmText, UnchangeableValue.messageIfValueNotEqual);
        alertPageForm.clickAcceptInAlert();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableValue.resultTextJsConfirm, UnchangeableValue.messageIfValueNotEqual);
        alertPageForm.clickJsPromptButton();
        Assert.assertEquals(alertPageForm.getJSAlertText(), UnchangeableValue.jsPromptText, UnchangeableValue.messageIfValueNotEqual);
        alertPageForm.sendJSPromptText();
        alertPageForm.clickAcceptInAlert();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableValue.resultTextJsPrompt + AnyUtils.randomString, UnchangeableValue.messageIfValueNotEqual);
    }
}
