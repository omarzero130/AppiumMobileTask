package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import java.time.Duration;

// HomePage class represents the page object for the home page of the mobile app
public class HomePage extends PageBase {

    // Constructor for the HomePage class
    public HomePage(AppiumDriver driver) {
        super(driver); // Call the constructor of the parent class (PageBase)
    }

    // Locator for the "Post Add" button
    private By PostAddButton = By.xpath("//*[@resource-id='com.forsale.forsale:id/navgraph_postad']");

    // Method to click on the "Post Add" button
    public void clickOnPostAdButton() {
        // Set implicit wait to wait for elements to be available
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Click on the "Post Add" button
        driver.findElement(PostAddButton).click();
    }
}
