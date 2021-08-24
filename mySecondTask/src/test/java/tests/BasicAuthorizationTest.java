package tests;

import Utils.DriverUtils;
import Utils.UnchangeableClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthorizationTest extends AuthorizationAndAlertsBaseTest {

    @Test (description = "This test check Base Authorization!")
    public void testBasicAuthorization() {
        DriverUtils.goToUrl(protocol + userName + ":" + passUser + "@" + host + pageOne);
        Assert.assertTrue(basicAuthorizationPage.congratulationsPageIsDisplayed(), UnchangeableClass.basicAuth);
    }
}
