package testCases;

import Pages.ChooseLocationPage;
import Pages.PostAdPage;
import Utils.TestDataLoader;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

// PostAdTC class represents a test case for posting an advertisement
public class PostAdTC extends TestBase {

    // Test method to simulate the post advertisement flow

    @Test(testName = "Post ad")
    public void PostAdFlow() throws InterruptedException {
        // Retrieve title and price from test data
        String title = TestDataLoader.getTitle();
        String price = TestDataLoader.getPrice();

        // Initialize the PostAdPage object using the appiumDriver from the parent class TestBase
        PostAdPage postAdPage = new PostAdPage(super.appiumDriver);

        // Click on the Category Field
        postAdPage.ClickOnCategoryField();

        // Choose the Main category
        postAdPage.ChooseMainCategory();
        // Choose the Sub category
        postAdPage.ChooseSubCategory();
        // Click on the District Field
        postAdPage.ClickOnDistrictField();
        //Click on the District Location Field
        postAdPage.ClickOnDistrictLocationField();

        // Initialize the ChooseLocationPage object using the appiumDriver from the parent class TestBase
        ChooseLocationPage chooselocation = new ChooseLocationPage(super.appiumDriver);

        // Choose the district and proceed
        chooselocation.ChooseDistrict();
        chooselocation.ClickonDone();

        // Choose the area and proceed
        chooselocation.ClickonAreaField();
        chooselocation.ChooseArea();
        chooselocation.ClickonDone();

        // Choose the block and proceed
        chooselocation.ClickOnBlockField();
        chooselocation.ChooseBlock();
        chooselocation.ClickonDone();

        // Confirm the chosen location
        chooselocation.ClickOnConfirmLocation();

        // Enter the title and price for the advertisement
        postAdPage.EnterTitleField(title);
        postAdPage.EnterPriceField(price);
        // Click on the next button to proceed
        postAdPage.ClickOnNextButton();
    }
}
