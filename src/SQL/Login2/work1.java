package SQL.Login2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by 纪雷 on 2019/5/11.
 */

public class work1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        String sql = "select * from users where username=? and password=?";
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String chck = request.getParameter("chck");

        Connection connection = JDBCUitl2.getConnection();
        PreparedStatement prepareStatement = null;
        try {
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, username);
            prepareStatement.setString(2, password);
            ResultSet rs = prepareStatement.executeQuery();
            while (rs.next()) {
                String user = rs.getString("username");
                String pw = rs.getString("password");
                if (user.equals(username) && pw.equals(password)) {
                    response.getWriter().write("登录成功");
                    Cookie cookie1 = new Cookie("username", username);
                    Cookie cookie2 = new Cookie("password", password);
                    cookie1.setPath("/");
                    cookie2.setPath("/");
                    if (chck != null) {
                        cookie1.setMaxAge(60*5);
                        cookie2.setMaxAge(60*5);
                    } else {
                        cookie1.setMaxAge(0);
                        cookie2.setMaxAge(0);
                    }
                    response.addCookie(cookie1);
                    response.addCookie(cookie2);
                    response.getWriter().write(username);
                    response.getWriter().write(password);
                } else {
                    response.getWriter().write("登录失败嗷");
                    response.setHeader("refresh", "3;/day33work/login");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
