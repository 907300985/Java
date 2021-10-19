package cn.tedu.inter2;

/**
 * @Date:2021/10/18 11:16
 * @Author:NANDI_GUO
 * 本类用于进一步测试接口的使用
 */
public class TestUserInter {
    public static void main(String[] args) {
        System.out.println(UserInter.age);//静态，因为可以被接口名直接使用
        //UserInter.age = 35; 不行，因为final修饰的值不可以被修改
    }
}
interface UserInter{
    //测试结构中是否包含构造方法
    //public UserInter(){}
    /*接口中没有构造方法*/

    //测试接口中是否可以有成员变量
    /*接口中的静态常量，实际上的写法是public static final int age = 20;
    * 只不过接口中可以省略，会默认拼接*/
    public static final int age = 20;
    /*接口中抽象方法的定义可以简写，会自动给方法拼接public abstract*/
    public abstract void eat();
    void play();
}
//创建接口的实现类
class UserInterImpl implements UserInter{
    public UserInterImpl(){
        /*如果一个类没有明确制定了父类，那么它默认继承顶级父类Object*/
        super();/*此处调用的父类的无参构造是Object的无参构造*/
        System.out.println("我是子实现类的无参构造");
    }

    @Override
    public void eat() {
        System.out.println("吃啥都行");
    }

    @Override
    public void play() {
        System.out.println("玩啥都行");
    }
}