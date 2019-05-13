package MyServlet;

import org.omg.CORBA.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 纪雷 on 2019/5/9.
 */
@WebServlet(name = "LoginServlet" ,urlPatterns = "/MyPj")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收get请求");
        /*System.out.println(request.getRemoteAddr());*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收post请求");
    }
}
