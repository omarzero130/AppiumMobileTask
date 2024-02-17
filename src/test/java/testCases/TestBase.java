
package testCases;
import Utils.CreateCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    private static AppiumDriver driver;

    public static   DesiredCapabilities desiredCapabilities ;
    private static final String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";

    public static AppiumDriver initializeDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }
    private static AppiumDriver createDriver() {
        //initializeDriver();
        desiredCapabilities = CreateCapabilities.setDesiredCapabilities();
        System.out.println(desiredCapabilities + "heloo capp");
        try {
            return new AndroidDriver(new URL(APPIUM_SERVER_URL), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @BeforeClass
    public static void setup(){
        initializeDriver();
    }

    @AfterClass
        public static void quitDriver () {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }

