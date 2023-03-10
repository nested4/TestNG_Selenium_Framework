package com.krafttechnologie.tests.day8_WebElements2;

import com.krafttecnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAttribute {

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
        driver.get("https://demoqa.com/radio-button");
        WebElement yesButton= driver.findElement(By.cssSelector("#yesRadio"));

        System.out.println("yesButton.getAttribute(\"type\") = " + yesButton.getAttribute("type"));
        System.out.println("yesButton.getAttribute(\"name\") = " + yesButton.getAttribute("name"));

        driver.findElement(By.xpath("//label[.='Yes']")).click();
        Thread.sleep(2000);


    }
}
