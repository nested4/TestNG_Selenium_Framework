package com.krafttechnologie.tests.day12_Actions_FileUpload_JSExecutor;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Actions1 {

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
    public void doubleClick() throws InterruptedException {

        //Action class ileri duzey etkilesimler sunar.
        //doubleclick, dragganddropp, hover, rightclick..vb
        //Action Class Seleniumdan gelir. Webdriver constructor gibi parametre olarak atanir.
        //Cunku driveri browserla etkilesime gecebilmesi icin
        //perform()----> action tamamlamak icin kullanilir.

        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement ciftclick= driver.findElement(By.id("double-click"));

       Actions actions=new Actions(driver);

        Thread.sleep(2000);
            actions.doubleClick(ciftclick).perform();
        Thread.sleep(2000);

    }

    @Test
    public void dragAndDropp() throws InterruptedException {

        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement draggable= driver.findElement(By.id("draggable"));

        WebElement droppable= driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);

        Thread.sleep(2000);

        //actions.dragAndDrop(draggable,droppable).perform();

        actions.moveToElement(draggable).clickAndHold().moveToElement(droppable).release().perform();
        Thread.sleep(2000);

    }

    @Test
    public void draggAndDropp2() throws InterruptedException {

        driver.get("https://www.krafttechexlab.com/javascript/droppable");

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        Thread.sleep(3000);

        actions.dragAndDrop(source,target).perform();

        System.out.println("droppable.getText() = " + target.getText());
        String excep="Dropped!";
        Assert.assertEquals(target.getText(),excep);
    }
    @Test
    public void hover1() throws InterruptedException {

        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement hoverME=driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        WebElement link1= driver.findElement(By.xpath("(//a[.='Link 1'])[1]"));

        Thread.sleep(3000);
        Actions actions=new Actions(driver);

        actions.moveToElement(hoverME).perform();
        Thread.sleep(3000);

        Assert.assertTrue(link1.isDisplayed());

        link1.click();

        Alert alert=driver.switchTo().alert();

        System.out.println("alert.getText() = " + alert.getText());

        String actualtext= alert.getText();
        String expectedText= "Well done you clicked on the link!";

        Assert.assertEquals(actualtext,expectedText);

        Thread.sleep(2000);

        alert.accept();

    }
    @Test
    public void hover2() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/components/tooltips");

        WebElement hovertool= driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]"));

        WebElement ontop= driver.findElement(By.xpath("//button[@data-bs-placement='top']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(hovertool).perform();
        Thread.sleep(2000);

        String expected="top";

        String actual=ontop.getAttribute("data-bs-placement");

        Assert.assertEquals(actual,expected);

        List<WebElement> hovers= driver.findElements(By.xpath("//button[@class='btn btn-secondary']"));

        for(WebElement hover: hovers){
            actions.moveToElement(hover).pause(2000).perform();
        }
    }

        @Test
    public void rightClick() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");

        WebElement right=driver.findElement(By.id("rightClickBtn"));

        Actions actions= new Actions(driver);

        actions.contextClick(right).perform();

        Thread.sleep(2000);

        WebElement msj= driver.findElement(By.id("rightClickMessage"));

        String expected= "You have done a right click";
        String actual= msj.getText();

        Assert.assertEquals(actual,expected,"FAIL");

        }

}


