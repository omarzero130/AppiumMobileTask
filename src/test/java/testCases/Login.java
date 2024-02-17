package testCases;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PostAddPage;
import org.testng.annotations.Test;

public class Login extends TestBase{

    HomePage homepage;
    LoginPage loginpage ;

    PostAddPage postAdPage;

    @Test
    public void login () throws InterruptedException {
        homepage = new HomePage(super.appiumDriver);
        homepage.clickOnPostAddButton();
        loginpage = new LoginPage(super.appiumDriver);
         // loginpage.EnterPhoneNumber();
        //loginpage.EnterPassword();
       // loginpage.ClickOnLoginButton();
        loginpage.LoginToApp();
        postAdPage =new PostAddPage(super.appiumDriver);
        postAdPage.ClickOnNextButton();

    }

}
