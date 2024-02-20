package Pages;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;


public class LoginPage extends PageBase{
    public LoginPage(AppiumDriver driver) {

        super(driver);
    }
    public AppiumDriver getDriver(){
        return driver;
    }

    List<WebElement> LoginFields=driver.findElements(By.className("android.widget.EditText"));
    private By LoginButton = By.xpath("//*[@text='Login']");
    public void LoginToApp (String Username ,String Password) throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        LoginFields.get(0).sendKeys(Username);
        LoginFields.get(1).sendKeys(Password);
        driver.findElement(LoginButton).click();
    }


}
