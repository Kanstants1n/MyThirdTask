package BaseElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public abstract class BaseElement {

    private WebDriver driver;
    private WebDriverWait wait;

    public BaseElement(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private String loggerName;

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void elementIsDisplayed(By elementBy) {
        driver.findElement(elementBy).isDisplayed();
    }

    public void clickElement(By elementBy) {
        driver.findElement(elementBy).click();
    }

    public String getText(By elementBy) {
        String resultText = driver.findElement(elementBy).getText();
        return resultText;
    }
    //работа с алертами
    public String workThisAlertsText() {
        Alert jsAlert = wait.until(alertIsPresent());
        String jsAlertText = jsAlert.getText();
        return jsAlertText;
    }

    public void workThisAlertsAccept() {
        Alert jsAlert = wait.until(alertIsPresent());
        jsAlert.accept();
    }

    public void sendAlertText(String anyString) {
        Alert jsAlert = wait.until(alertIsPresent());
        jsAlert.sendKeys(anyString);
    }
}
