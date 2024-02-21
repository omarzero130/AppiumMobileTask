package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// PostAdPage class represents the page object for the post ad page of the mobile app
public class PostAdPage extends PageBase {

    // Constructor for the PostAdPage class
    public PostAdPage(AppiumDriver driver) {
        super(driver); // Call the constructor of the parent class (PageBase)
    }

    // Locators for elements on the post ad page
    private By NextButton = By.xpath("//*[@text='Next']");
    private By DistrictLocationField = By.xpath("//*[@resource-id='com.forsale.forsale:id/locationSelectorText']");
    private By ChooseCategoryDropDown = By.id("com.forsale.forsale:id/chooseCategoryField");
    private By MainCategory = By.xpath("//*[@text='Automotive']");
    private By SubCategory = By.xpath("//*[@text='Classic Cars']");
    private By Districtfield = By.id("com.forsale.forsale:id/chooseDistrictField");
    private By TitleField = By.xpath("//*[@resource-id='com.forsale.forsale:id/adTitleField']");
    private By PriceField = By.xpath("//*[@resource-id='com.forsale.forsale:id/adPriceField']");

    // Method to wait for an element to be present
    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Method to click on the "Next" button
    public void ClickOnNextButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(NextButton));
        driver.findElement(NextButton).click();
    }

    // Method to validate if the error popup is displayed
    public boolean ValidateErrorPopup() {
        By ValidationPopUp = By.xpath("//*[@text='Kindly Fill all the required information!']");
        boolean displayed = false;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        if (driver.findElements(ValidationPopUp).size() > 0) {
            displayed = true;
        }
        return displayed;
    }

    // Method to click on the category field
    public void ClickOnCategoryField() {
        waitForElement(ChooseCategoryDropDown);
        driver.findElement(ChooseCategoryDropDown).click();
    }

    // Method to choose the main category
    public void ChooseMainCategory() {
        waitForElement(MainCategory);
        driver.findElement(MainCategory).click();
    }

    // Method to choose the subcategory
    public void ChooseSubCategory() {
        waitForElement(SubCategory);
        driver.findElement(SubCategory).click();
    }

    // Method to click on the district field
    public void ClickOnDistrictField() {
        waitForElement(Districtfield);
        driver.findElement(Districtfield).click();
    }

    // Method to click on the district location field
    public void ClickOnDistrictLocationField() {
        waitForElement(DistrictLocationField);
        driver.findElement(DistrictLocationField).click();
    }

    // Method to enter text into the title field
    public void EnterTitleField(String title) {
        waitForElement(TitleField);
        driver.findElement(TitleField).sendKeys(title);
    }

    // Method to enter text into the price field
    public void EnterPriceField(String price) {
        waitForElement(PriceField);
        driver.findElement(PriceField).sendKeys(price);
    }
}
