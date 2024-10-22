package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By KeyInput = By.id("target");
    private By KeyResult = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(String text){
        driver.findElement(KeyInput).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(KeyResult).getText();
    }

}
