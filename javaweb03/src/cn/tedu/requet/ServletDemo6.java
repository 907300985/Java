package cn.tedu.requet;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Key;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

/**
 * @Date:2021/11/19 17:47
 * @Author:NANDI_GUO
 */
@WebServlet("/ServletDemo6")
public class ServletDemo6 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        /**
         * doGet没有中文乱码，因为Tomcat自动配置好了URIEncoding = "utf-8"
         * doPost提交的如果有中文一定乱码，需要自己在第一行进行配置
         * */
        String m = request.getMethod();
        System.out.println(m);
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {


        // * request的实现
        String u = request.getQueryString();
        System.out.println(u);
        String[] data = u.split("&");
        System.out.println(Arrays.toString(data));
        for (String s: data) {
            String[] p = s.split("=");
            System.out.println(Arrays.toString(p));
        }


        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        System.out.println(user+"\n"+pwd);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///cgb2109","root","0000");
            String sql = "insert into user values(null,?,?)";
            PreparedStatement s = null;

            if (!user.equals("")&&!pwd.equals("")){
                s = c.prepareStatement(sql);
            }else {
                System.out.println("值不能为空");
            }

            s.setObject(1,user);
            s.setObject(2,pwd);
            s.executeUpdate();

            s.close();
            c.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

