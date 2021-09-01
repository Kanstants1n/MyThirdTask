package AnyPage;

import AnyElements.BaseForm;
import AnyElements.Button;
import AnyElements.TextField;
import Utils.ConfigManager;
import Utils.WaitUtils;
import org.openqa.selenium.By;

public class InfiniteScrollPageForm{
    private String locatorForScrollBegin = "//div[@Class = 'jscroll-inner']//div[";
    private String locatorForScrollEnd = "]";

    private Integer engineersAge = Integer.parseInt(ConfigManager.getProperties("engineersAge"));
    private By infinitePageOpen = By.xpath("//div[@Class = 'example']");
    private By allDiv = By.xpath("//div[@Class = 'jscroll-inner']//div");
    private TextField numberAllDiv = new TextField(allDiv, "All paragraph");
    private TextField pageIsOpen = new TextField(infinitePageOpen, "Infinite page");
    private BaseForm infinitePageIsOpen = new BaseForm(pageIsOpen, "Infinite page is open");


    public boolean InfiniteScrollPageIsOpen() {
        WaitUtils.waitElement(infinitePageOpen);
        return infinitePageIsOpen.isDisplayed();
    }

    public void scrollToParagraphWeNeed() {
        for (int divNumber = 1; divNumber < engineersAge - 1; divNumber++) {
            By infiniteScroll = By.xpath(locatorForScrollBegin + divNumber + locatorForScrollEnd);
            Button scrollToParagraph = new Button(infiniteScroll, "Paragraph " + divNumber);
            WaitUtils.waitElement(infiniteScroll);
            scrollToParagraph.scrollTo();
        }
    }

    public String getDivNumber() {
        return Integer.toString(numberAllDiv.numberElements());
    }
}
