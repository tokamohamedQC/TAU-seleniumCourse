package AlertsPage;

import BasePage.SetUp;
import Pages.FileUploadPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTests extends SetUp {

    @Test
    public void uploadFile(){
        FileUploadPage file = homePage.clickFile();
        String absFile = "C:\\Users\\toka.ezzeldin\\IdeaProjects\\SeleniumTAU\\.idea\\compiler.xml";
        file.clickUpload(absFile);
        Assert.assertTrue(absFile.contains(file.getUploadedfiles()));

    }
}
