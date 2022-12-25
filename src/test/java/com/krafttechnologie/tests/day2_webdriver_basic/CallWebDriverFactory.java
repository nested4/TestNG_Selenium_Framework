package com.krafttechnologie.tests.day2_webdriver_basic;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechnologie.com/");

        Thread.sleep(3000);

        driver.close();

        /**
         * Task
         * go to http://www.krafttechexlab.com/  website
         * expected title = Dashboard- Kraft Techex Lab - aFm
         * get title and verify that expected title equal actual title
         */




    }
}
