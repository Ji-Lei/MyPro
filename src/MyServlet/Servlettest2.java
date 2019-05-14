package MyServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 纪雷 on 2019/5/14.
 */
@WebServlet(name = "Servlettest2",urlPatterns = "/test2")
public class Servlettest2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String name=(String) this.getServletContext().getAttribute("name");
        System.out.println(name);
    }
}
