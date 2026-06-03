package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.LoginDataProvider;

public class DataDrivenLoginTest extends BaseTest {

    @Test(dataProvider = "loginData",
          dataProviderClass = LoginDataProvider.class)
    public void loginTest(String email,
                          String password) {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.openLoginPage();

        loginPage.login(email, password);

        System.out.println(
                "Email : " + email);

        System.out.println(
                "Password : " + password);
    }
}