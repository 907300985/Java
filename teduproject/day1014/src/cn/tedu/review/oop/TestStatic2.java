package cn.tedu.review.oop;

/**
 * @Date:2021/10/14 11:42
 * @Author:NANDI_GUO
 *
 * 1.普通资源可以调用普通资源和静态资源
 * 2.静态资源只能调用静态资源
 */
public class TestStatic2 {
    public static void main(String[] args) {
        /**普通资源是否能够调用静态资源*/

    }
}

class Teacher{
    String name;
    public void teach(){
        System.out.println("授课中....");
        System.out.println(id);
        ready();
    }
    //静态属性和方法
    static int id;
    public static void ready(){
        System.out.println("备课ing...");
        /**同一个类中静态资源不能调用普通资源*/
        //System.out.println(name);
        //teach();
    }
    public static void eat(){
        /**静态资源可以调用静态资源*/
        System.out.println(id);
        ready();
    }
}

