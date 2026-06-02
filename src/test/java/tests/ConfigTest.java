package tests;

import org.testng.annotations.Test;
import utils.ConfigReader;

public class ConfigTest {

    @Test
    public void readConfig() {

        System.out.println(ConfigReader.getProperty("browser"));
        System.out.println(ConfigReader.getProperty("baseUrl"));
    }
}