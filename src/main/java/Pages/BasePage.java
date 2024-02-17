package Pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BasePage {

    private static AppiumDriver driver;
    private static final String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";

    public static AppiumDriver initializeDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    private static AppiumDriver createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Specify device name (can be obtained using 'adb devices' command)
        capabilities.setCapability("deviceName", "Your_Device_Name");
        // Specify Android platform version
        capabilities.setCapability("platformVersion", "Android_Platform_Version");
        // Specify the platform name
        capabilities.setCapability("platformName", "Android");
        // Specify the package name of the app
        capabilities.setCapability("appPackage", "Your_App_Package_Name");
        // Specify the activity name of the app
        capabilities.setCapability("appActivity", "Your_App_Main_Activity");
        // Specify the automation name
        capabilities.setCapability("automationName", "UiAutomator2");

        try {
            return new AndroidDriver(new URL(APPIUM_SERVER_URL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
