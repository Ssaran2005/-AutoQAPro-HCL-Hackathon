package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private By viewCartLink =
            By.linkText("View Cart");

    private By blueTopInCart =
            By.xpath("//a[contains(text(),'Blue Top')]");

    public void openCart() {

        waitForElement(viewCartLink)
                .click();
    }

    public boolean isProductInCart() {

        return driver.findElement(
                blueTopInCart)
                .isDisplayed();
    }
}