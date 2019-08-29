package com.openmind.day05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;

/**
 * @Classname T1
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/28 14:47
 * @Created by Happy-微冷的雨
 */
public class T1 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<StudentBean> clazz = StudentBean.class;
        //返回所有构造方法的数组
       /* Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        System.out.println("构造函数");
        for (Constructor item:constructors) {
            System.out.println(item);
        }*/
      /*  Constructor<StudentBean> constructor = clazz.getConstructor(Integer.class,String.class);
        StudentBean stu = constructor.newInstance(1, "张三");
        System.out.println(stu);*/

        StudentBean bean=new StudentBean();
       /*
        Field[] fields = clazz.getDeclaredFields();
        for (Field item:fields) {
            item.setAccessible(true);
            if (item.getName().equals("stuid")){
                item.set(bean,1);
            }
            if (item.getName().equals("stuname")){
                item.set(bean,"张三");
            }
        }
        System.out.println(bean);*/

        Method homework = clazz.getMethod("homework",String.class);
        Object result = homework.invoke(bean,"英语");
        System.out.println(result);

    }
}
