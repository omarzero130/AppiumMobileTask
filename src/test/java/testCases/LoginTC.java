package testCases;

import Pages.*;
import Utils.TestDataLoader;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

// LoginTC class represents a test case for logging into the application
public class LoginTC extends TestBase {

    // Test method to perform the login operation
    @Feature("Login")
    @Test(testName = "Login to app")
    public void login() throws InterruptedException {
        // Retrieve username and password from test data
        String username = TestDataLoader.getUsername();
        String password = TestDataLoader.getPassword();

        // Initialize the HomePage object using the appiumDriver from the parent class TestBase
        HomePage homepage = new HomePage(super.appiumDriver);
        // Click on the "Post Ad" button
        homepage.clickOnPostAdButton();

        // Initialize the LoginPage object using the appiumDriver from the parent class TestBase
        LoginPage loginpage = new LoginPage(super.appiumDriver);
        // Perform the login operation using the retrieved username and password
        loginpage.LoginToApp(username, password);
    }
}
