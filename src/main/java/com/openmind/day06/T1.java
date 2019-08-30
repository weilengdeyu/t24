package com.openmind.day06;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Classname T1
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/29 12:23
 * @Created by Happy-微冷的雨
 */
public class T1 {


    static MySqlToList tool=new MySqlToList();
    public static void main(String[] args) throws Exception {
        //readBlogInfo();
        readHomeWork();
    }

    //读取HomeWork表中的所有记录
    public static void  readHomeWork() throws Exception{
        String sql = "select * from homework";
        List<Map<String, Object>> list = tool.getListMap(sql);
        List homeworks = tool.mapToBean(list, HomeWork.class);
        for (Object homework : homeworks) {
            System.out.println(homework);
        }
    }

    //读取BlogInfo表中的所有数据
    public static void  readBlogInfo() throws Exception{
        String sql = "select * from bloginfo";
        List<Map<String, Object>> list = tool.getListMap(sql);
        List blogs = tool.mapToBean(list, BlogInfo.class);
        for (Object blog : blogs) {
            System.out.println(blog);
        }
    }
}
