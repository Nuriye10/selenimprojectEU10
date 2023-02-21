package com.cydeo.test.day5_testNG_intro_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_intro1 {
    @BeforeClass
    public void SetupMethod(){

        System.out.println("BeforeClass is running!");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("AfterClass is running!");
    }

    @BeforeMethod
    public void setUpMethod(){

        System.out.println("--->BeforeMethod is running!");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---->AfterMethod is running!");

    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running...");

        //ASSERT EQUALS : compare 2 of the same things
        String actual ="apple";
        String expected ="apple";

        Assert.assertEquals("actual","actual" );


    }
     @Test
    public void test2(){

        System.out.println("Test 2 is running....");
    }



}
