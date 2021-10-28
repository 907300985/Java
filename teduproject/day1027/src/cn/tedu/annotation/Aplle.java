package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Date:2021/10/27 16:16
 * @Author:NANDI_GUO
 */

@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface Aplle {
    double s() default 0;
    String value() default "apple" ;
}
