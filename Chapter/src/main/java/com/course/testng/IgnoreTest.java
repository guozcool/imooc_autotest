package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void testIgnore1(){
        System.out.println("ignore1 执行");
    }

    @Test(enabled = false)
    public void testIgnore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void testIgnore3(){
        System.out.println("ignore3 执行");
    }



}
