package KeyPressesPage;

import BasePage.SetUp;
import Pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTest extends SetUp {
    @Test
    public void KeyPressesTest(){
        KeyPressesPage Key = homePage.clickKeyPresses();
        Key.sendKeys("A" + Keys.BACK_SPACE);
        Assert.assertTrue(Key.getResult().contains("BACK_SPACE"), "Text is incorrect");

    }
}
