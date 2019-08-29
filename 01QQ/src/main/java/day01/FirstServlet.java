package day01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/8/29 10:07
 * @Created by Happy-微冷的雨
 */
@WebServlet(name = "FirstServlet",urlPatterns = {"/FirstServlet"},loadOnStartup = 1)
public class FirstServlet extends HttpServlet {
    //service
    @Override
    public void init() throws ServletException {
        System.out.println("====init=====");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("===========");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
