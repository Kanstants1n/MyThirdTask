package tests;

import Utils.DriverUtils;
import Utils.UnchangeableClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HoverTest extends AuthorizationAndAlertsBaseTest{
    @DataProvider(name = "hoverUsers")
    public static Object[][] dbData(){
        return new Object[][]{
                {"user", "1"},
                {"user", "3"}
        };
    }


    @Test (dataProvider = "hoverUsers")
    public void testHoverPage(String userName, String userNumber){
        DriverUtils.goToUrl(protocol + host + pageFour);
        Assert.assertTrue(hoverPageForm.hoverPageIsOpen(), UnchangeableClass.hoverPageIsNotOpen);
        hoverPageForm.moveMouseForAnyLabel(userNumber);
        Assert.assertEquals(hoverPageForm.verificationUserName(userNumber), UnchangeableClass.hoverUserName + userName + userNumber);
        Assert.assertTrue(hoverPageForm.userLinkIsDisplay(userNumber), UnchangeableClass.hoverUserLink);
        String hrefUser = hoverPageForm.getHrefAttr(userNumber);
        hoverPageForm.clickUserLink(userNumber);
        Assert.assertEquals(DriverUtils.getUrl(), hrefUser);
        DriverUtils.navigatePreviousPage();
        Assert.assertTrue(hoverPageForm.hoverPageIsOpen(), UnchangeableClass.hoverPageIsNotOpen);

    }
}
