package tests;

import Utils.ConfigManager;
import Utils.DriverFactory;
import Utils.DriverUtils;
import anyPages.AlertPageForm;
import anyPages.BasicAuthorizationPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class AuthorizationAndAlertsBaseTest {
    public AlertPageForm alertPageForm;
    public BasicAuthorizationPage basicAuthorizationPage;
    public DriverUtils driverUtils;
    public String host = ConfigManager.getProperties("startPage");
    public String pageOne = ConfigManager.getProperties("testOnePath");
    public String pageTwo = ConfigManager.getProperties("testTwoPath");
    public String userName = ConfigManager.getProperties("loginValue");
    public String passUser = ConfigManager.getProperties("passValue");
    public String promptText = ConfigManager.getProperties("anyStringForAlert");
    public String protocol = ConfigManager.getProperties("protocol");

    @BeforeClass
    protected void setUP() {
        DriverFactory.initialize();
        driverUtils = PageFactory.initElements(DriverFactory.driver, DriverUtils.class);
        basicAuthorizationPage = PageFactory.initElements(DriverFactory.driver, BasicAuthorizationPage.class);
        alertPageForm = PageFactory.initElements(DriverFactory.driver, AlertPageForm.class);
    }

    @AfterTest
    protected void tearDown() {
       DriverFactory.quit();
    }


}
