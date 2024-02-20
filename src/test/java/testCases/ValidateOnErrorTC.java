package testCases;

import Pages.PostAdPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateOnErrorTC extends TestBase{

    private  boolean isDisplayed;
    @Test
    public void  ValidateOnErrorMessage() throws InterruptedException{
         PostAdPage postAdPage =new PostAdPage(super.appiumDriver);
        postAdPage.ClickOnNextButton();
        isDisplayed= postAdPage.ValidateErrorPopup();
        Assert.assertTrue(isDisplayed,"Validation pop up is displayed");
    }
}
