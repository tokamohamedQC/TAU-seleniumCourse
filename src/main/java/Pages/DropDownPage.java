package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }
    private Select selectElement(){
        return new Select(driver.findElement(dropdown));
    }
    public void selectFromDropdown(String option){
        selectElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
       List <WebElement> selectedOptions = selectElement().getAllSelectedOptions();
       return selectedOptions.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

}
