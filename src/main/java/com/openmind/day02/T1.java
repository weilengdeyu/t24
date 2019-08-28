package com.openmind.day02;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @Classname T1
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/27 8:52
 * @Created by Happy-微冷的雨
 */
public class T1 {
    public static void main(String[] args) {
        Vector list=new Vector();
        list.add(1);
        list.add(2);
        for (Object item:list) {
            System.out.println(item);
        }
    }
}
