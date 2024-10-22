package Hover;

import BasePage.SetUp;
import Pages.HoversPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends SetUp {
    private WebDriver driver;

    @Test
    public void hoverTest(){
        HoversPage hoverPage = homePage.clickHoversPage();
        hoverPage.hoverAction(1);
        Assert.assertTrue(hoverPage.hoverAction(1).isCaptionDisplayed());
        Assert.assertEquals(hoverPage.hoverAction(1).getTitle(), "name: user1");
        Assert.assertEquals(hoverPage.hoverAction(1).getLink(),"View profile");
        Assert.assertTrue(hoverPage.hoverAction(1).getAttribute().endsWith("/users/1"), "/users/1");

    }
}
