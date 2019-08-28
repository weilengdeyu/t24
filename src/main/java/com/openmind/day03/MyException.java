package com.openmind.day03;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @Classname MyException
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/28 10:01
 * @Created by Happy-微冷的雨
 */
public class MyException {
    public void test() throws SQLException,IOException {
        System.out.println("xxxxxxx");
        //为什么在我们自己的软件系统，程序员需要主动抛出异常？？？
        //通过异常作为控制程序流程的手段！！
        //为了业务的需要
        if (0==0){ //除数为零
            //U1
            throw new SQLException("异常信息");
        }


    }
}
