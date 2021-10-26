package cn.tedu.review.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Date:2021/10/25 10:08
 * @Author:NANDI_GUO
 */
public class TestList2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("大力娃");
        list1.add("千顺娃");
        list1.add("头铁娃");
        list1.add("喷火娃");
        list1.add("喷水娃");
        list1.add("隐身娃");
        list1.add("小紫娃");
        //集合的迭代：
        //因为List集合是有序的，元素是有下标的，所以可以根据下标遍历集合
        /*方式1：for循环*/
        for (int i = 0; i < list1.size() ; i++) {
            System.out.println(list1.get(i));
        }
        /*for each 高效for循环*/
        for (String s: list1) {
            System.out.println(s);
        }
        /*迭代器*/
        Iterator<String> it = list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        /*List独有的迭代器*/
        ListIterator<String> it2 = list1.listIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
            if (!it2.hasNext()){
                while (it2.hasPrevious()){
                    System.out.println(it2.previous());
                }
                break;
            }
        }
    }
}
