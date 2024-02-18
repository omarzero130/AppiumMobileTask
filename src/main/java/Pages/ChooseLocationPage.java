package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChooseLocationPage extends PageBase{
    public ChooseLocationPage(AppiumDriver driver) {
        super(driver);
    }
    private By DistrictDropdown = By.id("com.forsale.forsale:id/locationSelectorText");

    List<WebElement> DistrictList=driver.findElements(By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']"));
    private By ConfirmButton = By.xpath("//*[@resource-id='com.forsale.forsale:id/btnProceed']");
    private By AreaDropDown = By.xpath("//*[@text='Choose Area']");
    List<WebElement> AreaList=driver.findElements(By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']"));
    private By BlockDropDown = By.xpath("//*[@text='Choose Block']");

    private By ConfirmLocation = By.xpath("//*[@text='Done']");
}
