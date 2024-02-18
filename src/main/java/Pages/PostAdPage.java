package Pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostAdPage extends PageBase {
    public PostAdPage(AppiumDriver driver) {
        super(driver);
    }
    private By NextButton = By.xpath("//*[@text='Next']");

    private By ValidationPopUp = By.xpath("//*[@text='Kindly Fill all the required information!']");
    private By ChooseCategoryDropDown = By.id("com.forsale.forsale:id/navgraph_postad");
    private By MainCategory = By.id("com.forsale.forsale:id/navgraph_postad");
    private By SubCategory = By.id("com.forsale.forsale:id/navgraph_postad");

    private By TitleField = By.id("com.forsale.forsale:id/navgraph_postad");

    private By PriceField = By.id("com.forsale.forsale:id/navgraph_postad");

    public void ClickOnNextButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(NextButton));
        driver.findElement(NextButton).click();
    }

    public boolean ValidateErrorPopup (){
        boolean displayed = false ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        if (driver.findElements(ValidationPopUp).size() > 0) {
            displayed =true;
        }
        return displayed ;
    }

    public void ChooseMainCategory() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(ChooseCategoryDropDown).click();
    }
    public void ChooseSubCategory() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(SubCategory).click();
    }

}