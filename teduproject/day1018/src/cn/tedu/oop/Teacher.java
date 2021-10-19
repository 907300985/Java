package cn.tedu.oop;

/**
 * @Date:2021/10/18 15:27
 * @Author:NANDI_GUO
 */
public class Teacher implements Person{
    @Override
    public void eat(){
        System.out.println(id1+"去教室食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println(id1+"去学校公寓睡觉");
    }
}
