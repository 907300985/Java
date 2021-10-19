package cn.tedu.inner;

/**
 * @Date:2021/10/19 14:03
 * @Author:NANDI_GUO
 */
public class TestInner6 {
    public static void main(String[] args) {
        //创建接口对应的匿名对象与匿名内部类，并调用实现后的save（）
//        new Inter6(){
//            @Override
//            public void save(){
//                System.out.println("保存");
//            }
//            @Override
//            public void get(){
//                System.out.println("获取");
//            }
//        }.save();
        new Inter6() {
            @Override
            public void save() {
                System.out.println("保存");
            }

            @Override
            public void get() {
                System.out.println("获取");
            }
        }.save();
        new Inter2() {
            @Override
            public void set() {
                System.out.println("set()实现了");
            }
        }.set();
        new Inter3().powerUp();

    }
}
interface Inter6{
    void save();
    void get();
}
abstract class Inter2{
    public void play(){
        System.out.println("玩代码");
    }
    abstract public void set();
}
class Inter3{
    public void study(){
        System.out.println("再冷的天也挡不住我学习的热情");
    }
    public void powerUp(){
        System.out.println("我么会越来越强的");
    }
}