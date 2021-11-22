package cn.tedu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date:2021/11/19 9:36
 * @Author:NANDI_GUO
 */
@WebServlet("/ServletDemo1")
//ServletDemo1是子类，可以使用父类的所有资源
//Servlet规定了自定义的规则
//方式1：extends HttpServlet --推荐
//方式2：extends GenericServlet--了解
//方式3：implements Servlet--了解
public class ServletDemo1 extends HttpServlet {
    //继承了父类，但是想改父类的原有的功能，就重写
    //不论调用doPost()或者doGet(),都是由Servlet来调用的
    //当用户用post方式提交请求时（form表单提交）,Servlet来调用doPost()
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("您访问了doPost()");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("您访问了doGet()");
    }
}
