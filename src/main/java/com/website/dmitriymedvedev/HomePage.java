package com.website.dmitriymedvedev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        By buttonLoginBy = By.xpath(HomePageXPath.BUTTON_LOGIN_XPATH);
        WebElement buttonLogin = driver.findElement(buttonLoginBy);
        buttonLogin.click();
    }

    public void clickButtonCatalog() {
        By buttonCatalogBy = By.xpath(HomePageXPath.BUTTON_CATALOG_XPATH);
        WebElement buttonCatalog = driver.findElement(buttonCatalogBy);
        buttonCatalog.click();
    }

    public void inputSkillsSearch(String skills) {
        By inputSkillsBy = By.xpath(HomePageXPath.INPUT_SKILLS_SEARCH_XPATH);
        WebElement inputEmail = driver.findElement(inputSkillsBy);
        inputEmail.sendKeys(skills);
    }

    public void clickButtonFindInCatalog() {
        By buttonFindInCatalogBy = By.xpath(HomePageXPath.BUTTON_SEARCH_CATALOG_XPATH);
        WebElement buttonFindInCatalog = driver.findElement(buttonFindInCatalogBy);
        buttonFindInCatalog.click();
    }
}
