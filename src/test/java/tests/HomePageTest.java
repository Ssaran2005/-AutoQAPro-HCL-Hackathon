package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {

        HomePage homePage = new HomePage(driver);

        String title = homePage.getPageTitle();

        System.out.println(title);

        Assert.assertTrue(title.length() > 0);
    }
}