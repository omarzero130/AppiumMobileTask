
package testCases;
import Utils.CreateCapabilities;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;


public class TestBase {

    public  AppiumDriver appiumDriver;

    public static   DesiredCapabilities desiredCapabilities ;
    //public static final String APPIUM_SERVER_URL = "http://localhost:4723/";

    public  AppiumDriver initializeDriver() {
        if (appiumDriver == null) {
            appiumDriver = createDriver();
        }
        return appiumDriver;
    }
    private static AppiumDriver createDriver() {
        //initializeDriver();
        desiredCapabilities = CreateCapabilities.setDesiredCapabilities();
        System.out.println(desiredCapabilities + "heloo capp");
        try {
            return new AppiumDriver(new URL("http://localhost:4723/"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @BeforeClass
    public  void setup(){
        initializeDriver();
    }

    @AfterClass
        public  void quitDriver () {
            if (appiumDriver != null) {
                appiumDriver.quit();
                appiumDriver = null;
            }
        }
    }

