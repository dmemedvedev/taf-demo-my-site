package com.website.dmitriymedvedev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonEnter() {
        By buttonEnterBy = By.xpath(LoginPageXPath.BUTTON_ENTER_XPATH);
        WebElement buttonEnter = driver.findElement(buttonEnterBy);
        buttonEnter.click();
    }

    public void inputEmail(String email) {
        By inputEmailBy = By.xpath(LoginPageXPath.INPUT_EMAIL_XPATH);
        WebElement inputEmail = driver.findElement(inputEmailBy);
        inputEmail.sendKeys(email);
    }

    public void inputPassword(String password) {
        By inputPasswordBy = By.xpath(LoginPageXPath.INPUT_PASSWORD_XPATH);
        WebElement inputPassword = driver.findElement(inputPasswordBy);
        inputPassword.sendKeys(password);
    }

    public void clickButtonResetPassword() {
        By buttonResetPasswordBy = By.xpath(LoginPageXPath.BUTTON_PASSWORD_RESET_XPATH);
        WebElement buttonResetPassword = driver.findElement(buttonResetPasswordBy);
        buttonResetPassword.click();
    }


    public void clickVkLoginButton() {
        By buttonVKLoginBy = By.xpath(LoginPageXPath.BUTTON_VK_XPATH);
        WebElement buttonVkLogin = driver.findElement(buttonVKLoginBy);
        buttonVkLogin.click();
    }

    public void clickButtonProfileCreate() {
        By buttonProfileCreateBy = By.xpath(LoginPageXPath.BUTTON_PROFILE_CREATE_XPATH);
        WebElement buttonProfileCreate = driver.findElement(buttonProfileCreateBy);
        buttonProfileCreate.click();
    }

    public void clickGoogleLoginButton() {
        By buttonGoogleLoginBy = By.xpath(LoginPageXPath.BUTTON_GOOGLE_XPATH);
        WebElement buttonGoogleLogin = driver.findElement(buttonGoogleLoginBy);
        buttonGoogleLogin.click();
    }

    public void clickYandexLoginButton() {
        By buttonYandexLoginBy = By.xpath(LoginPageXPath.BUTTON_YANDEX_XPATH);
        WebElement buttonYandexLogin = driver.findElement(buttonYandexLoginBy);
        buttonYandexLogin.click();
    }

    public void clickAppleLoginButton() {
        By buttonAppleLoginBy = By.xpath(LoginPageXPath.BUTTON_APPLE_XPATH);
        WebElement buttonAppleLogin = driver.findElement(buttonAppleLoginBy);
        buttonAppleLogin.click();
    }
}
