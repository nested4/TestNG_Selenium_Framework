package com.krafttechnologie.tests.day9_Webelements3;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.jsoup.select.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownPractice1 {

    WebDriver driver;

    @BeforeClass
    public void setUP() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        /*
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. DropDowns Menusunden SQL,TestNG ve CSS sec
     */
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement dropDownMenu1 = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
        Select selectOptions = new Select(dropDownMenu1);
        selectOptions.selectByValue("sql");

        Thread.sleep(2000);
        WebElement dropDownMenu2 = driver.findElement(By.cssSelector("#dropdowm-menu-2"));
        Select selectOptions2 = new Select(dropDownMenu2);
        selectOptions2.selectByIndex(2);

        Thread.sleep(2000);
        WebElement dropDownMenu3 = driver.findElement(By.cssSelector("#dropdowm-menu-3"));
        Select selectOptions3 = new Select(dropDownMenu3);
        selectOptions3.selectByVisibleText("CSS");


    }
}