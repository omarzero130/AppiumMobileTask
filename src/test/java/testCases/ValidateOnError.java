package testCases;

import Pages.LoginPage;
import Pages.PostAdPage;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateOnError  extends TestBase{

    private  boolean isDisplayed;
    @Test
    public void  ValidateOnErrorMessage() throws InterruptedException{
         PostAdPage postAdPage =new PostAdPage(super.appiumDriver);
        postAdPage.ClickOnNextButton();
        isDisplayed= postAdPage.ValidateErrorPopup();
        Assert.assertTrue(isDisplayed,"Validation pop up is displayed");
        postAdPage.ClickOnCategoryField();
    }
}
