package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class JavaScriptActions {


    public static void clickElementWithJS(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) DriverFactory.driver;
        javascriptExecutor.executeScript("arguments[0].click()", element);
    }

    public static void scrollToSomeElement() {
        ((JavascriptExecutor)DriverFactory.driver).executeScript("scroll(0,document.body.scrollHeight)");
    }

}
