package AnyTests;

import Utils.DriverUtils;
import Utils.UnchangeableValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlertPage extends BaseTest {

    @Test
    public void testJavaScriptAlerts() {
        DriverUtils.goToUrl(urlFirstPage);
        Assert.assertTrue(alertPageForm.alertPageIsDisplay(), "Alert page is not open!");
        alertPageForm.clickJsAlertButton();
        Assert.assertEquals(alertPageForm.getJSAlertText(), UnchangeableValue.jsAlertText, "Value not Equal");
        alertPageForm.clickAcceptInAlert();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableValue.resultTextJsAlert, "Value not Equal");
        alertPageForm.clickJsConfirmButton();
        Assert.assertEquals(alertPageForm.getJSAlertText(), UnchangeableValue.jsConfirmText, "Value not Equal");
        alertPageForm.clickAcceptInAlert();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableValue.resultTextJsConfirm, "Value not Equal");
        alertPageForm.clickJsPromptButton();
        Assert.assertEquals(alertPageForm.getJSAlertText(), UnchangeableValue.jsPromptText, "Value not Equal");
        alertPageForm.sendJSPromptText();
        alertPageForm.clickAcceptInAlert();
        Assert.assertEquals(alertPageForm.getResultText(), UnchangeableValue.resultTextJsPrompt + alertPageForm.randomString, "Value not Equal");
    }
}
