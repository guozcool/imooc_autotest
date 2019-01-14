package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = "server")
    public void testserver1(){
        System.out.println("这是服务端的测试方法111111");
    }

    @Test(groups = "server")
    public void testserver2(){
        System.out.println("这是服务端的测试方法222222");
    }


    @Test(groups = "client")
    public void testclient3(){
        System.out.println("这是客户端的测试方法333333");
    }

    @Test(groups = "client")
    public void tesclient4(){
        System.out.println("这是客户端的测试方法444444");
    }

    @BeforeGroups("server")
    public void beforeGroupServer(){
        System.out.println("这是服务端组测试开始-------");
    }

    @AfterGroups("server")
    public void afterGroupServer(){
        System.out.println("这是服务端组测试结束===========");
    }

    @BeforeGroups("client")
    public void beforeGroupClient(){
        System.out.println("这是客户端组测试开始-------");
    }

    @AfterGroups("client")
    public void afterGroupClient(){
        System.out.println("这是客户端组测试结束===========");
    }

}
