package cn.tedu.design;

/**
 * @Date:2021/10/27 17:06
 * @Author:NANDI_GUO
 *实现设计单例设计模式：饿汉式
 */
public class Singleton1 {
    public static void main(String[] args) {
        MySingle single1 = MySingle.getSingle();
        MySingle single2 = MySingle.getSingle();

        System.out.println(single1 == single2);
    }
}
class MySingle{
    /*构造方法私有化的目的：为了防止外界随意实例化本类对象*/
    private MySingle(){}
    static private MySingle single = new MySingle();

    static public MySingle getSingle(){
        return single;
    }


}
