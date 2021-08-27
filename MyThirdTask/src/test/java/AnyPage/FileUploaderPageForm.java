package AnyPage;

import AnyElements.BaseForm;
import AnyElements.SomeButton;
import AnyElements.TextField;
import org.openqa.selenium.By;

public class FileUploaderPageForm extends BaseForm {
    private By fileUploaderPage = By.xpath("//div[@id = 'drag-drop-upload']");
    private By overviewButton = By.xpath("//input[@id = 'file-upload']");
    private By submitButton = By.xpath("//input[@id = 'file-submit']");
    private By fileUploaderText = By.xpath("//div[@id = 'content']//h3[text()='File Uploaded!']");
    private By nameFile = By.xpath("//div[@id = 'uploaded-files']");
    private SomeButton overviewButtons = new SomeButton(this.overviewButton, "Overview button");
    private SomeButton submitButtons = new SomeButton(this.submitButton, "Submit button");
    private TextField fileUploaderTexts = new TextField(this.fileUploaderText, "File uploader text");
    private TextField nameFiles = new TextField(this.nameFile, "Name file");

    public boolean fileUploaderPageIsOpen() {
        waitForOpen(fileUploaderPage, "fileUploaderPage");
        return isDisplayed(fileUploaderPage, "File uploader page");
    }

    public void clickOverviewButtons() {
        waitForOpen(overviewButton, "overviewButton");
        overviewButtons.jsClick();
    }

    public void sendPathFile(String AnyString) {
        overviewButtons.senKeys(AnyString);
    }

    public void clickSubmitButton() {
        waitForOpen(submitButton, "submitButton");
        submitButtons.jsClick();
    }

    public String getFileUploaderText() {
        this.waitForOpen(this.fileUploaderText, "fileUploaderText");
        return this.fileUploaderTexts.getText();
    }

    public String getNameFile() {
        this.waitForOpen(this.nameFile, "nameFile");
        return this.nameFiles.getText();
    }
}
