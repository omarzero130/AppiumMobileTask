package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

// ChooseLocationPage class represents the page object for choosing the location in the mobile app
public class ChooseLocationPage extends PageBase {

    // Constructor for the ChooseLocationPage class
    public ChooseLocationPage(AppiumDriver driver) {
        super(driver); // Call the constructor of the parent class (PageBase)
    }

    // Locators for elements on the choose location page
    private By DistrictField = By.xpath("//*[@resource-id='com.forsale.forsale:id/locationSelectorText']");
    private By DistrictField2 = By.id("com.forsale.forsale:id/locationSelectorText");
    private By Listarea = By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']");
    private By ConfirmButton = By.xpath("//*[@resource-id='com.forsale.forsale:id/btnProceed']");
    private By AreaField = By.xpath("//*[@text='Choose Area']");
    private By BlockField = By.xpath("//*[@text='Choose Block']");
    private By ConfirmLocation = By.xpath("//*[@text='Done']");

    // Method to wait for an element to be present
    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Method to click on the district field
    public void ClickOnDistrictfield() {
        waitForElement(DistrictField);
        driver.findElement(DistrictField).click();
    }

    // Method to choose the district
    public void ChooseDistrict() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        List<WebElement> DistrictList = driver.findElements(By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']"));
        DistrictList.get(2).click(); // Assuming the desired district is the third element in the list
    }

    // Method to click on the "Done" button
    public void ClickonDone() throws InterruptedException {
        waitForElement(ConfirmButton);
        driver.findElement(ConfirmButton).click();
    }

    // Method to click on the area field
    public void ClickonAreaField() throws InterruptedException {
        waitForElement(AreaField);
        driver.findElement(AreaField).click();
    }

    // Method to choose the area
    public void ChooseArea() {
        List<WebElement> AreaList = driver.findElements(By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        AreaList.get(3).click(); // Assuming the desired area is the fourth element in the list
    }

    // Method to click on the block field
    public void ClickOnBlockField() throws InterruptedException {
        waitForElement(BlockField);
        driver.findElement(BlockField).click();
    }

    // Method to choose the block
    public void ChooseBlock() {
        List<WebElement> BlockList = driver.findElements(By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        BlockList.get(2).click(); // Assuming the desired block is the third element in the list
    }

    // Method to click on the confirm location button
    public void ClickOnConfirmLocation() throws InterruptedException {
        waitForElement(ConfirmLocation);
        driver.findElement(ConfirmLocation).click();
    }
}
