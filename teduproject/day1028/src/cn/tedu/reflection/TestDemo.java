package cn.tedu.reflection;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Date:2021/10/28 10:07
 * @Author:NANDI_GUO
 */
public class TestDemo {
    /*单元测试方法：是java中最小的测试单位，使用灵活，推荐指数：5颗星
    * @Test + public + void + 没有参数*/

    @Test
    public void getClazz() throws ClassNotFoundException {
        Class<?> clazz = Student.class;
        Class<?> clazz2 = new Student().getClass();
        Class<?> clazz3 = Class.forName("cn.tedu.reflection.Student");

        System.out.println(clazz);
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        System.out.println(clazz2.getPackage());
        System.out.println(clazz2.getPackage().getName());

        System.out.println(clazz3);
    }

    /*通过单元测试方法，获取Student目标类中的成员变量Field*/
    @Test
    public void getFie() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("cn.tedu.reflection.Student");
        //通过字节码对象，获取目标类中所有的成员变量
        /*注意：目前要获取的成员变量的修饰符必须是public才能获取到，默认修饰符也获取不到的*/
        Field[] fs = clazz.getFields();
        for (Field f:fs){
            System.out.print(f.getName());
            System.out.println(f.getType());
        }
    }

    @Test
    public void getStu(){
        Student s1 = new Student("张三",3);
        Student s2 = new Student("张三",3);
        Student s3 = new Student("张三",3);

        Student[] s ={s1,s2,s3};

        for (Student stu: s) {
            System.out.println(stu.name);
            stu.play();
            stu.eat(5);
        }
    }

    @Test
    public void getFuncion(){
        Class<Student> clazz = Student.class;
        Method[] ms = clazz.getMethods();
        for (Method m: ms) {
            System.out.println("遍历:");
            System.out.println(m.getName());

            Class<?>[] pt = m.getParameterTypes();
            //有的方法的参数类型比较多，所以创建数组
            System.out.println(Arrays.toString(pt));
        }
    }

    @Test
    public void getCons(){
        Class<?> clazz = new Student().getClass();
        Constructor<?>[] cs = clazz.getConstructors();

        for (Constructor c: cs) {
            System.out.println("又要遍历了：");
            System.out.println("构造方法名"+c.getName());
            Class[] pt = c.getParameterTypes();
            System.out.println("构造参数类型:"+ Arrays.toString(pt));
        }
    }

    @Test
    public void getObject() throws Exception {
        Class<Student> clazz = Student.class;
        /*反射创建对象的方案1：通过出发目标类的无参构造创建对象*/
        Object o = clazz.newInstance();
        System.out.println(o);
        //获取指定的构造函数对象
        /*反射创建对象的方案2： 先获取指定的全残构造对象，再通过构造对象创建Student对象*/
        Constructor<?> c = clazz.getConstructor(String.class, int.class);
        Object o2 = c.newInstance("啥也不说",2);
        System.out.println(o2);
    }
}

