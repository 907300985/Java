package cn.tedu.oop2;

/**
 * @Date:2021/10/13 17:07
 * @Author:NANDI_GUO
 * 本类测试继承中变量的使用
 */
public class ExtendsDemo1 {
    public static void main(String[] args) {
        new Son().study();

    }
}
//创建父类
class Father{
    int sum = 1;
    int count = 2;
}

//创建子类
class Son extends Father{
    int sum = 10;

    public void study(){
        int sum = 100;
        System.out.println("good study");
        System.out.println(sum); //局部变量
        System.out.println(this.sum); //成员变量
        /**当父类的成员变量与子类的重名时，可以使用super指定父类成员变量
         * Father super = new Father();
         * */
        //Father f = new Father();
        System.out.println(super.sum);

    }
}