package com.krafttechnologie.tests.day8_WebElements2;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class isSelected_CheckBox {


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
    public void test() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBox1= driver.findElement(By.cssSelector("#gridCheck1"));
        WebElement checkBox2= driver.findElement(By.cssSelector("#gridCheck2"));

        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

        Assert.assertFalse(checkBox1.isSelected(),"FAIL");
        Assert.assertTrue(checkBox2.isSelected(),"FAIL");

        Thread.sleep(2000);
        checkBox1.click();

        Assert.assertTrue(checkBox1.isSelected(),"FAIL");
        Assert.assertTrue(checkBox2.isSelected(),"FAIL");



    }

}
