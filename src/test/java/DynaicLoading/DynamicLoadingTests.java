package DynaicLoading;

import BasePage.SetUp;
import Pages.DynamicExamplePage;
import Pages.DynamicLoadingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTests extends SetUp {
    @Test
    public void DynamicWait(){
        DynamicExamplePage dynamic = homePage.clickDynamic().clickExample1();
        dynamic.clickStart();
        Assert.assertEquals(dynamic.getLoadedText(),"Hello World!");
    }
}
