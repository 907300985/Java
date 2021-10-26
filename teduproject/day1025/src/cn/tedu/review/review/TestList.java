package cn.tedu.review.review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Date:2021/10/25 9:09
 * @Author:NANDI_GUO
 * 复写继承自Collection与List独有的方法
 */
public class TestList {
    public static void main(String[] args) {
        //创建多态方法
        Collection<String> list1 = new ArrayList();
        List<String> list2 = new ArrayList<>();

        list1.add("大力娃");
        list1.add("千顺娃");
        list1.add("头铁娃");
        list1.add("喷火娃");
        list1.add("喷水娃");
        list1.add("隐身娃");
        list1.add("小紫娃");

        //System.out.println(list1);
        //list1.clear();
        System.out.println(list1.contains("白骨精"));
        System.out.println(list1.equals("大力娃"));
        System.out.println(list1.hashCode());
        System.out.println(list1.isEmpty());
        System.out.println(list1.remove("隐身娃"));
        System.out.println(list1.size());
        System.out.println(list1.toArray() );

        System.out.println(list1);


        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println(list2);
        System.out.println(list1.addAll(list2));
        System.out.println(list2);
        System.out.println(list1.containsAll(list2));

        System.out.println(list1.retainAll(list2));
        System.out.println(list1.removeAll(list2));
        System.out.println(list1);

        list2.add(1,"小蝴蝶");
        list2.add(5,"小蝴蝶");
        System.out.println(list2);
        System.out.println(list2.indexOf("小蝴蝶"));
        System.out.println(list2.lastIndexOf("小蝴蝶"));
        System.out.println(list2.remove(5));
        System.out.println(list2);

        System.out.println(list2.get(3));
        System.out.println(list2.set(0,"玉兔精"));
        System.out.println(list2);
    }
}

