
package testCases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    private static AppiumDriver driver;
    private static final String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";

    public static AppiumDriver initializeDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }



@BeforeClass
    private static AppiumDriver createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Specify device name (can be obtained using 'adb devices' command)
        capabilities.setCapability("deviceName", "Pixel 4 API 30");
        // Specify Android platform version
        capabilities.setCapability("platformVersion", "11.0");
        // Specify the platform name
        capabilities.setCapability("platformName", "Android");
        // Specify the package name of the app
        capabilities.setCapability("appPackage", "com.forsale.forsale");
        // Specify the activity name of the app
        capabilities.setCapability("appActivity", "com.forsale.app.features.maincontainer.MainContainerActivity");
        // Specify the automation name
        capabilities.setCapability("automationName", "UiAutomator2");

        try {
            return new AndroidDriver(new URL(APPIUM_SERVER_URL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

@AfterClass
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
