package cn.tedu.review.Constructor.oop;

/**
 * @Date:2021/10/13 14:17
 * @Author:NANDI_GUO
 */
public class TestThis1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}
class Cat{
    int count = 666;
    int sum = 100;
    public void eat(){
        int sum = 10;
        System.out.println(sum); //使用局部变量，就近原则
        System.out.println(this.sum);//成员与局部同名是，可以使用this指定本类成员变量
        System.out.println(count);
    }
}