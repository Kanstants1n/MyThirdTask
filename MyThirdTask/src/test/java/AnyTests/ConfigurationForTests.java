package AnyTests;

import AnyPage.AlertPageForm;
import AnyPage.InfiniteScrollPageForm;
import Utils.ConfigManager;
import Utils.DriverFactory;
import org.testng.annotations.*;

public abstract class ConfigurationForTests {

    public AlertPageForm alertPageForm;
    public InfiniteScrollPageForm infiniteScrollPageForm;

    public String urlFirstPage = ConfigManager.getProperties("firstPage");
    public String urlSecondPage = ConfigManager.getProperties("secondPage");
    public String urlThirdPage = ConfigManager.getProperties("thirdPage");


    @BeforeTest
    protected void setUp(){
        DriverFactory.initialize();
        alertPageForm = new AlertPageForm();
        infiniteScrollPageForm = new InfiniteScrollPageForm();
    }
    @AfterTest
    protected void tearDown(){
        DriverFactory.quit();
    }


}
