package com.krafttechnologie.tests.day07_TestNG;

import org.testng.annotations.*;

public class BeforeAfterMethod {


    @BeforeClass
    public void setUpClass() {
        System.out.println("---- Before Class-----");
    }


    @Test
    @Ignore
    public void logOut() {
        System.out.println("First Test Case LogOut");

    }


    @Test
    public void logIn() {
        System.out.println("Second Test Case LogIn");
    }


    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    // @Test
    public void comment() {
        System.out.println("Test Case Comment");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }


    @Test
    public void register() {
        System.out.println("Third Test Case Register");
    }


    @AfterClass
    public void tearDownClass() {
        System.out.println("-----After Class ------");
    }

}
