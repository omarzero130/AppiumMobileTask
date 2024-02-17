package Pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BasePage {
    public AppiumDriver driver;

    public BasePage (AppiumDriver driver) {


        this.driver= driver;
    }

}
