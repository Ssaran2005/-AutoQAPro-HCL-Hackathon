package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void searchProductTest() {

        driver.get("https://automationexercise.com/products");

        ProductPage productPage =
                new ProductPage(driver);

        productPage.searchProduct("Blue Top");

        System.out.println(
                "Product Search Completed");
    }
}