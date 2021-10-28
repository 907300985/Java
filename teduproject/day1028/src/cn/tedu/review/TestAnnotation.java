package cn.tedu.review;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Date:2021/10/28 9:06
 * @Author:NANDI_GUO
 * 本类用来复习注解案例
 */
public class TestAnnotation {
    public static void main(String[] args) {

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//定义一个自定义注解
@interface  Apple{
    int sum() default 0;
    String value() default "shit";
}
@Apple
class TestAnno{

    String name;

    @Apple
    public void eat(){
        System.out.println("eat method");
    }
}