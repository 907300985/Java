package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Date:2021/10/27 14:34
 * @Author:NANDI_GUO
 * 注解的入门案例
 */
@Rice(age = 10)
public class TestAnnotation {
}

/**通过元注解@Target规定自定义注解可以使用再哪些位置
 * 我们使用"ElementType.静态常量"的方式来指定自定义注解具体的位置
 * 而且，值可以写多个，格式@Target({值1,值2,值3})*/
//通过@Target注解标记自定义注解Rice可以使用的位置
@Target({ElementType.TYPE,ElementType.METHOD})
//3.通过@Retention注解标注自定义注解Rice的生命周期
//定义自定义注解
@Retention(RetentionPolicy.RUNTIME)//到运行时有效
    /**通过原注解@Retention规定自定义注解的生命周期
     * 我们使用"RetentionPolicy,静态常量"的方式来指定自定义注解的具体的存活时间
     * 注意：这里的值只能写一个：SOURCE CLASS RUNTIME 3选1*/
/*首先注意：注解定义的语法与java不同
 * 定义自定义注解的格式：@interface注解名{}*/
@interface Rice{
    //int age();//不是方法的定义，而是给自定义注解添加了一个age属性
    //给自定义注解添加了一个普通属性age,类型是int
    int age() default 0;
    String value() default "lemon";
}

/**测试2：当我们给Rice注解添加了一个age属性以后，@Rice注解使用时直接报错
 * 结论：当注解没有定义属性时，可以直接使用
 * 当注解定义了属性以后，必须给属性赋值*/
/*注解中还可以添加特殊属性value
* 特殊属性的定义方式与普通属性一样,要求名字必须是value，类型不做限制*/
//给age默认值以后可以直接使用
//@Rice(age = 10)
    //@Rice
    @Rice
class TestAnno{
    // @Rice
    String name;
   // @Rice(age = 10)
    public void eat(){
        System.out.println("干饭不积极，思想有问题");
    }
}
