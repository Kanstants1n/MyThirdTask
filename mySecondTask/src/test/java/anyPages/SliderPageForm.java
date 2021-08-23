package anyPages;

import BaseElements.BaseForm;
import BaseElements.KeyActions;
import BaseElements.TextField;
import Utils.AnyUtils;
import org.openqa.selenium.By;

public class SliderPageForm extends BaseForm {

    private By sliderPage = By.xpath("//div[@class='sliderContainer']");
    private By setSliderValue = By.xpath("//div[@class = 'sliderContainer']//input");
    private By resultSliderValue = By.xpath("//span[@id = 'range']");

    private TextField getResult = new TextField(resultSliderValue, "Result slider value");
    private KeyActions pushKeyToSlide = new KeyActions(setSliderValue, "Slider");

    public boolean sliderPageIsOpen() {
        waitForOpen(sliderPage);
        return isDisplayed(sliderPage, "Slider page");
    }

    public void changeSliderValue() {
        waitForOpen(setSliderValue);
        pushKeyToSlide.pushAnyKey(AnyUtils.randomNumber);
    }

    public String resultPushAnyKey() {
        return Double.toString(AnyUtils.randomNumber / 2);
    }

    public String getResultValue() {
        return AnyUtils.parseAnyValueDoubleToString(getResult.getText());
    }


}
