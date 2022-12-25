package com.krafttechnologie.tests.day8_WebElements2;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class isEnabled {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test() {
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBox = driver.findElement(By.cssSelector("#gridCheck3"));
        System.out.println("checkBox.isEnabled() = " + checkBox.isEnabled());

        Assert.assertFalse(checkBox.isEnabled(),"Fail");

    }
    @Test
    public void test2() {
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBox2= driver.findElement(By.cssSelector("#gridCheck2"));
        System.out.println("checkBox2.isEnabled() = " + checkBox2.isEnabled());


        Assert.assertTrue(checkBox2.isEnabled(),"Fail");

    }
}
