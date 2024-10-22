package Frames;

import BasePage.SetUp;
import Pages.IFramePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class frames extends SetUp {
    @Test
    public void frameTest() throws InterruptedException {
        IFramePage frame = homePage.clickIframe();
        frame.closeWindow();
        frame.deletebody();
        frame.sendbody("Hello");
        frame.clickInc();
        frame.sendbody("World");

    }
}
