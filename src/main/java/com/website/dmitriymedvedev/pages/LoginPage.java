package com.website.dmitriymedvedev.pages;

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

    public boolean isEnterButtonEnabled() {
        WebElement enterButton = driver.findElement(By.xpath(LoginPageXPath.BUTTON_ENTER_XPATH));
        return enterButton.isEnabled();
    }

    public WebElement getErrorLoginMessageElement() {
        By wrongCredentialsBy = By.xpath(LoginPageXPath.ERROR_LOGIN_XPATH);
        return driver.findElement(wrongCredentialsBy);
    }

    public WebElement getErrorEmailMessageElement() {
        By errorMessageBy = By.xpath(LoginPageXPath.ERROR_EMAIL_XPATH);
        return driver.findElement(errorMessageBy);
    }

    public WebElement getResetHeaderWebElement() {
        By resetHeaderBy = By.xpath(LoginPageXPath.HEADER_PASSWORD_RESET_XPATH);
        return driver.findElement(resetHeaderBy);
    }

    public WebElement getVkFooterWebElement() {
        By vkFooterBy = By.xpath(LoginPageXPath.FOOTER_VK_AUTH_XPATH);
        return driver.findElement(vkFooterBy);
    }

    public WebElement getRegistrationPageWebElement() {
        By registrationPageBy = By.xpath(LoginPageXPath.HEADER_REGISTRATION_PAGE_XPATH);
        return driver.findElement(registrationPageBy);
    }

    public WebElement getGoogleFooterWebElement() {
        By googleFooterBy = By.xpath(LoginPageXPath.FOOTER_GOOGLE_AUTH_XPATH);
        return driver.findElement(googleFooterBy);
    }

    public WebElement getYandexFooterWebElement() {
        By yandexFooterBy = By.xpath(LoginPageXPath.FOOTER_YANDEX_AUTH_XPATH);
        return driver.findElement(yandexFooterBy);
    }

    public WebElement getAppleFooterWebElement() {
        By appleFooterBy = By.xpath(LoginPageXPath.FOOTER_APPLE_AUTH_XPATH);
        return driver.findElement(appleFooterBy);
    }
}
