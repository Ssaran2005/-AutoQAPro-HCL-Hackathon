package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private By addToCartButton =
        By.xpath("(//a[contains(text(),'Add to cart')])[1]");

    private By blueTopProduct =
        By.xpath("//p[text()='Blue Top']");

    private By searchBox =
            By.id("search_product");

    private By searchButton =
            By.id("submit_search");

    public void searchProduct(String product) {
        

        waitForElement(searchBox)
                .sendKeys(product);

        waitForElement(searchButton)
                .click();
    }
    public boolean isBlueTopDisplayed() {

    return driver.findElement(
            blueTopProduct)
            .isDisplayed();
}
public void addToCart() {

    WebElement element =
            driver.findElement(addToCartButton);

    ((JavascriptExecutor) driver)
            .executeScript(
                    "arguments[0].click();",
                    element);
}
}