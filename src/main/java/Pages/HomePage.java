package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import java.time.Duration;



public class HomePage extends PageBase {
    public HomePage(AppiumDriver driver) {
        super(driver);
    }
    private By PostAddButton = By.xpath("//*[@resource-id='com.forsale.forsale:id/navgraph_postad']");
    public void clickOnPostAddButton()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(PostAddButton).click();
    }
}
