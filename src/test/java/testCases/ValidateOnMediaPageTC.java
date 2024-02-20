package testCases;

import Pages.AddMediaPageBase;
import Pages.PostAdPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateOnMediaPageTC {
    @Test
    public void  ValidateOnErrorMessage() throws InterruptedException{
       AddMediaPageBase addMediaPage = new AddMediaPageBase(super.appiumDriver);
         pageTitle = addMediaPage.AsseronMediaPage();
         Assert.assertEquals(pageTitle,"Add Media");
    }


}
