package cn.tedu.review.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Date:2021/10/25 19:25
 * @Author:NANDI_GUO
 * 输入字符串
 * 遍历字符串
 * 创建map《字符，次数》
 * 返回
 */
public class TestHomeWork {
    public static void main(String[] args) {
        System.out.println("请输入你的字符串：");
        String input = new Scanner(System.in).next();
        System.out.println(count(input));
    }

    private static Map count(String input) {
        Map<Character, Integer> ci = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
           // ci.put(input.charAt(i),i);
            char key = input.charAt(i);  //遍历字符串
            Integer value = ci.get(key); //每个字符对应的次数
            if (value == null){
                ci.put(key,1);
            }else{
                ci.put(key,value+1);
            }
        }
        return ci;
    }
}