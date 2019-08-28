package com.openmind.day03;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @Classname T1
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/28 9:28
 * @Created by Happy-微冷的雨
 */
public class T1 {
    /**
     * 异常篇
     * @param args
     */
    //因为这里已经到达了JVM层面，JVM会将这个异常吞掉(就相当于没有处理)
    //当异常到达main函数的时候，我们不能放着异常不去处理，一定要处理，如果选择交给jvm处理，jvm是没有能力帮我们去处理这个异常的
    public static void main(String[] args) {
        MyException exception=new MyException();

        try {
            exception.test();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("yyyyyyyyyyy");
    }
}
