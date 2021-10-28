package cn.tedu.reflection;

import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

/**
 * @Date:2021/10/27 11:36
 * @Author:NANDI_GUO
 * 测试反射技术
 */
public class TestRReflect {
    /*单元测试方法：
    * public + void + 没有参数 + @Test
    * Add Junit4 to classPath*/
    @Test
    public void getClazz() throws ClassNotFoundException {
        //练习获取字节码对象的三种方式
        Class<?> clazz1 = Class.forName("cn.tedu.reflection.Student");
        Class<?> clazz2 = Student.class;
        Class<?> clazz3 = new Student().getClass();

        System.out.println(clazz1);

        //获取当前字节码对象clazz1的名字
        System.out.println(clazz1.getName());

        //通过字节码对象，获取Student类的类名
        System.out.println(clazz2.getSimpleName());

        //通过字节码对象获取Student类的包对象
        System.out.println(clazz3.getPackage());

        //通过字节码对象，先获取Student类的包对象，再获取这个包对象的名字
        System.out.println(clazz3.getPackage().getName());
    }

    @Test
    public void getStu(){
        Student s1 = new Student("张三",3);
        Student s2 = new Student("李思",4);
        Student s3 = new Student("王五",5);

        Student[] s = new Student[]{s1,s2,s3};
        for (Student ss: s) {
            System.out.println(ss.name);
            ss.eat(3);
            ss.play();
        }
    }
}
