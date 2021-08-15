package tests;

import Utils.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthorizationTest extends AuthorizationAndAlertsBaseTest {

    @Test (description = "This test check Base Authorization!")
    public void testBasicAuthorization() {
        driverUtils.goToUrl(protocol + userName + ":" + passUser + "@" + host + pageOne);
        basicAuthorizationPage.congratulationsPageIsDisplayed();
        Assert.assertTrue(basicAuthorizationPage.congratulationsPageIsDisplayed(), "Basic Authorization failed");
    }
}
