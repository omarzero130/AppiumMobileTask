package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostAdPage extends PageBase {
    public PostAdPage(AppiumDriver driver) {
       super(driver);
    }
    private By NextButton = By.xpath("//*[@text='Next']");
    private By DistrictLocationField = By.xpath("//*[@resource-id='com.forsale.forsale:id/locationSelectorText']");

    private By ChooseCategoryDropDown = By.id("com.forsale.forsale:id/chooseCategoryField");
    private By MainCategory = By.xpath("//*[@text='Automotive']");
    private By SubCategory = By.xpath("//*[@text='Classic Cars']");

    private By Districtfield = By.id("com.forsale.forsale:id/chooseDistrictField");

    private By TitleField = By.xpath("//*[@resource-id='com.forsale.forsale:id/adTitleField']");
    private By PriceField = By.xpath("//*[@resource-id='com.forsale.forsale:id/adPriceField']");

    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void ClickOnNextButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(NextButton));
        driver.findElement(NextButton).click();
    }

    public  boolean ValidateErrorPopup (){
        By ValidationPopUp = By.xpath("//*[@text='Kindly Fill all the required information!']");
        boolean displayed = false ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        if (driver.findElements(ValidationPopUp).size() > 0) {
            displayed =true;
        }
        return displayed ;
    }

    public void ClickOnCategoryField()  {
         By ChooseCategoryDropDown = By.id("com.forsale.forsale:id/chooseCategoryField");
        waitForElement(ChooseCategoryDropDown);
        driver.findElement(ChooseCategoryDropDown).click();
    }

    public void ChooseMainCategory (){
        waitForElement(MainCategory);
        driver.findElement(MainCategory).click();
    }
    public void ChooseSubCategory()  {
        waitForElement(SubCategory);
        driver.findElement(SubCategory).click();
    }

    public void ClickOnDistrictField()  {
        waitForElement(Districtfield);
        driver.findElement(Districtfield).click();
    }

    public void ClickOnDistrictLocationField()  {
        waitForElement(DistrictLocationField);
        driver.findElement(DistrictLocationField).click();
    }

    public void EnterTitleField(String title)  {
        waitForElement(TitleField);
        driver.findElement(TitleField).sendKeys(title);
    }
    public void EnterPriceField(String price)  {
        waitForElement(PriceField);
        driver.findElement(PriceField).sendKeys(price);
    }

}
