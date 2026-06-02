package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowserTest extends BaseTest {

    @Test
    public void verifyWebsiteTitle() {

        String title = driver.getTitle();

        System.out.println(title);

        Assert.assertTrue(title.length() > 0);
    }
}