package MyServlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by 纪雷 on 2019/5/9.
 */
public class MyLoginServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        ServletConfig servletConfig = this.getServletConfig();
        String encoding = servletConfig.getInitParameter("encoding");
        System.out.println("encoding="+encoding);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String encoding = this.getServletContext().getInitParameter("encoding");
        System.out.println("encoding="+encoding);

//        System.out.println("MyLoginServlet收到请求");
//        System.out.println("请求方式："+request.getMethod());
//        System.out.println("URI："+request.getRequestURI());
//        System.out.println("发出请求客户端ip地址："+request.getRemoteAddr());
//        System.out.println("服务点接收请求的ip地址："+request.getLocalAddr());
//        System.out.println("访问客户端的段楼号："+request.getRemotePort());
//        System.out.println("web应用路径："+request.getContextPath());
//        System.out.println("http协议和版本："+request.getProtocol());

//        Enumeration<String> headerNames = request.getHeaderNames();
//        while (headerNames.hasMoreElements()){
//            String element = headerNames.nextElement();
//            System.out.println(element+":"+request.getHeader(element));
//        }
//        String nameid=request.getParameter("nameid");
//        String password=request.getParameter("password");
//        System.out.println("用户名："+nameid);
//        System.out.println("密码："+password);
//
//        String result="恭喜你登陆成功";
//        ServletOutputStream outputStream = response.getOutputStream();
//        outputStream.write(result.getBytes());
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter writer = response.getWriter();
//        writer.write(result);
    }
}
