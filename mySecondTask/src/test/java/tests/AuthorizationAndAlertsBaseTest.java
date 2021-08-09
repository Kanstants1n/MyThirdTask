package tests;

import BaseElements.BaseForm;
import Utils.ConfigManager;
import Utils.DriverUtils;
import anyPages.AlertPageForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AuthorizationAndAlertsBaseTest {
    public WebDriver driver;
    public DriverUtils utils;
    public AlertPageForm alertPageForm;
    public BaseForm baseForm;
    public String host = ConfigManager.getProperties("startPage");
    public String pageOne = ConfigManager.getProperties("testOnePath");
    public String pageTwo = ConfigManager.getProperties("testTwoPath");
    public String userName = ConfigManager.getProperties("loginValue");
    public String passUser = ConfigManager.getProperties("passValue");
    public String promptText = ConfigManager.getProperties("anyStringForAlert");

    @BeforeClass
    protected void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        utils = PageFactory.initElements(driver, DriverUtils.class);
        baseForm = PageFactory.initElements(driver, BaseForm.class);
        alertPageForm = PageFactory.initElements(driver, AlertPageForm.class);
    }

    @AfterClass
    protected void tearDown() {
       driver.quit();
    }


}
