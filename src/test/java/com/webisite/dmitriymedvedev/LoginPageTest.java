package com.webisite.dmitriymedvedev;

import com.website.dmitriymedvedev.HomePage;
import com.website.dmitriymedvedev.LoginPage;
import com.website.dmitriymedvedev.LoginPageXPath;
import com.website.dmitriymedvedev.Waiters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

class LoginPageTest extends BaseTest {

    @Test
    public void testWithEmailInvalidData()  {

        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        switchToNewTab();

        Waiters.waitFor(5);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmail("el");
        loginPage.inputPassword("123456");
        Waiters.waitFor(2);

        By errorMessageBy = By.xpath(LoginPageXPath.ERROR_EMAIL_XPATH);
        WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

        String actualErrorMessage = errorMessageWebElement.getText();
        String expectedErrorMessage = "Неправильная электронная почта";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void testWithWrongCredentials()  {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        switchToNewTab();

        Waiters.waitFor(5);

        LoginPage loginPage = new LoginPage(driver);

        loginPage.inputEmail("elistrate@gmail.com");
        loginPage.inputPassword("123456");
        loginPage.clickButtonEnter();
        Waiters.waitFor(2);

        By wrongCredentialsBy = By.xpath(LoginPageXPath.ERROR_LOGIN_XPATH);
        WebElement errorMessageWebElement = driver.findElement(wrongCredentialsBy);

        String actualErrorMessage = errorMessageWebElement.getText();
        String expectedErrorMessage = "Похоже, произошла ошибка при отправке. Проверьте корректность отправляемых данных или перезагрузите страницу.";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void testResetPasswordPageOpen() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        switchToNewTab();

        Waiters.waitFor(5);

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(6);
        loginPage.clickButtonResetPassword();

        By resetHeaderBy = By.xpath(LoginPageXPath.HEADER_PASSWORD_RESET_XPATH);
        WebElement resetHeaderWebElement = driver.findElement(resetHeaderBy);

        String actualErrorMessage = resetHeaderWebElement.getText();
        String expectedErrorMessage = "Восстановление пароля";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void testVkLoginPageOpen() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        switchToNewTab();

        Waiters.waitFor(5);

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(2);
        loginPage.clickVkLoginButton();
        Waiters.waitFor(3);

        By vkFooterBy = By.xpath(LoginPageXPath.FOOTER_VK_AUTH_XPATH);
        WebElement vkFooterWebElement = driver.findElement(vkFooterBy);

        String actualErrorMessage = vkFooterWebElement.getText();
        String expectedErrorMessage = "Узнать больше о VK ID";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void testRegistrationPageOpen() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        switchToNewTab();

        Waiters.waitFor(5);

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(6);
        loginPage.clickButtonProfileCreate();

        By registrationPageBy = By.xpath(LoginPageXPath.HEADER_REGISTRATION_PAGE_XPATH);
        WebElement registrationPageWebElement = driver.findElement(registrationPageBy);

        String actualMessage = registrationPageWebElement.getText();
        String expectedMessage = "Вход в профиль";

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGoogleLoginPageOpen() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        switchToNewTab();

        Waiters.waitFor(5);

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(3);

        loginPage.clickGoogleLoginButton();
        Waiters.waitFor(3);

        By googleFooterBy = By.xpath(LoginPageXPath.FOOTER_GOOGLE_AUTH_XPATH);
        WebElement googleFooterWebElement = driver.findElement(googleFooterBy);

        String actualMessage = googleFooterWebElement.getText();
        String expectedMessage = "Условия";

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testYandexLoginPageOpen() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        switchToNewTab();

        Waiters.waitFor(5);

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(3);

        loginPage.clickYandexLoginButton();
        Waiters.waitFor(3);

        By yandexFooterBy = By.xpath(LoginPageXPath.FOOTER_YANDEX_AUTH_XPATH);
        WebElement yandexFooterWebElement = driver.findElement(yandexFooterBy);

        String actualMessage = yandexFooterWebElement.getText();
        String expectedMessage = "Яндекс";

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testAppleLoginPageOpen() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        switchToNewTab();

        Waiters.waitFor(5);

        LoginPage loginPage = new LoginPage(driver);
        Waiters.waitFor(3);

        loginPage.clickAppleLoginButton();
        Waiters.waitFor(3);

        By appleFooterBy = By.xpath(LoginPageXPath.FOOTER_APPLE_AUTH_XPATH);
        WebElement appleFooterWebElement = driver.findElement(appleFooterBy);

        String actualMessage = appleFooterWebElement.getText();
        String expectedMessage = "© Apple Inc., 2024 г. Все права защищены.";

        Assertions.assertEquals(expectedMessage, actualMessage);

    }
}
