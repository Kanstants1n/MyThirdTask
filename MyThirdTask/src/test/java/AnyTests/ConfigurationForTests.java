package AnyTests;

import AnyPage.AlertPageForm;
import AnyPage.FileUploaderPageForm;
import AnyPage.InfiniteScrollPageForm;
import Utils.ConfigManager;
import Utils.DriverFactory;
import org.testng.annotations.*;

public abstract class ConfigurationForTests {

    public String engineersAge = ConfigManager.getProperties("engineersAge");
    public String pathToFile = ConfigManager.getProperties("pathToFile");
    public String nameFile = ConfigManager.getProperties("fileName");

    public AlertPageForm alertPageForm;
    public InfiniteScrollPageForm infiniteScrollPageForm;
    public FileUploaderPageForm fileUploaderPageForm;

    public String urlFirstPage = ConfigManager.getProperties("firstPage");
    public String urlSecondPage = ConfigManager.getProperties("secondPage");
    public String urlThirdPage = ConfigManager.getProperties("thirdPage");


    @BeforeClass
    protected void setUp() {
        DriverFactory.initialize();
        alertPageForm = new AlertPageForm();
        infiniteScrollPageForm = new InfiniteScrollPageForm();
        fileUploaderPageForm = new FileUploaderPageForm();
    }

    @AfterTest
    protected void tearDown() {
        DriverFactory.quit();
    }


}
