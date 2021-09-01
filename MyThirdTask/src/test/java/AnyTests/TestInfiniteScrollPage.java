package AnyTests;

import Utils.DriverUtils;
import Utils.UnchangeableValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInfiniteScrollPage extends BaseTest {

    @Test
    public void testInfiniteScroll() {
        DriverUtils.goToUrl(urlSecondPage);
        Assert.assertTrue(infiniteScrollPageForm.InfiniteScrollPageIsOpen(), "Infinite Scroll page is not open!");
        infiniteScrollPageForm.scrollToParagraphWeNeed();
        Assert.assertEquals(infiniteScrollPageForm.getDivNumber(), engineersAge, "The number of div does not match");
    }
}
