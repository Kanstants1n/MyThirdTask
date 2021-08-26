package AnyPage;

import AnyElements.BaseForm;
import AnyElements.SomeButton;
import Utils.ConfigManager;
import Utils.DriverFactory;
import Utils.JavaScriptActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class InfiniteScrollPageForm extends BaseForm {

    private Integer engineersAge = Integer.parseInt(ConfigManager.getProperties("engineersAge"));
    private By infinitePageOpen = By.xpath("//div[@Class = 'example']");
    private By paragraphInInfiniteScroll = By.xpath("//div[@Class = 'jscroll-inner']//div");
    private By inInfiniteScroll = By.xpath("//div[@Class = 'jscroll-inner']//div[1]");

    private SomeButton paragraphWeNeed = new SomeButton(paragraphInInfiniteScroll, "Scroll to paragraph");

    public boolean InfiniteScrollPageIsOpen() {
        waitForOpen(infinitePageOpen, "infinitePageOpen");
        return isDisplayed(infinitePageOpen, "Infinite Scroll page is open");
    }

    public void scrollToParagraphWeNeed() {
        for (int i = 2; i < engineersAge; i++) {
            By divElement = By.xpath("//div[@Class = 'jscroll-inner']//div[" + i + "]");
            waitForOpen(divElement, "Div Element " + i);
            JavaScriptActions.scrollToSomeElement();
        }
    }

}
