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
    WebElement PostAddButton =  driver.findElement(By.id("com.forsale.forsale:id/navgraph_postad"));
    WebElement test = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Post an Ad']"));
    //WebElement PostAddButton2 = driver.findElementById("com.forsale.forsale:id/navgraph_postad");

   // WebElement postAddButton3 = driver.findElementByAccessibilityId("Post an Ad");

    public void clickOnPostAddButton() throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(10000);
        PostAddButton.click();
    }
}
