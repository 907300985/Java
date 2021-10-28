package cn.tedu.reflection;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Date:2021/10/28 16:26
 * @Author:NANDI_GUO
 */
public class TestSDF {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);
    }
}
