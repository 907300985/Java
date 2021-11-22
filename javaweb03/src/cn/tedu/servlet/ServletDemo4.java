package cn.tedu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date:2021/11/19 15:25
 * @Author:NANDI_GUO
 */
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
    /*Servlet生命周期中会被调用的方法：
    * init() service() destroy()
    * 因为GenericServlet提供的以上方法都是空实现
    * 重写这些方法并添加方法体来感受初始化的不同阶段*/
    @Override
    public void destroy() {
        System.out.println("Barbecue, destroy()被调了");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init()被调用了,Servlet已被初始化了");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost()搞起来");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet()搞起来");
    }
}
