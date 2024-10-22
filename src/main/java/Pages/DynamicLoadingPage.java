package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String DynamicLink = "//a[contains(text(),'%s')]";
    private By linkExample1 = By.xpath(String.format(DynamicLink, "Example 1"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicExamplePage clickExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicExamplePage(driver);
    }



}
