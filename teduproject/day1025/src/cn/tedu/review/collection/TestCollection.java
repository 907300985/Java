package cn.tedu.review.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Date:2021/10/25 11:12
 * @Author:NANDI_GUO
 */
public class TestCollection {
    public static void main(String[] args) {
        /*底层会自动创建数组来储存对象。并且数组初始容量是10*/
        ArrayList<Integer> list = new ArrayList<>();
        //向集合中添加元素
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(400);
        list.add(300);
        System.out.println(list);

        //迭代集合
        
    }
}
