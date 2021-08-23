package tests;

import Utils.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFramePage extends AuthorizationAndAlertsBaseTest{

    @Test
    public void testIFramePage(){
        DriverUtils.goToUrl(protocol + host + pageFive);
        Assert.assertTrue(iFramePageForm.iFramePageIsOpen(), "IFrame page not open");
        iFramePageForm.selectIFrame();
        iFramePageForm.clickAlignLeftButton();
        Assert.assertEquals(iFramePageForm.verifyTextAlign(), alignText);
    }
}
