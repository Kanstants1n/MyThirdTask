package AnyTests;

import Utils.DriverUtils;
import org.testng.annotations.Test;

public class testFileUploaderPage extends ConfigurationForTests{

    @Test
    public void testFileUploader(){
        DriverUtils.goToUrl(urlThirdPage);
    }
}
