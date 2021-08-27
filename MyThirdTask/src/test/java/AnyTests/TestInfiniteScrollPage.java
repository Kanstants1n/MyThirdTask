package AnyTests;

import Utils.DriverUtils;
import Utils.UnchangeableValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInfiniteScrollPage extends ConfigurationForTests {

    @Test
    public void testInfiniteScroll() {
        DriverUtils.goToUrl(urlSecondPage);
        Assert.assertTrue(infiniteScrollPageForm.InfiniteScrollPageIsOpen(), UnchangeableValue.infiniteScrollPageNotOpen);
        infiniteScrollPageForm.scrollToParagraphWeNeed();
        Assert.assertEquals(infiniteScrollPageForm.getDivNumber(), engineersAge, UnchangeableValue.numberDivMessageError);
    }
}
