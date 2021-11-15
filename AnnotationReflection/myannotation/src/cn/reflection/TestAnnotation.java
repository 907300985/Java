package cn.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @Date:2021/11/13 15:30
 * @Author:NANDI_GUO
 */
public class TestAnnotation {
    @MyAnnotation
    public void test() {

    }

    @MyAnnotation
    public void test2() {

    }

    @Target({ElementType.FIELD, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Inherited
    @interface MyAnnotation {
        String name() default "帅";

        int age() default 22;

        int id() default -1;

        String[] schools() default {"是", "wo"};
    }
}
