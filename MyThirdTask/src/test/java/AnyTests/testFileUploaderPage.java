package AnyTests;

import Utils.DriverUtils;
import Utils.UnchangeableValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testFileUploaderPage extends ConfigurationForTests {

    @Test
    public void testFileUploader() {
        DriverUtils.goToUrl(urlThirdPage);
        Assert.assertTrue(fileUploaderPageForm.fileUploaderPageIsOpen(), UnchangeableValue.fileUploaderNotOpen);
        fileUploaderPageForm.clickOverviewButtons();
        fileUploaderPageForm.sendPathFile(pathToFile + nameFile);
        fileUploaderPageForm.clickSubmitButton();
        Assert.assertEquals(fileUploaderPageForm.getFileUploaderText(), UnchangeableValue.fileUploaderResultMessage, UnchangeableValue.fileUploaderResultMessageFalse);
        Assert.assertEquals(fileUploaderPageForm.getNameFile(), nameFile, UnchangeableValue.fileUploaderFileNameNotMatches);
    }
}
