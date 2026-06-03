package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {

        driver.get(
                "https://automationexercise.com/products");

        ProductPage productPage =
                new ProductPage(driver);

        CartPage cartPage =
                new CartPage(driver);

        productPage.searchProduct("Blue Top");

productPage.addToCart();
        cartPage.openCart();

        Assert.assertTrue(
                cartPage.isProductInCart());

        System.out.println(
                "Product Found In Cart");
    }
}