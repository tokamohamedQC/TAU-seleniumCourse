package DropDown;

import BasePage.SetUp;
import Pages.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTests extends SetUp {
    @Test
    public void selectedOptions(){
        String option = "Option 1";
        DropDownPage dropDown = homePage.clickDropdown();
        dropDown.selectFromDropdown(option);
        List<String> options = dropDown.getSelectedOptions();
        Assert.assertEquals(options.size(), 1, "No is incorrect");
        Assert.assertTrue(options.contains(option), "Option 1");
    }
}
