package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage1;
import utilities.Driver;

public class LoginTest {

    @Test
    public  void testLoginPassword() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://codewise.studymate.us/login");

        LoginPage1 loginPage = new LoginPage1();
        loginPage.login("admin@codewise.com", "codewise123", "English");
    }
}


