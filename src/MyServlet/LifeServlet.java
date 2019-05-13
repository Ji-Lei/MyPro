package MyServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 纪雷 on 2019/5/12.
 */
@WebServlet(name = "LifeServlet",urlPatterns = "/life")
public class LifeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init被执行了");
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service被执行了");
        super.service(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get被执行了");
    }

    @Override
    public void destroy() {
        System.out.println("destroy被执行了");
        super.destroy();
    }
}
