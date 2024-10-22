package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeepTablePage {
    private WebDriver driver;
    private By table = By.id("large-table");

    public DeepTablePage (WebDriver driver) {
        this.driver = driver;
    }
    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);

    }

    public boolean tableDisplayed(){
        return driver.findElement(table).isDisplayed();
    }
}
