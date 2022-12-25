package com.krafttechnologie.tests.day12_Actions_FileUpload_JSExecutor;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload {

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
    public void uploadFile() throws InterruptedException {

        //choose file elementini locate ediyoruz
        //sonrasinda sendKeys(file path)
        //File Path:
        //Windows icin: shift tusu+ dosya uzerinde sag click yapip Copy asPath seciyoruz
        //Mac icin: sag click+ option key+ Copy.....as PAthName (yol Adi olarak kopyala)

        driver.get("https://demoqa.com/upload-download");

        WebElement chooseFile= driver.findElement(By.id("uploadFile"));
        Thread.sleep(2000);

        chooseFile.sendKeys("C:\\Users\\admin\\Desktop\\Deneme Text.pdf");

        WebElement testmsj= driver.findElement(By.cssSelector("#uploadedFilePath"));

        System.out.println("testmsj = " + testmsj.getText());

        String actual= testmsj.getText();
        String expected="Deneme Text.pdf";

        Assert.assertTrue(actual.contains(expected));

    }

    @Test
    public void uploadFile2(){
        /*
        test folder uzerinde sag clcik Directory sec+ resources sec
        file copy et resources uzerne uzantisi .txt olacak sekilde paste yap
        Sonra projenin sistemdeki path ini aliyoruz:
        String projectPath= System.getProperty("user.dir");

        String FilePath= "src/test/resources/Deneme Text.txt"

         */

        driver.get("https://demoqa.com/upload-download");

        WebElement chooseFile= driver.findElement(By.id("uploadFile"));

        String projectPath= System.getProperty("user.dir");
        String FilePath= "src/test/resources/Deneme Text.txt";

        String fullPath= projectPath+"/"+FilePath;

        chooseFile.sendKeys(fullPath);

        WebElement testmsj= driver.findElement(By.cssSelector("#uploadedFilePath"));

        System.out.println("testmsj = " + testmsj.getText());

        String actual= testmsj.getText();
        String expected="Deneme Text.txt";

        Assert.assertTrue(actual.contains(expected));



    }

}
