package cn.tedu.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @Date:2021/11/8 10:44
 * @Author:NANDI_GUO
 */
public class OptimisedInsert {
        public static void main(String[] args) throws Exception {
            insert();
        }

        private static void insert() throws Exception {
            Connection c1 = JDBCUtils.get();
            String sql = "insert into dept values(null,?,?)";
            PreparedStatement s = c1.prepareStatement(sql);

            s.setObject(1,"shuailong");
            s.setObject(2,"北京开发部");
            s.executeUpdate();

            s.close();
            c1.close();
        }
}

class JDBCUtils{
    /**我随便写*/
   static public Connection get() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql:///cgb2109","root","0000");
        return c;
    }
}


