package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.xpath("//button[@type=\"submit\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String name) {
        driver.findElement(username).sendKeys(name);
    }

    public void setPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public SecureAreaPage clickLogin(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
