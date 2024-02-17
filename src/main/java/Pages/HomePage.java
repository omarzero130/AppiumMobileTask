package Pages;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends PageBase {
    public HomePage(AppiumDriver driver) {
        super(driver);
    }
    private By PostAddButton = By.id("com.forsale.forsale:id/navgraph_postad");
    public void clickOnPostAddButton() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(PostAddButton).click();
    }
}
