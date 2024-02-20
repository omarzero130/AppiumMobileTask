
package testCases;
import Pages.LoginPage;
import Pages.PostAdPage;
import Utils.CreateCapabilities;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;


public class TestBase {
    public static  AppiumDriver appiumDriver;
    public static   DesiredCapabilities desiredCapabilities ;
    public static final String APPIUM_SERVER_URL = "http://localhost:4723/";
    public  AppiumDriver initializeDriver() {
        if (appiumDriver == null) {
            appiumDriver = createDriver();
        }
        return appiumDriver;

    }

    private static AppiumDriver createDriver() {
        desiredCapabilities = CreateCapabilities.setDesiredCapabilities();

        try {
            return new AppiumDriver(new URL(APPIUM_SERVER_URL), desiredCapabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @BeforeSuite
    public  void setup(){
        initializeDriver();
    }

    @AfterSuite
        public  void quitDriver () {
            if (appiumDriver != null) {
                appiumDriver.quit();
                appiumDriver = null;
            }
        }
    }

