package com.openmind.day03;

import java.io.File;
import java.io.IOException;

/**
 * @Classname MultiException
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/28 10:52
 * @Created by Happy-微冷的雨
 */
public class MultiException {
    public static void main(String[] args) {
        File file=new File("E:\\1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
