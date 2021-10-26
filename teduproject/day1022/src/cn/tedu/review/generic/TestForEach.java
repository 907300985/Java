package cn.tedu.review.generic;

/**
 * @Date:2021/10/22 15:34
 * @Author:NANDI_GUO
 */
public class TestForEach {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6,7,8,9,10};
        String[] b = {"大哥","二哥","三哥","四哥"};

        for (Integer i: a){
            System.out.println(i);
            System.out.println(i);
        }

        for (String s: b) {
            System.out.println(s);
        }
    }
}
