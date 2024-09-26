package com.webisite.dmitriymedvedev.ui_tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class BaseTest {
    protected WebDriver driver;
    private String originalWindow;

    @BeforeEach
    public void setUpDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

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
    public void afterEach() {
        driver.quit();
    }
}
