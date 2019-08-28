package com.openmind.day01;
//导入包
//导入包价值？？？
//解析：别人写好的代码我们就可以使用了
//     声明我们要使用具备特定功能的类或资源
//
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname T1
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/26 8:33
 * @Created by Happy-微冷的雨
 */
public class T1 {
    public static void main(String[] args) {
        //01.我们知道集合没有公开capacity这样一个属性或者方法，让程序员获取到集合容量，
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        for (Integer item:list) {
            System.out.println(item);
        }
        //Var01
      /*  ArrayList list=new ArrayList();
        list.add("1");
        int size = list.size();
        System.out.println("集合种存储元素个数："+size);


        int num=6;//0110
        int result=num<<1;
        System.out.println(result);
       */
      //双列集合的5种遍历方式
        Map<String,String> map=new HashMap<String,String>();
        map.put("abc","中国农业银行");
        map.put("icbc","中国工商银行");
        map.put("cbc","中国建设银行");
        //3种for
        //key  value
        //方式一：通过key获取value
        Set<String> set = map.keySet();
        //自动迭代
        //item:迭代变量。
        for (String item:set) {
            System.out.println(item+"\t"+map.get(item));
        }
        System.out.println("===================");
        //方式二:只获取value
        Collection<String> values = map.values();
        //item:迭代变量。
        for (String item:values) {
            System.out.println(item);
        }
        System.out.println("===================");
        //方式三:key+value同时遍历
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry:entrySet) {
            //一个entry代表的是一个key+value的组合
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
        System.out.println("===================");
        //2种while
        //iterator迭代器   enumerator
        //iterable接口    enumberable
        //你拿到迭代器
        //方式四：使用key的迭代器遍历
        //思想：：迭代器都是单列集合的，我既然要获取迭代器，我得先获取
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            //iterator.hasNext()  判定迭代器指针移动的时候，下一个元素是否存在
            String key = iterator.next();
            System.out.println(key+"\t"+map.get(key));
        }
        System.out.println("===================");
        //方式五：迭代器面向k+v迭代
        Iterator<Map.Entry<String, String>> iter2 = map.entrySet().iterator();
        while (iter2.hasNext()){
            Map.Entry<String, String> entry = iter2.next();
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }




    }
}
