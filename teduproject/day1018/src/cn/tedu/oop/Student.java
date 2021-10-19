package cn.tedu.oop;

/**
 * @Date:2021/10/18 15:29
 * @Author:NANDI_GUO
 */
public class Student implements Person {
    @Override
    public void eat() {
        System.out.println(id2+"去学校食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println(id2+"在学校宿舍吃饭");
    }
}
