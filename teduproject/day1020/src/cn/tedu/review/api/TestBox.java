package cn.tedu.review.api;

/**
 * @Date:2021/10/20 15:15
 * @Author:NANDI_GUO
 * 自动装箱与自动拆箱
 */
public class TestBox {
    public static void main(String[] args) {
        Integer i = new Integer(127);
        Integer i1 = Integer.valueOf(127);

        /*编译器会自动把基本类型int127，包装成包装类型Interger
        * 然后交给Integer类型的变量i3来保存，底层发生的代码Interger.valueOf(127)
        * 自动装箱的方向：int【基本类型】-> Interger【包装类型】*/
        Integer i3 = 127;//自动装箱

        /*自动拆箱
        * 编译器会自动把包装类型i3拆掉箱子，便会基本的数据类型127
        * 然后交给基本类型的变量i4来保存，底层发生的代码：i3.intValue（）
        * 自动拆箱的方向：Integer【包装类型】->int【基本类型】*/
        int i4 = i3;

    }
}
