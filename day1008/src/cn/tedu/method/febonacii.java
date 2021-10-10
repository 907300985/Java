package cn.tedu.method;

/**
 * @Date:2021/10/9 14:41
 * @Author:NANDI_GUO
 */

// 1,1,2,3,5,8,13,21.......
public class febonacii {
    public static void main(String[] args) {
        for (int i = 1; i <= 30 ; i++) {
            System.out.print(febo(i)+" ");
        }
    }

    static int febo(int n){
        if (n<=2){
            return 1;
        }else{
            return febo(n-1)+febo(n-2);
        }
    }
}
