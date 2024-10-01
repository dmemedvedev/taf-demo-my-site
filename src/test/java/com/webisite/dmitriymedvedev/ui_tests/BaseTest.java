package com.webisite.dmitriymedvedev.ui_tests;

import com.website.dmitriymedvedev.driver.DriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BaseTest {
    protected WebDriver driver;
    private String originalWindow;

    @BeforeEach
    public void setUpDriver() {
        driver = DriverSingleton.getDriver();
        driver.get("https://skillbox.ru/");
        originalWindow = driver.getWindowHandle();
    }

    public void switchToNewTab() {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    public void switchToOriginalTab() {
        driver.switchTo().window(originalWindow);
    }

    @AfterEach
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}