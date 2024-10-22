package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figure = By.className("figure");
    private By caption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public figCaption hoverAction(int  index){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElements(figure).get(index - 1)).perform();
        return new figCaption(driver.findElement(caption));
    }

    public class figCaption{
        WebElement figCaption;
        private By user = By.tagName("h5");
        private By link = By.tagName("a");

        public figCaption(WebElement figCaption) {
            this.figCaption = figCaption;
        }

        public boolean isCaptionDisplayed(){
            return figCaption.isDisplayed();
        }

        public String getTitle(){
            return figCaption.findElement(user).getText();
        }

        public String getLink(){
            return figCaption.findElement(link).getText();
        }

        public String getAttribute(){
            return figCaption.findElement(link).getAttribute("href");
        }
    }
}
