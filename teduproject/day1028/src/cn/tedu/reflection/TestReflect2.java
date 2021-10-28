package cn.tedu.reflection;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @Date:2021/10/28 15:24
 * @Author:NANDI_GUO
 */
public class TestReflect2 {
    @Test
    public void getFunction2() throws Exception {
        Class<?> clazz = new Person().getClass();
        /*getDeclaredMethod(m,x,y,z)
        m:要获取的方法名字
        x,y,z..可变参数 指的是目标党法的参数个数可以根据实际情况改变
        x y z传出的是参数对应的类型，而且必须是字节码对象
         */
        Method save = clazz.getDeclaredMethod("save", int.class, String.class);
        Method update = clazz.getDeclaredMethod("update");
        Object p1 = clazz.newInstance();
        Object p2 = clazz.newInstance();
        save.setAccessible(true);
        update.setAccessible(true);
        /**
         * o:要给哪个对象执行此方法
         * xyz传对应参数的值*/

        save.invoke(p1,666,"哈哈哈");
        update.invoke(p2);
    }
}
