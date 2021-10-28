package cn.tedu.review;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * @Date:2021/10/28 9:29
 * @Author:NANDI_GUO
 */
public class Singleton1 {
    public static void main(String[] args) {
        Mysingle s1 = Mysingle.getSingle();
        Mysingle s2 = Mysingle.getSingle();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Mysingle{
    private  Mysingle(){}
    private static Mysingle single = new Mysingle();

    static public Mysingle getSingle(){
        return single;
    }
}
