package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ChooseLocationPage extends PageBase{
    public ChooseLocationPage(AppiumDriver driver) {
        super(driver);
    }
    private By DistrictDropdown = By.id("com.forsale.forsale:id/navgraph_postad");
    private By DistrictList = By.id("com.forsale.forsale:id/navgraph_postad");
    private By DistrictListConfirmButton = By.id("com.forsale.forsale:id/navgraph_postad");
    private By AreaDropDown = By.id("com.forsale.forsale:id/navgraph_postad");
    private By AreaList = By.id("com.forsale.forsale:id/navgraph_postad");
    private By AreaListConfirmButton = By.id("com.forsale.forsale:id/navgraph_postad");
    private By ChooseLocationDoneButton = By.id("com.forsale.forsale:id/navgraph_postad");
}
