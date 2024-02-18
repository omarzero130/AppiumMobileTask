package testCases;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PostAdPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase{

    HomePage homepage;
    LoginPage loginpage ;

    PostAdPage postAdPage;

    boolean isDisplayed;

    @Test
    public void login () throws InterruptedException {
        homepage = new HomePage(super.appiumDriver);
        homepage.clickOnPostAddButton();
        loginpage = new LoginPage(super.appiumDriver);
        loginpage.LoginToApp();
        postAdPage =new PostAdPage(super.appiumDriver);
        postAdPage.ClickOnNextButton();
        isDisplayed= postAdPage.ValidateErrorPopup();
        Assert.assertTrue(isDisplayed,"Validation pop up is displayed");

    }

}
