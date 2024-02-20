package Pages;
import io.appium.java_client.AppiumDriver;

public class PageBase {
    public static AppiumDriver driver ;
    public PageBase(AppiumDriver driver) {
        this.driver= driver;
    }

}
