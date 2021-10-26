package cn.tedu.review.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Date:2021/10/22 15:45
 * @Author:NANDI_GUO
 * 本类用来测试Collection接口
 */
public class TestCollection {
    public static void main(String[] args) {
        //Collection c = new Collection()
        Collection<Integer> c = new ArrayList<>();

        //2.1 测试集合中的常用方法
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);
        //c.clear();
        //System.out.println(c);

        System.out.println(c.hashCode());//获取当前对象的哈希码值
        System.out.println(c.toString());//不推荐写，底层自动调用
        System.out.println(c.equals(200));
        System.out.println();//false,集合对象c与集合中的元素200不等

        System.out.println(c.contains(200));//true判断c集合中是否包含200
        System.out.println(c.isEmpty());//false是不是空
        System.out.println(c.remove(100));//用于移除指定的元素

        System.out.println(c.size());
        Object[]arr = c.toArray();//将指定的集合转为Object数组
        System.out.println(Arrays.toString(arr));

        //测试多个集合间的操作
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(2);
        c2.add(4);
        c2.add(5);
        System.out.println(c2);

        c.addAll(c2);//将c2集合中的所有元素添加到c集合中
        System.out.println(c);
        System.out.println(c2);
        c.removeAll(c2);
        System.out.println(c);//将c集合中属于c2集合的所有元素删除
        System.out.println(c.containsAll(c2));//判断c集合是否包含c2集合的所有元素

        c.add(5);
        System.out.println(c);
        System.out.println(c.retainAll(c2));//取交集
        System.out.println(c);
        System.out.println(c2);

        /*集合迭代/集合遍历
        * 1.获取集合的迭代器
        * 2.判断集合中是否仍有下一个元素可以迭代
        * 3.获取当前迭代到的元素*/
        Iterator<Integer> it = c2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
