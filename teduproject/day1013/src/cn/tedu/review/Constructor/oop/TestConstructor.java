package cn.tedu.review.Constructor.oop;

/**
 * @Date:2021/10/13 10:09
 * @Author:NANDI_GUO
 */
public class TestConstructor {
    public static void main(String[] args) {
        /**每次new对象，都会自动触发对应类中的构造方法*/
        /**每一个类中都会默认存在一个没有参数的构造方法*/
        /**但是如果你提供了其他的构造函数，默认的无参构造就不再提供了*/
        /**所以我们要手动提供无参构造，这样不传参数也能创建对象*/
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.address);
        System.out.println(p1.age);
        p1.eat();

        /**每次创建对象都会执行一个构造方法
         * 构造方法的作用就是用来创建对象的
         * */
        Person p2 = new Person(3);
        /**全参构造创建对象，还可以给对象赋值*/
        Person p3 = new Person(" Rimu ",22," hello ");
        Person p4 = new Person(" 一郎 ", 25 , " 程序员 ");
    }
}

class Person{
    //属性
    String name;
    int age;
    String address;
    //方法
    /**构造方法的格式：与本类类名同名，且没有返回值类型的方法*/
    public Person(){
        System.out.println("我是无参的构造函数");
    }
    /**创建本类的含参构造--含有参数的构造方法*/
    public Person(int n){
        System.out.println("我是person类的含参构造，参数是"+n);
    }

    public Person(String name, int age, String address) {
        System.out.println("我是Person类的全参构造"+name+age+address);
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void eat(){
        System.out.println("端起来我的大饭盆");
    }
}