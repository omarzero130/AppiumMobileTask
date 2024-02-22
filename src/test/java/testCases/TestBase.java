package testCases;

import Utils.CreateCapabilities;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;

// TestBase class serves as the base class for all test cases
public class TestBase {
    // Static variables for the AppiumDriver and DesiredCapabilities
    public static AppiumDriver appiumDriver;
    public static DesiredCapabilities desiredCapabilities;
    // URL of the Appium server
    public static final String APPIUM_SERVER_URL = "http://localhost:4723/";

    // Method to initialize the AppiumDriver
    public AppiumDriver initializeDriver() {
        if (appiumDriver == null) {
            appiumDriver = createDriver();
        }
        return appiumDriver;
    }

    // Method to create the AppiumDriver with desired capabilities
    private static AppiumDriver createDriver() {
        desiredCapabilities = CreateCapabilities.SetDesiredCapabilities();

        try {
            return new AppiumDriver(new URL(APPIUM_SERVER_URL), desiredCapabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to setup the test suite - executed before the test suite run
    @BeforeSuite
    public void setup() {
        initializeDriver();
    }

    // Method to quit the AppiumDriver - executed after the test suite run
    @AfterSuite
    public void quitDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }
}
