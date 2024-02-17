package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostAddPage extends PageBase {
    public PostAddPage(AppiumDriver driver) {
        super(driver);
    }
    private By NextButton = By.xpath("//*[@text='Next']");
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

    public void ChooseMainCategory() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(ChooseCategoryDropDown).click();
    }
    public void ChooseSubCategory() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(SubCategory).click();
    }

}
