package cn.tedu.redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date:2021/11/22 17:45
 * @Author:NANDI_GUO
 */
@WebServlet("/RedirectA")
public class RedirectA extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //重定向:
        /*
        请求转发：时request的功能，全程1次请求1次响应，地址栏不变
        重定向：response的功能，全过程2ci请求2次响应，地址栏改变
        * */
        response.sendRedirect("https://www.bilibili.com/");
    }
}
