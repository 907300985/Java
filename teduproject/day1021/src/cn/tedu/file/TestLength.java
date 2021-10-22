package cn.tedu.file;

/**
 * @Date:2021/10/21 15:53
 * @Author:NANDI_GUO
 */

/**输出一段句子里最长的单词的长度，不能用split等函数。*/
public class TestLength {
    public static void main(String[] args) {
        String s = "This is a word";
        int current = 0;                       //记录当前的单词长度
        int max = 0;                           //记录历史最长的单词长度
        char s1 = ' ';
        for (int i = 0; i < s.length(); i++) { //遍历所有字符
            if(s.charAt(i) != s1){             //如果当前不是空格，当前单词长度计数+1
                ++current;
                if (current > max){
                    max = current;
                }
            }else{
                current = 0;
            }
        }
        System.out.println(max);
    }
}
