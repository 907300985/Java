package cn.tedu.oop;



/**
 * @Date:2021/10/14 14:07
 * @Author:NANDI_GUO
 */
public class Demo {

}
class F{
    public Animal get(){
        Animal a = new Animal();
        return a;
    }
}

class S extends F{
    @Override
    public Cat get(){
        Cat c = new Cat();
        return c;
    }
}

class Animal{

}
class Cat extends Animal{

}