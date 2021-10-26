package cn.tedu.review.collection;

import java.util.*;

/**
 * @Date:2021/10/25 17:03
 * @Author:NANDI_GUO
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("紫霞仙子");
        set.add("至尊宝");
        set.add("蜘蛛精");
        set.add("紫霞仙子");
        set.add(null);
        System.out.println(set); //打印查看集合中的元素
        /*set集合中的元素都是没有顺序的
        * set集合中的元素不能重复
        * set集合可以存null值*/

        System.out.println(set.contains("唐僧"));
        System.out.println(set.isEmpty());
        System.out.println(set.remove(null));
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(Arrays.toString(set.toArray()));

        Set<String> set2 = new HashSet<>();
        set2.add("小脑斧");
        set2.add("小兔纸");
        set2.add("小海腾");
        set2.add("发福爹");
        System.out.println(set2);
        set.addAll(set2);
        System.out.println(set);//[蜘蛛精, 小兔纸, 小海腾, 发福爹, 至尊宝, 小脑斧, 紫霞仙子]
        System.out.println(set.containsAll(set2));//true
        set.removeAll(set2);
        System.out.println(set.containsAll(set2));//false

        set.retainAll(set2);
        System.out.println(set);

        Iterator<String> it = set2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
