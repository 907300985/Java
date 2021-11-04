package cn.tedu.review;

/**
 * @Date:2021/11/4 19:14
 * @Author:NANDI_GUO
 */
public class fabo {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        //1 1 2 3 5
        int sum = sum(4);
        System.out.println(sum);
        long s1 = System.currentTimeMillis();
        System.out.println(s1-s);

    }

    private static int sum(int num) {
        if (num == 1 || num ==2){
            return 1;
        }else{
            return sum(num-1)+sum(num-2); //3 + 2 2 + 1 return 1
        }
    }
}
