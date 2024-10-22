package AlertsPage;

import BasePage.SetUp;
import Pages.JavaScriptAlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends SetUp {
    JavaScriptAlertsPage alert;
    @Test
    public void acceptAlerts(){
        alert = homePage.clickAlerts();
        alert.clickAlertButton();
        alert.acceptAlert();
        Assert.assertEquals(alert.getAlertResult(),"You successfully clicked an alert");

    }

    @Test
    public void cancelAlert(){
        alert = homePage.clickAlerts();
        alert.clickConfirmButton();
        Assert.assertEquals(alert.getConfirmText(),"I am a JS Confirm");
        alert.cancelAlert();
        Assert.assertEquals(alert.getAlertResult(),"You clicked: Cancel");

    }

    @Test
    public void sendToAlert(){
        alert = homePage.clickAlerts();
        alert.clickPrompt();
        alert.setAlertInput("TAU rocks");
        alert.acceptAlert();
        Assert.assertTrue(alert.getAlertResult().contains("TAU rocks"));
    }





}
