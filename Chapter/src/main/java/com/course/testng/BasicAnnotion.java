package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotion {

    @Test
    public void test1(){
        System.out.println("这是测试用例1\n");
    }

    @Test
    public void test2(){
        System.out.println("这是测试用例2\n");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的\n");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的\n");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的\n");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行之后运行的\n");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite\n");

    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite\n");
    }
}
