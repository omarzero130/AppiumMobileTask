package Pages;

import io.appium.java_client.AppiumDriver;

// PageBase serves as the base class for all page objects in the mobile app testing framework
public class PageBase {

    // Static AppiumDriver instance shared across all page objects
    public static AppiumDriver driver;

    // Constructor for the PageBase class
    public PageBase(AppiumDriver driver) {
        this.driver = driver; // Initialize the AppiumDriver instance
    }

}
