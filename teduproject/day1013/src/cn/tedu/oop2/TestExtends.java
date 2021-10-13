package cn.tedu.oop2;

import javax.jws.soap.SOAPBinding;

/**
 * @Date:2021/10/13 16:08
 * @Author:NANDI_GUO
 */
public class TestExtends {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        MiaoMiao m = new MiaoMiao();

        /**
         * 继承拥有传递性
         * 爷爷功能给爸爸
         * 爸爸功能给儿子
         * */
        a.eat();
        c.eat(); //Father can use method inheritanced from grandfather
        m.eat(); //Grandson can use the method inheri from father
    }
}
/**
 * java只支持单继承
 * 一个子类只能有一个父类
 * 一个父类可以有多个子类
 * 继承相当于是将父类的功能复制了一份
 * */
//动物类-爷爷类
class Animal{
    //ADD A METHOD
    public void eat(){
        System.out.println("Animals can eat anything~");
    }
}
//猫猫类-父类
/**继承是is a 的关系，比如小猫似小动物，MiaoMiao是一只猫
 * 继承要求子类必须是弗雷德一种下属类型，依赖性非常强，强耦合
 * */
class Cat extends Animal{
    int a = 10;
    private int b = 100;
}
//MiaoMiao类-孙子类
class MiaoMiao extends Cat{
    /**子类可以拥有自己独立的方法，实现了功能的扩展*/
    public void studyJava(){
        System.out.println("正在学JAVA");
        System.out.println(a);
        /**子类继承了父类以后可以使用父类的所有非私有资源*/
        //System.out.println(b);

    }
}