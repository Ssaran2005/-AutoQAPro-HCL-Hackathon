package utils;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][]{

                {"valid@email.com", "validpassword"},
                {"invalid@email.com", "wrongpassword"}

        };
    }
}
