package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AddMediaPageBase extends PageBase {
    public AddMediaPageBase(AppiumDriver driver) {
        super(driver);
    }
    private By MediaPageTitle = By.xpath("//*[@text='Add Media']");

    public void AsseronMediaPage() {

    }

}
