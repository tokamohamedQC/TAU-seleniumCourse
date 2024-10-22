package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    By textBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        while (getNumberOfParagraph() < index){
            ((JavascriptExecutor)driver).executeScript(script);
        }
    }

    private int getNumberOfParagraph(){
        return driver.findElements(textBlock).size();
    }
}
