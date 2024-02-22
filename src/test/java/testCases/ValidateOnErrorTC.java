package testCases;

import Pages.PostAdPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

// ValidateOnErrorTC class represents a test case for validating error messages when user try to proceed without selecting category
public class ValidateOnErrorTC extends TestBase {

    // Boolean variable to track whether the error popup is displayed
    private boolean isDisplayed;

    // Test method to validate the error message

    @Test(testName = "Validate on Error Message")
    public void ValidateOnErrorMessage() throws InterruptedException {

        // Initialize the PostAdPage object using the appiumDriver from the parent class TestBase
        PostAdPage postAdPage = new PostAdPage(super.appiumDriver);

        // Click on the next button to proceed, which may trigger an error popup
        postAdPage.ClickOnNextButton();

        // Validate if the error popup is displayed
        isDisplayed = postAdPage.ValidateErrorPopup();

        // Assert that the error popup is displayed, if not, fail the test with a custom failure message
        Assert.assertTrue(isDisplayed, "Validation pop up is displayed");
    }
}
