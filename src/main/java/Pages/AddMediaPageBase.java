package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddMediaPageBase extends PageBase {
    public String Pagetitle;
    public AddMediaPageBase(AppiumDriver driver) {
        super(driver);
    }
    private By MediaPageTitle = By.xpath("//*[@text='Add Media']");

    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public String AsseronMediaPage() {
        waitForElement(MediaPageTitle);
        Pagetitle = driver.findElement(MediaPageTitle).getText().toString();
        return Pagetitle;
    }

}
