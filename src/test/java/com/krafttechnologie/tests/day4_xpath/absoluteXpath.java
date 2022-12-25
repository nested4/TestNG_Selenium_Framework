package com.krafttechnologie.tests.day4_xpath;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class absoluteXpath {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com");
        driver.manage().window().maximize();

        String actualtext= driver.findElement(By.xpath("/html/body/main/div/h1")).getText();

        System.out.println("actualtext = " + actualtext);
    }
}
