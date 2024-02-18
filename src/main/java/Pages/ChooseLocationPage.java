package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ChooseLocationPage extends PageBase{
    public ChooseLocationPage(AppiumDriver driver) {
        super(driver);
    }
    private By DistrictField = By.xpath("//*[@resource-id='com.forsale.forsale:id/locationSelectorText']");
    private By DistrictField2 = By.id("com.forsale.forsale:id/locationSelectorText");

    private By Listarea = By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']");
    List<WebElement> DistrictList=driver.findElements(By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']"));
    private By ConfirmButton = By.xpath("//*[@resource-id='com.forsale.forsale:id/btnProceed']");
    private By AreaField = By.xpath("//*[@text='Choose Area']");

    private By BlockField = By.xpath("//*[@text='Choose Block']");

    private By ConfirmLocation = By.xpath("//*[@text='Done']");

    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }


    public void ClickOnDistrictfield()  {
        waitForElement(DistrictField);
        driver.findElement(DistrictField).click();
    }

    public void ChooseDistrict()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        DistrictList.get(2).click();
        //driver.findElement(DistrictField).click();
    }

    public void ClickonDone() throws InterruptedException {
        waitForElement(ConfirmButton);
        driver.findElement(ConfirmButton).click();
    }

    public void ClickonAreaField() throws InterruptedException {
        waitForElement(AreaField);
        driver.findElement(AreaField).click();
    }
    public void ChooseArea()  {
        List<WebElement> AreaList=driver.findElements(By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        AreaList.get(3).click();

    }

    public void ClickOnBlockField() throws InterruptedException {
        waitForElement(BlockField);
        driver.findElement(BlockField).click();
    }
    public void ChooseBlock()  {
        List<WebElement> BlockList=driver.findElements(By.xpath("//*[@resource-id='com.forsale.forsale:id/txtSelector']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        BlockList.get(2).click();

    }

    public void ClickOnConfirmLocation() throws InterruptedException {
        waitForElement(ConfirmLocation);
        driver.findElement(ConfirmLocation).click();
    }



//    public void ClickOnDistrictField() throws InterruptedException {
//        waitForElement(DistrictDropdown);
//        driver.findElement(DistrictDropdown).click();
//    }

}
