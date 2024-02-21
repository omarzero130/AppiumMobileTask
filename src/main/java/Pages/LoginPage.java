package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

// LoginPage class represents the page object for the login page of the mobile app
public class LoginPage extends PageBase {

    // Constructor for the LoginPage class
    public LoginPage(AppiumDriver driver) {
        super(driver); // Call the constructor of the parent class (PageBase)
    }

    // Method to get the driver instance


    // List of WebElements representing the login fields (username and password)
    List<WebElement> LoginFields = driver.findElements(By.className("android.widget.EditText"));

    // Locator for the login button
    private By LoginButton = By.xpath("//*[@text='Login']");

    // Method to perform login to the app
    // Parameters:
    // - Username: The username to be entered in the login field
    // - Password: The password to be entered in the login field
    public void LoginToApp(String Username, String Password) throws InterruptedException {
        // Set implicit wait to wait for elements to be available
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Enter the username and password in the respective fields
        LoginFields.get(0).sendKeys(Username); // Assuming the username field is the first element in the list
        LoginFields.get(1).sendKeys(Password); // Assuming the password field is the second element in the list

        // Click on the login button
        driver.findElement(LoginButton).click();
    }
}
