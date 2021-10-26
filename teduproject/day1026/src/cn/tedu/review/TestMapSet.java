package cn.tedu.review;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

import java.util.*;

/**
 * @Date:2021/10/26 9:06
 * @Author:NANDI_GUO
 */
public class TestMapSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Map<Integer,String> map = new HashMap<>();

        set.add("笨笨");
        set.add("小白");
        set.add("小黑");

        map.put(1,"笨笨");
        map.put(2,"小白");
        map.put(3,"小黑");

        System.out.println(set);
        System.out.println("====================================");
        System.out.println(map);

        System.out.println("====================遍历======================");

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==============================================");

        Set<Integer> set1 = map.keySet();
        Iterator<Integer> it2 = set1.iterator();
        while (it2.hasNext()){
            Integer key = it2.next();
            String value = map.get(key);
            System.out.println(key+" map1 "+value);
        }
        System.out.println("==============================================");
        Set<Map.Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it3 = set2.iterator();
        while(it3.hasNext()){
            Map.Entry<Integer,String> me = it3.next();
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key+" map2 "+value);
        }



    }
}
