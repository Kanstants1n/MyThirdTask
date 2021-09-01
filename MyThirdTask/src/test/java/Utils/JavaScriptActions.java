package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptActions {

    public static void clickElementWithJS(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)DriverFactory.driver;
        javascriptExecutor.executeScript(AnyJSScripts.jsClick, element);
    }

    public static void scrollToSomeElement(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)DriverFactory.driver;
        javascriptExecutor.executeScript(AnyJSScripts.jsScroll, element);
    }
}
