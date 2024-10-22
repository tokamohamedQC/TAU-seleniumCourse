package Utils;

import org.openqa.selenium.WebDriver;

public class WindowManagement {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManagement(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void navigate(String URL){
        navigate.to(URL);
    }
}
