package cn.tedu.review.collection;

import java.util.HashSet;

/**
 * @Date:2021/10/25 17:28
 * @Author:NANDI_GUO
 * 本类用来测试自定义类的去重
 */
public class TestSet2 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("张三", "2333", 22);
        Student s2 = new Student("李四", "3444", 18);
        Student s22 = new Student("李四", "3444", 18);
        set.add(s1);
        set.add(s2);
        set.add(s22);
        System.out.println(set);

    }
}
