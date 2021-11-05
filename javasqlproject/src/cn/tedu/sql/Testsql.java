package cn.tedu.sql;

import org.junit.Test;
import org.w3c.dom.ls.LSException;

import java.sql.*;
import java.util.*;

/**
 * @Date:2021/11/5 10:50
 * @Author:NANDI_GUO
 */
public class Testsql {
    @Test
    public void add() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/cgb2109";
        String user = "root";
        String pwd = "0000";
        Connection conn = DriverManager.getConnection(url,user,pwd);
        Statement st = conn.createStatement();
        int rows = st.executeUpdate("Insert into dept values(null,'jaja',\"西贡\")");
    }


    @Test
    public void get() throws Exception {

        String url = "jdbc:mysql://localhost:3306/cgb2109";
        String user = "root";
        String pwd = "0000";
        Connection conn = DriverManager.getConnection(url,user,pwd);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from dept");

        try {
            op(conn,st,rs, 5);
            System.out.println();
        }catch (Exception e){
            String index = e.getMessage();
            for (int i = 0; i < index.length(); i++) {
                if (index.charAt(i) == '>'){
                    int id = Integer.parseInt(String.valueOf(index.charAt(i+2)));
                    System.err.println("帮你输出了正确结果！但你的标签数应该改成:" + id);
                    op(conn,st,rs,id);
                }
            }
        }
    }

    public static void op(Connection conn, Statement st,ResultSet rs, int id) throws Exception {
        while(rs.next()){//next()判断结果集中是否有数据
            for (int i = 1; i <= id ; i++) {
                //获取每列的值并打印'
                Object a = rs.getObject(i);
                System.out.print("["+a+"]"+"  ");
            }
           System.out.println();
        }
        rs.close(); //关闭结果集
        st.close();//关闭传输器
        conn.close();//关闭连接
    }
}
