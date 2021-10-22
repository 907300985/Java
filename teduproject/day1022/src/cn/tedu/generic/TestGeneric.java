package cn.tedu.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date:2021/10/22 14:14
 * @Author:NANDI_GUO
 * 泛型
 */
public class TestGeneric {
    public static void main(String[] args) {
        /*泛型是怎么来的？--想要模拟数组的数据类型检查*/
        String[] a = new String[5];
        a[0] = "a";
        a[3] = "泡泡";
        a[4] = "江江";

        List list = new ArrayList();
        list.add("涛涛");
        list.add(1);
        list.add(8.8);
        list.add('v');
        System.out.println(list);

        //泛型通常与集合一起使用，用来约束集合中元素的类型
        //泛型的好处：可以约束集合数据类型，把报错的时机提前，而不是运行时才报错
        //向集合中添加元素时，会先检查元素的数据类型，不是要求的类型就编译失败
        List<String> list2 = new ArrayList();
        list2.add("下辖");
//        list2.add(2);
//        list2.add(true);
//        list2.add('3');

        /*<type> -- type的值需要根据自己的业务自定义，但是type必须是引用类型，
        不能是基本类型，如果想写基本类型，要写基本类型对应的包装类型*/
        List<Integer> list3 = new ArrayList();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);
        System.out.println(list3);
    }
}
