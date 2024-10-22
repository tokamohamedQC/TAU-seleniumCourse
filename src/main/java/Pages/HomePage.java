package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(String element) {
        driver.findElement(By.linkText(element)).click();
    }

    public LoginPage clickAuthenticate() {
        clickElement("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropdown() {
        clickElement("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickHoversPage() {
        clickElement("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickElement("Key Presses");
        return new KeyPressesPage(driver);
    }

    public JavaScriptAlertsPage clickAlerts() {
        clickElement("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFile() {
        clickElement("File Upload");
        return new FileUploadPage(driver);
    }

    public IFramePage clickIframe() {
        clickElement("WYSIWYG Editor");
        return new IFramePage(driver);
    }

    public DynamicLoadingPage clickDynamic() {
        clickElement("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public DeepTablePage clickDeep() {
        clickElement("Large & Deep DOM");
        return new DeepTablePage(driver);
    }

    public InfiniteScrollPage clickInfinite() {
        clickElement("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

}