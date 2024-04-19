package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage1 {

    public LoginPage1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "email")
    public WebElement login;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//div[@role='button']")
    public WebElement Language;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement LoginButton1;

    public void login(String mail, String passw, String language) {
        login.sendKeys(mail);
        password.sendKeys(passw);
        Language.click(language);
        LoginButton1.click();

    }
}
