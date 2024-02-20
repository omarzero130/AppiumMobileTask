package testCases;

import Pages.*;
import org.testng.annotations.Test;

public class LoginTC extends TestBase{
    private HomePage homepage;
    private LoginPage loginpage ;
    PostAdPage postAdPage;
    ChooseLocationPage chooselocation;
    boolean isDisplayed;

    AddMediaPageBase addMediaPage;

    String pageTitle;

    public LoginTC(){
        super();
    }

//    @Test
//    public void testLogin() {
//        String username = TestDataLoader.getUsername();
//        String password = TestDataLoader.getPassword();
//
//        System.out.println("Credentials is"+username + password);
//
//        // Perform login using username and password
//    }
    @Test
    public void login () throws InterruptedException {
        homepage = new HomePage(super.appiumDriver);
        homepage.clickOnPostAddButton();
        loginpage = new LoginPage(super.appiumDriver);
        loginpage.LoginToApp();
        postAdPage =new PostAdPage(super.appiumDriver);
//        postAdPage.ClickOnNextButton();
//        isDisplayed= postAdPage.ValidateErrorPopup();
//        Assert.assertTrue(isDisplayed,"Validation pop up is displayed");
        //postAdPage.ClickOnCategoryField();
//        postAdPage.ChooseMainCategory();
//        postAdPage.ChooseSubCategory();
//        postAdPage.ClickOnDistrictField();
//        postAdPage.ClickOnDistrictLocationField();
//        chooselocation= new ChooseLocationPage(super.appiumDriver);
//        chooselocation.ChooseDistrict();
//        chooselocation.ClickonDone();
//        chooselocation.ClickonAreaField();
//        chooselocation.ChooseArea();
//        chooselocation.ClickonDone();
//        chooselocation.ClickOnBlockField();
//        chooselocation.ChooseBlock();
//        chooselocation.ClickonDone();
//        chooselocation.ClickOnConfirmLocation();
//        postAdPage.EnterTitleField();
//        postAdPage.EnterPriceField();
//        postAdPage.ClickOnNextButton();
//        addMediaPage = new AddMediaPageBase(super.appiumDriver);
//         pageTitle = addMediaPage.AsseronMediaPage();
//         Assert.assertEquals(pageTitle,"Add Media");

    }

}
