package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By signupLoginBtn =
            By.xpath("//a[contains(text(),'Signup / Login')]");

    private By emailField =
            By.xpath("//input[@data-qa='login-email']");

    private By passwordField =
            By.xpath("//input[@data-qa='login-password']");

    private By loginButton =
            By.xpath("//button[@data-qa='login-button']");

    private By logoutButton =
            By.xpath("//a[contains(text(),'Logout')]");

    public void openLoginPage() {

        waitForElement(signupLoginBtn).click();
    }

    public void login(String email,
                      String password) {

        waitForElement(emailField)
                .sendKeys(email);

        waitForElement(passwordField)
                .sendKeys(password);

        waitForElement(loginButton)
                .click();
    }

    public boolean isLogoutDisplayed() {

        return waitForElement(logoutButton)
                .isDisplayed();
    }
}