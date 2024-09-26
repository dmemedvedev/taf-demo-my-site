package com.webisite.dmitriymedvedev.ui_tests.homepage;

import com.webisite.dmitriymedvedev.ui_tests.BaseTest;
import com.website.dmitriymedvedev.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogTest extends BaseTest {

    @Test
    public void testFullNameQAProfessionSearch(){
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonCatalog();

        Waiters.waitFor(5);

        homePage.inputSkillsSearch("Тестирование");
        homePage.clickButtonFindInCatalog();
        Waiters.waitFor(4);

        By foundedProfessionBy = By.xpath(HomePageXPath.QA_PROFESSION_XPATH);
        WebElement foundedProfessionWebElement = driver.findElement(foundedProfessionBy);

        String actualProfessionName = foundedProfessionWebElement.getText();
        String expectedProfessionName = Messages.EXPECTED_QA_PROFESSION_MESSAGE;

        Assertions.assertEquals(expectedProfessionName,actualProfessionName);
    }

    @Test
    public void testPartNameDesignProfessionSearch(){
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonCatalog();

        Waiters.waitFor(5);

        homePage.inputSkillsSearch("Дизайн");
        homePage.clickButtonFindInCatalog();
        Waiters.waitFor(4);

        By foundedProfessionBy = By.xpath(HomePageXPath.DESIGN_PROFESSION_XPATH);
        WebElement foundedProfessionWebElement = driver.findElement(foundedProfessionBy);

        String actualProfessionName = foundedProfessionWebElement.getText();
        String expectedProfessionName = Messages.EXPECTED_DESIGN_PROFESSION_MESSAGE;

        Assertions.assertEquals(expectedProfessionName,actualProfessionName);
    }
}
