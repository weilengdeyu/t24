package com.openmind.day02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * @Classname T2
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/27 9:17
 * @Created by Happy-微冷的雨
 */
public class T2 {

    public static void main(String[] args) {

        //唯一
        HashSet<Book> set=new HashSet<Book>();

        Book book1=new Book(1,"艰难的抉择");
        System.out.println(book1.hashCode());

        System.out.println(book1);
        Book book2=new Book(1,"艰难的抉择");

        set.add(book1);
        set.add(book2);

        System.out.println(set.size());

    }
}
