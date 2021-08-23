package tests;

import Utils.ConfigManager;
import Utils.DriverFactory;
import Utils.DriverUtils;
import anyPages.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class AuthorizationAndAlertsBaseTest {
    public AlertPageForm alertPageForm;
    public BasicAuthorizationPage basicAuthorizationPage;
    public SliderPageForm sliderPageForm;
    public HoverPageForm hoverPageForm;
    public IFramePageForm iFramePageForm;

    public String userName = ConfigManager.getProperties("loginValue");
    public String passUser = ConfigManager.getProperties("passValue");
    public String alignText = ConfigManager.getProperties("leftAlign");
    public String protocol = ConfigManager.getProperties("protocol");
    public String host = ConfigManager.getProperties("startPage");
    public String pageOne = ConfigManager.getProperties("testOnePath");
    public String pageTwo = ConfigManager.getProperties("testTwoPath");
    public String pageTree = ConfigManager.getProperties("testTreePath");
    public String pageFour = ConfigManager.getProperties("testFourPath");
    public String pageFive = ConfigManager.getProperties("testFivePath");

    @BeforeClass
    protected void setUP() {
        DriverFactory.initialize();
        basicAuthorizationPage = new BasicAuthorizationPage();
        alertPageForm = new AlertPageForm();
        sliderPageForm = new SliderPageForm();
        hoverPageForm = new HoverPageForm();
        iFramePageForm = new IFramePageForm();
    }

    @AfterTest
    protected void tearDown() {
        DriverFactory.quit();
    }


}
