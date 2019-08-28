package com.openmind.day03;

/**
 * @Classname Interview
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/28 11:03
 * @Created by Happy-微冷的雨
 */
public class Interview {
    public static void main(String[] args) {
        System.out.println(test());
    }

    private static int test() {
        int x=1;
        try{
            return x;
        }finally {
            ++x;
            System.out.println("finally"+x);
        }
    }

}
