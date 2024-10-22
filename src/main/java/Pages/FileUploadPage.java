package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButton(By locator){
        driver.findElement(locator).click();
    }

    public void clickUpload(String absoluteFile){
        driver.findElement(chooseFileButton).sendKeys(absoluteFile);
        clickButton(uploadButton);
    }

    public String getUploadedfiles(){
        return driver.findElement(uploadedFiles).getText();
    }

}
