package tedu.review;

import java.util.Arrays;

/**
 * @Date:2021/10/11 14:33
 * @Author:NANDI_GUO
 */
public class TestCopyOf {
    public static void main(String[] args) {
        int[] from = {1,2,3,4,5};
        //复制一个数组
        int[] to = Arrays.copyOf(from,10);
        int[] to2 = Arrays.copyOf(from,3);
        System.out.println(to.length);
        System.out.println(to2.length);
        System.out.println(Arrays.toString(to));
        System.out.println(Arrays.toString(to2));
    }
}
