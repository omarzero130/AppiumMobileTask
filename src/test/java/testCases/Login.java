package testCases;

import Pages.HomePage;
import org.testng.annotations.Test;

public class Login extends TestBase{

    HomePage homepage;

    @Test
    public void login () throws InterruptedException {
        homepage = new HomePage(appiumDriver);
        homepage.clickOnPostAddButton();
        System.out.println("loginFunction");

    }

}
