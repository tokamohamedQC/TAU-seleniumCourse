package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFramePage {
    private WebDriver driver;
    private String frame = "mce_0_ifr";
    private By body = By.xpath("//body//p[text()='Your content goes here.']");
    private By IncreaseIcon = By.xpath("//button[@title=\"Increase indent\"]");
    private By close = By.xpath("//div[@aria-label=\"Close\"]");
    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeWindow(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(close));
        driver.findElement(close).click();
    }

    public void deletebody(){
        switchToEditFrame();
        driver.findElement(body).clear();
        switchToParentFrame();
    }

    public void sendbody(String text){
        switchToEditFrame();
        driver.findElement(body).sendKeys(text);
        switchToParentFrame();
    }

    public void switchToEditFrame(){
        driver.switchTo().frame(frame);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public String getEditorText(){
        switchToEditFrame();
        String text = driver.findElement(body).getText();
        switchToParentFrame();
        return text;
    }

    public void clickInc(){
        driver.findElement(IncreaseIcon).click();
    }
}
