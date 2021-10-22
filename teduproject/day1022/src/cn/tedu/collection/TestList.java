package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Date:2021/10/22 16:54
 * @Author:NANDI_GUO
 */
public class TestList {
    public static void main(String[] args) {
        //创建List多态对象
        List<String> list = new ArrayList<>();
        list.add("大力娃");
        list.add("顺娃");
        list.add("铁娃");
        list.add("火娃");
        list.add("大水娃");
        list.add("隐身娃");
        list.add("紫娃");
        System.out.println(list);
        //list.clear();
        //System.out.println(list);
        list.add(1,"小蝴蝶");
        list.add(3,"蛇精");//向指定的索引处添加元素
        System.out.println(list);
        System.out.println(list.indexOf("小蝴蝶"));//元素第一次出现索引值
        System.out.println(list.lastIndexOf("小蝴蝶"));//元素最后一次出现索引值
        System.out.println(list.remove(5));
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.set(7,"蝎子精"));
        System.out.println(list);

        //测试集合间的操作
        List<String> list2 = new ArrayList<>();//创建新集合
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println(list2);//打印查看集合
        System.out.println(list.addAll(list2));
        System.out.println(list.addAll(1,list2));
        System.out.println(list);

        System.out.println(list.containsAll(list2));
        System.out.println(list.removeAll(list2));//删除属于list2集合的所有元素
        System.out.println(list);

        //迭代集合的方式
        //for循环
        //foreach循环
        //迭代器

    }
}
