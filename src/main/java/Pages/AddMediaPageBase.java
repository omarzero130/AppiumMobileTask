package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AddMediaPageBase extends PageBase {
    public String Pagetitle;
    public AddMediaPageBase(AppiumDriver driver) {
        super(driver);
    }
   // private By MediaPageTitle = By.xpath("//*[@text='Add Media']");

    public String AsseronMediaPage() {
        By MediaPageTitle = By.xpath("//*[@text='Add Media']");
         Pagetitle = driver.findElement(MediaPageTitle).getText().toString();
        return Pagetitle;
    }

}
