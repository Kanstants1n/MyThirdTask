package tests;

import BaseElements.BaseForm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthorizationTest extends AuthorizationAndAlertsBaseTest {

    @Test (description = "This test check Base Authorization!")
    public void testBasicAuthorization() {
        utils.goTo("https://" + userName + ":" + passUser + "@" + host + pageOne);
        baseForm.congPageIsDisplayed();
        Assert.assertTrue(baseForm.congPageIsDisplayed(), "Basic Authorization failed");
    }
}
