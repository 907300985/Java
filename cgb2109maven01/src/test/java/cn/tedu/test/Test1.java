package cn.tedu.test;
//直接在pom.xml里，添加了jar包的以来,maven自动下载自动保存自动编译
/**
 * @Date:2021/11/23 14:42
 * @Author:NANDI_GUO
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

    }
}
