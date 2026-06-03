package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPageOpens() {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.openLoginPage();

        Assert.assertTrue(true);
    }
}
