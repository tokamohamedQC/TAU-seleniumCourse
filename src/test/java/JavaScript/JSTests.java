package JavaScript;

import BasePage.SetUp;
import Pages.DeepTablePage;
import Pages.InfiniteScrollPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSTests extends SetUp {
    @Test
    public void ScrollTest(){
        DeepTablePage deep = homePage.clickDeep();
        deep.scrollToTable();
        Assert.assertTrue(deep.tableDisplayed());
    }

    @Test
    public void ScrollInfinite(){
        InfiniteScrollPage infinite = homePage.clickInfinite();
        infinite.scrollToParagraph(10);
    }
}
