package tests;

import Utils.DriverUtils;
import Utils.UnchangeableClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFramePage extends AuthorizationAndAlertsBaseTest{

    @Test
    public void testIFramePage(){
        DriverUtils.goToUrl(protocol + host + pageFive);
        Assert.assertTrue(iFramePageForm.iFramePageIsOpen(), UnchangeableClass.iFramePageIsNotOpen);
        iFramePageForm.clickAlignLeftButton()
                        .switchToFrame();
        Assert.assertEquals(iFramePageForm.verifyTextAlign(), UnchangeableClass.iFrameVerifyTextAlign);
        iFramePageForm.pushKeySelectFirstHalfOfTextSymbols()
                        .presKeySelectFirstHalfOfTextSymbols()
                        .exitFrameContent()
                        .clickFormatButton()
                        .clickFormatSizeButton()
                        .clickSizeButton()
                        .switchToFrame();
        Assert.assertEquals(iFramePageForm.verifyCSSFont(), UnchangeableClass.iFrameVerifyCSSFont);
        Assert.assertEquals(iFramePageForm.stringSpanLength(), iFramePageForm.stringLength()/2);
        iFramePageForm.exitFrameContent()
                        .clickFileButton()
                        .clickNewDocumentButton()
                        .switchToFrame();
        Assert.assertEquals(iFramePageForm.getTextInFrame(), UnchangeableClass.iFrameVerifyTextInFrame);
        Assert.assertEquals(iFramePageForm.verifyAllCssValue(), UnchangeableClass.iFrameVerifyCssValue);
    }
}
