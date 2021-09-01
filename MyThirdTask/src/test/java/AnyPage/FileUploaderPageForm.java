package AnyPage;

import AnyElements.BaseForm;

import AnyElements.Button;
import AnyElements.TextField;
import Utils.WaitUtils;
import org.openqa.selenium.By;

public class FileUploaderPageForm{
    private By fileUploaderPage = By.xpath("//div[@id = 'drag-drop-upload']");
    private By overviewButton = By.xpath("//input[@id = 'file-upload']");
    private By submitButton = By.xpath("//input[@id = 'file-submit']");
    private By fileUploaderText = By.xpath("//div[@id = 'content']//h3[text()='File Uploaded!']");
    private By nameFile = By.xpath("//div[@id = 'uploaded-files']");

    private Button overviewButtons = new Button(overviewButton, "Overview button");
    private Button submitButtons = new Button(submitButton, "Submit button");
    private TextField fileUploaderTexts = new TextField(fileUploaderText, "File uploader text");
    private TextField nameFiles = new TextField(nameFile, "Name file");
    private TextField fileUploaderPageIsOpen = new TextField(fileUploaderPage, "File uploader page");
    private BaseForm fileUploaderPageIsDisplayed = new BaseForm(fileUploaderPageIsOpen, "FileUploaderPage");

    public boolean fileUploaderPageIsOpen() {
        WaitUtils.waitElement(fileUploaderPage);
        return fileUploaderPageIsDisplayed.isDisplayed();
    }

    public void clickOverviewButtons() {
        WaitUtils.waitElement(overviewButton);
        overviewButtons.jsClick();
    }

    public void sendPathFile(String AnyString) {
        overviewButtons.senKeys(AnyString);
    }

    public void clickSubmitButton() {
        WaitUtils.waitElement(submitButton);
        submitButtons.jsClick();
    }

    public String getFileUploaderText() {
        WaitUtils.waitElement(fileUploaderText);
        return fileUploaderTexts.getText();
    }

    public String getNameFile() {
        WaitUtils.waitElement(nameFile);
        return nameFiles.getText();
    }
}
