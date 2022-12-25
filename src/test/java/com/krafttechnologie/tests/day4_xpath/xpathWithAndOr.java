package com.krafttechnologie.tests.day4_xpath;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathWithAndOr {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");

        //WebElement searchbox= driver.findElement(By.xpath("//input[@type='text' and @class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));
        WebElement searchbox= driver.findElement(By.xpath("//input[@type='ddtddext' or @class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));


        searchbox.sendKeys("JAVA");

    }
}
