package cn.tedu.oop;

/**
 * @Date:2021/10/18 15:31
 * @Author:NANDI_GUO
 */
public class Parents implements Person{

    @Override
    public void eat() {
        System.out.println(id3+"在招待所吃饭");
    }

    @Override
    public void sleep() {
        System.out.println(id3+"在招待所睡觉");
    }
}
