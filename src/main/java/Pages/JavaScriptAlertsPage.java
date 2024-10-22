package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By JSAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By JSConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By JSAlertPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By AlertResult = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAlerts(By locator){
        driver.findElement(locator).click();
    }

    public void clickAlertButton(){
        clickAlerts(JSAlertButton);
    }

    public void clickConfirmButton(){
        clickAlerts(JSConfirmButton);
    }

    public void clickPrompt(){
        clickAlerts(JSAlertPrompt);
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void setAlertInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getConfirmText(){
        return driver.switchTo().alert().getText();
    }

    public String getAlertResult(){
        return driver.findElement(AlertResult).getText();
    }
}
