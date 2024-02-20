package testCases;

import Pages.*;
import Utils.TestDataLoader;
import org.testng.annotations.Test;

public class LoginTC extends TestBase{
    public LoginTC(){
        super();
    }

    @Test
    public void login () throws InterruptedException {
        String username = TestDataLoader.getUsername();
        String password = TestDataLoader.getPassword();

         HomePage homepage = new HomePage(super.appiumDriver);
        homepage.clickOnPostAddButton();

        LoginPage loginpage = new LoginPage(super.appiumDriver);
        loginpage.LoginToApp(username,password);

    }

}
