package SQL.Login2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 纪雷 on 2019/5/11.
 */

public class Login extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        Cookie[] cookies = request.getCookies();
        String username = "";
        String password = "";
        String chck="";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    username = cookie.getValue();
                    chck ="checked='checked'";
                }
                if (cookie.getName().equals("password")) {
                    password = cookie.getValue();
                }
            }
        }
        response.getWriter().write("<form action='/day33work/work1' method='post'>"
                + " 姓名:<input type='text' name='username' value='" + username + "'><br/>"
                + " 密码:<input type='text' name='password' value='" + password + "'><br/>"
                + " 记住密码:<input type='checkbox' name='chck' " + chck + "><br/>"
                + " <input type='submit' value='提交'>"
                + " </form>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
