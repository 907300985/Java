package tedu.review;

/**
 * @Date:2021/10/11 9:05
 * @Author:NANDI_GUO
 */
public class ForDemo {
    public static void main(String[] args) {
//        for (int i = 1; i <= 9 ; i++) {
//            System.out.println(i+"!");
//        }
//        for (int i = 0; i <= 2 ; i++) {
//            System.out.println(i);
//            for (int j = 1; j <= 3 ; j++) {
//                System.out.println(j);
//            }
//        }
//        for (int i = 1; i <= 4 ; i++) {
//            for (int j = 1; j <= 5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
////        }
//        for (int i = 1; i <= 6 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
