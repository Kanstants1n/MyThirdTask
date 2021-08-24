package tests;

import Utils.DriverUtils;
import Utils.UnchangeableClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends AuthorizationAndAlertsBaseTest{

    @Test
    public void testSliderPage(){
        DriverUtils.goToUrl(protocol + host + pageTree);
        Assert.assertTrue(sliderPageForm.sliderPageIsOpen(), UnchangeableClass.sliderPageIsNotOpen);
        sliderPageForm.changeSliderValue();
        Assert.assertEquals(sliderPageForm.getResultValue(), sliderPageForm.resultPushAnyKey());
    }
}
