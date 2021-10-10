package cn.tedu.review;

/**
 * @Date:2021/10/9 10:38
 * @Author:NANDI_GUO
 */
public class TestFor1 {
    
    public static void main(String[] args) {
        sum1(0);
        sumeven(0);
        sumodd(0);
    }

    static void sum1(int sum){
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    static void sumeven(int sum){
        for (int i=1;i<=100;i++){
            if(i%2 == 0){
                sum += i ;
            }
        }
        System.out.println("偶数和："+sum);
    }
    static void sumodd(int sum){
        for (int i=1;i<=100;i++){
            if(i%2 != 0){
                sum += i ;
            }
        }
        System.out.println("奇数和："+sum);
    }
}
