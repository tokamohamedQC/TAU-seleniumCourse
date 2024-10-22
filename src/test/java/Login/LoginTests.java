package Login;

import BasePage.SetUp;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends SetUp {
    @Test
    public void testSuccessfulLogin(){
       LoginPage login = homePage.clickAuthenticate();
       login.setUsername("tomsmith");
       login.setPassword("SuperSecretPassword!");
       SecureAreaPage secure = login.clickLogin();
       assertTrue(secure.getAlertText().contains("You logged into a secure area!"));

    }
}
