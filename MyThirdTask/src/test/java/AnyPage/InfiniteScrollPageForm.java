package AnyPage;

import AnyElements.BaseForm;
import AnyElements.SomeButton;
import AnyElements.TextField;
import Utils.ConfigManager;
import org.openqa.selenium.By;

public class InfiniteScrollPageForm extends BaseForm {

    private Integer engineersAge = Integer.parseInt(ConfigManager.getProperties("engineersAge"));
    private By infinitePageOpen = By.xpath("//div[@Class = 'example']");
    private By allDiv = By.xpath("//div[@Class = 'jscroll-inner']//div");

    private TextField numberAllDiv = new TextField(allDiv, "All paragraph");

    public boolean InfiniteScrollPageIsOpen() {
        waitForOpen(infinitePageOpen, "infinitePageOpen");
        return isDisplayed(infinitePageOpen, "Infinite Scroll page is open");
    }

    public void scrollToParagraphWeNeed() {
        for (int divNumber = 1; divNumber < engineersAge - 1; divNumber++) {
            By infiniteScroll = By.xpath("//div[@Class = 'jscroll-inner']//div[" + divNumber + "]");
            SomeButton scrollToParagraph = new SomeButton(infiniteScroll, "Paragraph " + divNumber);
            waitForOpen(infiniteScroll, "infiniteScroll" + divNumber);
            scrollToParagraph.scrollTo();

        }
    }

    public String getDivNumber() {
        return Integer.toString(numberAllDiv.numberElements());
    }

}
