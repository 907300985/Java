package cn.tedu.review.review;

/**
 * @Date:2021/10/18 9:05
 * @Author:NANDI_GUO
 */
public class TestExtends {
    public static void main(String[] args) {

    }
}
class A{
    public A(){

    }
    public static void play(){
        System.out.println("父类的静态方法");
    }
}

class B extends A{
    //构造函数不可以被继承
    //super()

    public B(){

    }
    /**静态资源属于类资源，在那个类中定义，就作为这个类的资源使用，不存在重写
     * 只是恰巧父类子类中出现了两个一米一样的方法*/
    public static void play(){
        System.out.println("子类的静态方法");
    }
}

