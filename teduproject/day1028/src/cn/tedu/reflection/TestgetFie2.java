package cn.tedu.reflection;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @Date:2021/10/28 14:15
 * @Author:NANDI_GUO
 */
public class TestgetFie2 {
    @Test
    public void getFie2() throws Exception {

        Class<?> clazz = Person.class;
        Field field = clazz.getDeclaredField("name");
        System.out.println(field);
        System.out.println(field.getType());
        System.out.println(field.getType().getName());

        //设置属性的值
        //需要指定到底给那个对象的name属性值设置
        Object obj = clazz.newInstance();
        field.setAccessible(true);
        //set(m,n)--m是给哪个对象的name属性设置值,n是设置的具体值
        field.set(obj,"赵六");
        System.out.println(field.get(obj));
    }
}
