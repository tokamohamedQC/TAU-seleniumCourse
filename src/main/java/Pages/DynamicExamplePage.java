package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicExamplePage {
    private WebDriver driver;
    private By startButton = By.xpath("//button[text()='Start']");
    private By loading = By.id("loading");
    private By finishedText = By.xpath("//h4[text()='Hello World!']");
    public DynamicExamplePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    }

    public String getLoadedText(){
        return driver.findElement(finishedText).getText();
    }
}
