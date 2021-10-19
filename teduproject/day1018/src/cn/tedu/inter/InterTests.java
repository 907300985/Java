package cn.tedu.inter;

/**
 * @Date:2021/10/18 10:36
 * @Author:NANDI_GUO
 * 本类用于测试接口实现类
 */
public class InterTests {
    public static void main(String[] args) {
    /*接口是抽象的，不可以被实例化/创建对象*/
        //创建多态对象
        Inter i = new InterImpl();
        i.eat();
        i.play();
        //创建纯纯的接口实现类对象
        InterImpl i1 = new InterImpl();
        i1.eat();
        i1.play();
    }
}
