package cn.tedu.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Date:2021/10/26 9:40
 * @Author:NANDI_GUO
 * map统计字符个数案例
 */
public class TestMap {
    public static void main(String[] args) {
        System.out.println("请输入你要统计的字符串：");
        String input = new Scanner(System.in).next();

        Map<Character,Integer> count = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            Integer value = count.get(key);
            if (value == null){
                count.put(key,1);
            }else{
                count.put(key,value+1);
            }
        }
        System.out.println(count);
    }
}
