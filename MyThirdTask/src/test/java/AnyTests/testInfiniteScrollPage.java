package AnyTests;

import Utils.DriverUtils;
import Utils.UnchangeableValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testInfiniteScrollPage extends ConfigurationForTests{

    @Test
    public void testInfiniteScroll() throws InterruptedException {
        DriverUtils.goToUrl(urlSecondPage);
        Assert.assertTrue(infiniteScrollPageForm.InfiniteScrollPageIsOpen(), UnchangeableValue.infiniteScrollPageNotOpen);
        infiniteScrollPageForm.scrollToParagraphWeNeed();
        Thread.sleep(20000);
    }
}
