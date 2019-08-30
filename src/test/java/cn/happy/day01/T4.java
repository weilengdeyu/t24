package cn.happy.day01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Classname T4
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/27 21:12
 * @Created by Happy-微冷的雨
 */
public class T4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入,需要进行排序的数字(格式 : 233,53,36),回车结束输入.");
        String nextLine = sc.nextLine();
        String[] split = nextLine.split(",");
        Integer[] temp = new Integer[split.length];
        int index = 0;
        try {
            for (String string : split) {
                temp[index++] = Integer.parseInt(string);
            }
        } catch (NumberFormatException numberFormatException) {
            System.out.println("请输入正确的内容以及格式.");
            return;
        }
        System.out.println("你输入的是 : " + Arrays.toString(temp));
        System.out.println("请选择,升序(0)还是降序(1)");
        int nextInt = sc.nextInt();
        Arrays.sort(temp);
        if(nextInt == 1) {
            List list=new ArrayList();
            for (int i=temp.length-1;i>=0;i--){
                list.add(temp[i]);
            }
            System.out.println(Arrays.toString(list.toArray()));
        }else {
            System.out.println("升序 : " + Arrays.toString(temp));
        }
    }
}
