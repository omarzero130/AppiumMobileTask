package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// AddMediaPageBase class serves as the base class for pages related to adding media in the mobile app
public class AddMediaPageBase extends PageBase {

    // Page title variable
    public String Pagetitle;

    // Constructor for the AddMediaPageBase class
    public AddMediaPageBase(AppiumDriver driver) {
        super(driver); // Call the constructor of the parent class (PageBase)
    }

    // Locator for the page title element
    private By MediaPageTitle = By.xpath("//*[@text='Add Media']");

    // Method to wait for an element to be present
    public void WaitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Method to assert the presence of the media page based on the page title
    public String AssertonMediaPage() {
        WaitForElement(MediaPageTitle); // Wait for the media page title to be present
        Pagetitle = driver.findElement(MediaPageTitle).getText().toString(); // Get the text of the page title
        return Pagetitle; // Return the page title text
    }
}
