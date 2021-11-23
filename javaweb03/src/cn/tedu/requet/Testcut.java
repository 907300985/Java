package cn.tedu.requet;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Date:2021/11/23 8:34
 * @Author:NANDI_GUO
 */
public class Testcut {
    public static void main(String[] args) {
            //split1();
            //split2();
            System.out.println(split3("name")+"\n"+split3("age"));
        }

    private static String split3(String keyword) {
        String url = "http://127.0.0.1:8848/servlet01/testFE.html?name=Caitlyn&age=20";
        String[] data = url.split("\\?")[1].split("&");
        HashMap<String, String> map = new HashMap<>();
        for (String s:data) {
            String[]ss = s.split("=");
            String value = ss[1];
            String key = ss[0];
            map.put(key,value);
        }
        return map.get(keyword);
    }

    private static void split2() {
        String url = "http://127.0.0.1:8848/servlet01/testFE.html?name=Caitlyn&age=20";
        String arr1 = url.split("\\?")[1];
        String[] arr2 = arr1.split("&");
        for (String s:arr2) {
            System.out.println(s.split("=")[1]);
        }
    }

    private static void split1() {
        String url = "http://127.0.0.1:8848/servlet01/testFE.html?name=Caitlyn&age=20";
        String[] arr = url.split("\\?");
        String data = arr[1];
        String[] d = data.split("&");
        for (String i: d) {
            String res = i.split("=")[1];
            System.out.println(res);
    }
}

}
