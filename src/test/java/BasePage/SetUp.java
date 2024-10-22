package BasePage;

import Pages.HomePage;
import Utils.EventReporter;
import Utils.WindowManagement;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SetUp{
    private EventFiringWebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new EventFiringWebDriver(new ChromeDriver(getChrome()));
        driver.register(new EventReporter());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
        driver.manage().window().maximize();



    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    private ChromeOptions getChrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;
    }


    @AfterClass
    public void termDown(){
        driver.quit();
    }

    @AfterMethod
    public void takeScreenShots(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            File screens = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screens, new File("src\\main\\resources\\Screenshots\\"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
