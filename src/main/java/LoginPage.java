

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vstasiuk
 */
public class LoginPage {

    /** UI Mappings */

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "identifierId")
            public WebElement loginInput;

    public  void enterText(String loginText) {
        System.out.println("Entering user's email");
        loginInput.clear();
        loginInput.sendKeys(loginText);

    }

    @FindBy (css = ".qhFLie .snByac")
            public WebElement NextButton;

    public void clickButton() {
        System.out.println("Clicking NEXT button");
        NextButton.click();
    }
/*

    By LoginInput = By.id("identifierId");
    By PasswordInput = By.id("inputPassword");
    By RememberMeCheckbox = By.xpath("//LABEL[@class='custom-checkbox']");
    By LoginButton = By.xpath("//BUTTON[@type='submit'][text()='Login']");
    By ForgotPassword = By.linkText("Forgot Password?");

*/

    /* Page Methods */
/*
   public LoginPage enterUserName (String user) {
        reporter.info("Entering username " + user);
        findElement(LoginInput).clear();
        findElement(LoginInput).sendKeys(user);
        return this;
    }

    public LoginPage enterUserName (String user) {
        findElement(LoginInput).sendKeys(user);
        return this;
    }


    public void enterEmail (String user) {
        reporter.info("Entering email " + user);
        findElement(LoginInput).sendKeys(user);
    }

    public void enterPassword (String pass) {
        reporter.info("Entering password " + pass);
        findElement(PasswordInput).sendKeys(pass);
    }

    public void clickLoginButton () {
        reporter.info("Click on Login button");
        findElement(LoginButton).click();

    }

    public void clickOnRememberMeCheckbox() {
        reporter.info("Click on Remember me checkbox");
        findElement(RememberMeCheckbox).click();
    }


    public void clickOnForgotPasswordLink () {
        reporter.info("Click on forgot password link");
        findElement(ForgotPassword).click();
    }





    public void baseLogin() {
        enterEmail(user.getEmail());
        enterPassword(user.getPassword());
        clickLoginButton();
        Assert.assertTrue(pageHeader.isLogoutLinkDisplayed());
        Assert.assertTrue(pageHeader.getProfileLinkText().contains(user.getProfileText()), "Expected user account was not opened");
    }
*/

}
