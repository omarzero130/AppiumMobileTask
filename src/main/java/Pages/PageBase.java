package Pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class PageBase {
      public AppiumDriver driver ;

    public PageBase(AppiumDriver driver) {

        this.driver= driver;
    }

}
