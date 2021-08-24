package tests;

import Utils.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFramePage extends AuthorizationAndAlertsBaseTest{

    @Test
    public void testIFramePage(){
        DriverUtils.goToUrl(protocol + host + pageFive);
        Assert.assertTrue(iFramePageForm.iFramePageIsOpen(), "IFrame page not open");
        iFramePageForm.clickAlignLeftButton()
                        .switchToFrame();
        Assert.assertEquals(iFramePageForm.verifyTextAlign(), alignText);
        iFramePageForm.pushKeySelectFirstHalfOfTextSymbols()
                        .presKeySelectFirstHalfOfTextSymbols()
                        .exitFrameContent()
                        .clickFormatButton()
                        .clickFormatSizeButton()
                        .clickSizeButton()
                        .switchToFrame();
        Assert.assertEquals(iFramePageForm.verifyCSSFont(), "10.6667px");
        Assert.assertEquals(iFramePageForm.stringSpanLength(), iFramePageForm.stringLength()/2);
        iFramePageForm.exitFrameContent()
                        .clickFileButton()
                        .clickNewDocumentButton()
                        .switchToFrame();
        Assert.assertEquals(iFramePageForm.getTextInFrame(), "");
        Assert.assertEquals(iFramePageForm.verifyAllCssValue(), "start");
    }
}
