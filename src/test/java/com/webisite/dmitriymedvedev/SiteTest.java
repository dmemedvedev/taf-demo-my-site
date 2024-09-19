package com.webisite.dmitriymedvedev;

import com.website.dmitriymedvedev.HomePage;
import com.website.dmitriymedvedev.LoginPage;
import com.website.dmitriymedvedev.Waiters;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SiteTest {

    @Test
    public void testWithEmptyData()  {
        WebDriver driver = new ChromeDriver();
        String URL = "http://skillbox.ru";
        driver.get(URL);
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();
        Waiters.waitFor(3);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonEnter();

    }
}
