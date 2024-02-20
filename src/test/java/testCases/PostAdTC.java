package testCases;

import Pages.ChooseLocationPage;
import Pages.PostAdPage;
import Utils.TestDataLoader;
import org.testng.annotations.Test;

public class PostAdTC extends  TestBase {
    @Test
    public void  PostAdFlow() throws InterruptedException{
        String title = TestDataLoader.getTitle();
        String price =TestDataLoader.getPrice();
        PostAdPage postAdPage =new PostAdPage(super.appiumDriver);

        postAdPage.ClickOnCategoryField();
        postAdPage.ChooseMainCategory();
        postAdPage.ChooseSubCategory();
        postAdPage.ClickOnDistrictField();
        postAdPage.ClickOnDistrictLocationField();

        ChooseLocationPage chooselocation= new ChooseLocationPage(super.appiumDriver);
        chooselocation.ChooseDistrict();
        chooselocation.ClickonDone();

        chooselocation.ClickonAreaField();
        chooselocation.ChooseArea();
        chooselocation.ClickonDone();

        chooselocation.ClickOnBlockField();
        chooselocation.ChooseBlock();
        chooselocation.ClickonDone();

        chooselocation.ClickOnConfirmLocation();

        postAdPage.EnterTitleField(title);
        postAdPage.EnterPriceField(price);
        postAdPage.ClickOnNextButton();
    }
}
