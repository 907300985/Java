package cn.tedu.oop;

/**
 * @Date:2021/10/14 11:24
 * @Author:NANDI_GUO
 */
public class TestStatic1 {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Fruit f2 = new Fruit();
        f.grow();
        Fruit.clean(); //我们可以通过类名直接调用静态方法
        f.clean();
        /**静态资源在内存中只有一份，而且被全局所有对象所共享
         * 所以:当我们通过任意一种方式修改了静态变量的值以后
         * 不管用何种方式查看，静态变量的值都是刚刚修改后的值*/
        Fruit.kind = "苹果";
        System.out.println(Fruit.kind);
        System.out.println(f.kind);
        System.out.println(f2.kind);

        f.kind = "苹2";
        System.out.println(Fruit.kind);
        System.out.println(f.kind);
        System.out.println(f2.kind);

        f2.kind = "香蕉";
        System.out.println(Fruit.kind);
        System.out.println(f.kind);
        System.out.println(f2.kind);

        System.out.println(f.weight);
        System.out.println(f.kind);//没提示
        System.out.println(Fruit.kind);//有提示，类名直接调用静态属性
    }
}

/**
 * 被Static修饰的资源统称为静态资源
 * 静态资源是随着类加载而加载到内层中的，比对象优先进入内存
 * 所以静态资源可以通过类名直接调用，即使没有创建对象，也可以调用
 * */
class Fruit{
    static String kind;
    double weight;

    public static void clean(){
        System.out.println("洗水果");
    }
    public void grow(){
        System.out.println("长高高");
    }
}