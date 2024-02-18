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
    List<WebElement> LoginFields=driver.findElements(By.className("android.widget.EditText"));
    private By LoginButton = By.xpath("//*[@text='Login']");
    public void LoginToApp () throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        LoginFields.get(0).sendKeys(Utils.LoginTestData.USER_PHONE);
        LoginFields.get(1).sendKeys(Utils.LoginTestData.USER_PASSWORD);
        driver.findElement(LoginButton).click();
    }


}
