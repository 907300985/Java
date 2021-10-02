package demo3;

import javax.jws.soap.SOAPBinding;

/**
 * @Date:2021/10/2 13:37
 * @Author:NANDI_GUO
 */
public class TestHannuota {
    public static void main(String[] args) {
        hanuota(2,'A','B','C');

    }
    public static void hanuota(int n, char from,char mid, char to){
        if (n == 1) {
            System.out.println("第1个盘子从"+from+"移到" + to);
        }else{
            //top all places move to mid
            hanuota(n-1,from,to,mid);
            //move bottom places
            System.out.println("第"+ n +"盘子从"+from+"移到" + to);
            // all mid to target
            hanuota(n-1,mid,from,to);
        }
    }
}


