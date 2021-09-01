package AnyTests;

import Utils.DriverUtils;
import Utils.UnchangeableValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFileUploaderPage extends BaseTest {

    @Test
    public void testFileUploader() {
        DriverUtils.goToUrl(urlThirdPage);
        Assert.assertTrue(fileUploaderPageForm.fileUploaderPageIsOpen(), "File uploader page not open");
        fileUploaderPageForm.clickOverviewButtons();
        fileUploaderPageForm.sendPathFile(pathToFile + nameFile);
        fileUploaderPageForm.clickSubmitButton();
        Assert.assertEquals(fileUploaderPageForm.getFileUploaderText(), UnchangeableValue.fileUploaderResultMessage, "File not uploaded");
        Assert.assertEquals(fileUploaderPageForm.getNameFile(), nameFile, "File name not matches");
    }
}
