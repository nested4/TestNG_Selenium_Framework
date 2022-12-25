package com.krafttechnologie.tests.day8_WebElements2;

import org.testng.Assert;
import org.testng.annotations.*;

public class SummaryOfTheLastLesson {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before suit runs");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test run");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class run");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method run");
    }

    @Test
    public void test1(){
        Assert.assertTrue(4>2);
    }

    @Test
    public void test2(){
        Assert.assertFalse(3>2);
    }

    @Test
    public void test3(){
        Assert.assertEquals(1,1);
    }

    @AfterMethod

    public void afterMethod(){
        System.out.println("Afeter Method runs");
    }

    @AfterClass

    public void afterClass(){
        System.out.println("Afeter Class runs");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test runs");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("After Suit runs");
    }
}
