package cn.tedu.review.api;

import javax.jws.soap.SOAPBinding;

/**
 * @Date:2021/10/20 14:20
 * @Author:NANDI_GUO
 * 本类测试包装类
 */
public class TestNumber {
    //定义成员变量记得要设置成静态的，静态只能调用静态
    static Integer i0;

    public static void main(String[] args) {
        System.out.println(i0);
        Integer i1 = new Integer(4);
        Integer i11 = new Integer(4);

        /*Integer对象创建方式二有一个高效的效果，但是要求：
        * 1.是Integer类型
        * 2. 使用valueOf的创建方式
        * 3. 数据在-128=127范围内
        * 只要满足以上3个条件，相同的数据只会存以此，后续再存都是使用之前创建好的数据*/
        Integer i2 = Integer.valueOf(127);
        Integer i22 = Integer.valueOf(127);
        Integer i3 = Integer.valueOf(300);
        Integer i33 = Integer.valueOf(300);

        System.out.println(i1 == i2);
        System.out.println(i2 == i22);

        System.out.println(i3 == i33);

        Double d1  = new Double(3.14);
        Double d11  = new Double(3.14);
        System.out.println(d1 == d11);

        /*只有Integer才有高效的效果*/
        Double d2 = Double.valueOf(3.14);
        Double d22 = Double.valueOf(3.14);
        System.out.println(d2 == d22);

        System.out.println(i1.parseInt("800")+10);
        System.out.println(d1.parseDouble("2.2")+5.5);
    }
}
