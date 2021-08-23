package tests;

import Utils.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends AuthorizationAndAlertsBaseTest{

    @Test
    public void testSliderPage(){
        DriverUtils.goToUrl(protocol + host + pageTree);
        Assert.assertTrue(sliderPageForm.sliderPageIsOpen(), "Page not open!");
        sliderPageForm.changeSliderValue();
        Assert.assertEquals(sliderPageForm.getResultValue(), sliderPageForm.resultPushAnyKey());
    }
}
