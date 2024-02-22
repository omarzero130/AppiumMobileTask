package testCases;

import Pages.AddMediaPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

// ValidateOnMediaPageTC class represents a test case for validating the title of the media page
public class ValidateOnMediaPageTC extends TestBase {

    // Variable to store the page title
    private String pageTitle;

    // Test method to validate the title of the media page
    @Test(testName = "Validate on Media Page title")
    public void ValidateOnMediaPageTitle() {
        // Initialize the AddMediaPageBase object using the appiumDriver from the parent class TestBase
        AddMediaPageBase addMediaPage = new AddMediaPageBase(super.appiumDriver);
        // Retrieve the page title
        pageTitle = addMediaPage.AssertonMediaPage();
        // Assert that the retrieved page title matches the expected title "Add Media"
        Assert.assertEquals(pageTitle, "Add Media");
    }
}
