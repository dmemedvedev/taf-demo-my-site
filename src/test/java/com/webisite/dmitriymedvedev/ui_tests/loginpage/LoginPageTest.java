package com.webisite.dmitriymedvedev.ui_tests.loginpage;

import com.webisite.dmitriymedvedev.ui_tests.BaseTest;
import com.website.dmitriymedvedev.constants.Messages;
import com.website.dmitriymedvedev.pages.HomePage;
import com.website.dmitriymedvedev.pages.LoginPage;
import com.website.dmitriymedvedev.pages.LoginPageXPath;
import com.website.dmitriymedvedev.testdata.TestDataGenerator;
import com.website.dmitriymedvedev.utils.Waiters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class LoginPageTest extends BaseTest {

    private void initializeLoginTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();
        switchToNewTab();
        Waiters.waitFor(5);
    }

    @Test
    public void testWithEmailInvalidData() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmail(TestDataGenerator.generateInvalidEmail());
        loginPage.inputPassword(TestDataGenerator.generatePassword());
        Waiters.waitFor(2);

        WebElement errorMessageWebElement = loginPage.getErrorEmailMessageElement();

        String actualErrorMessage = errorMessageWebElement.getText();
        String expectedErrorMessage = Messages.EXPECTED_INCORRECT_EMAIL_MESSAGE;

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void testWithWrongCredentials() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.inputEmail(TestDataGenerator.generateEmail());
        loginPage.inputPassword(TestDataGenerator.generatePassword());
        loginPage.clickButtonEnter();
        Waiters.waitFor(2);

        WebElement errorMessageWebElement = loginPage.getErrorLoginMessageElement();

        String actualErrorMessage = errorMessageWebElement.getText();
        String expectedErrorMessage = Messages.EXPECTED_WRONG_CREDENTIALS_MESSAGE;

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void testResetPasswordPageOpen() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(6);
        loginPage.clickButtonResetPassword();

        WebElement resetHeaderWebElement = loginPage.getResetHeaderWebElement();

        String actualMessage = resetHeaderWebElement.getText();
        String expectedMessage = Messages.EXPECTED_RESET_PASSWORD_PAGE_MESSAGE;

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testVkLoginPageOpen() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(2);
        loginPage.clickVkLoginButton();
        Waiters.waitFor(3);

        WebElement vkFooterWebElement = loginPage.getVkFooterWebElement();

        String actualMessage = vkFooterWebElement.getText();
        String expectedMessage = Messages.EXPECTED_VK_LOGIN_FOOTER_MESSAGE;

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testRegistrationPageOpen() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(6);
        loginPage.clickButtonProfileCreate();

        WebElement registrationPageWebElement = loginPage.getRegistrationPageWebElement();

        String actualMessage = registrationPageWebElement.getText();
        String expectedMessage = Messages.EXPECTED_CREATE_PROFILE_PAGE_MESSAGE;

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGoogleLoginPageOpen() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(3);

        loginPage.clickGoogleLoginButton();
        Waiters.waitFor(3);

        WebElement googleFooterWebElement = loginPage.getGoogleFooterWebElement();

        String actualMessage = googleFooterWebElement.getText();
        String expectedMessage = Messages.EXPECTED_GOOGLE_LOGIN_PAGE_MESSAGE;

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testYandexLoginPageOpen() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(3);

        loginPage.clickYandexLoginButton();
        Waiters.waitFor(3);

        WebElement yandexFooterWebElement = loginPage.getYandexFooterWebElement();

        String actualMessage = yandexFooterWebElement.getText();
        String expectedMessage = Messages.EXPECTED_YANDEX_LOGIN_PAGE_MESSAGE;

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testAppleLoginPageOpen() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(3);

        loginPage.clickAppleLoginButton();
        Waiters.waitFor(3);

        WebElement appleFooterWebElement = loginPage.getAppleFooterWebElement();

        String actualMessage = appleFooterWebElement.getText();
        String expectedMessage = Messages.EXPECTED_APPLE_LOGIN_PAGE_MESSAGE;

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testWithEmptyDataFields() {
        initializeLoginTest();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.inputEmail("");
        loginPage.inputPassword("");

        Assertions.assertFalse(loginPage.isEnterButtonEnabled(), "Кнопка активна при незаполненных полях");
    }
}
