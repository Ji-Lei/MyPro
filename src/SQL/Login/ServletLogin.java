//package SQL.Login;
//
//import SQL.SQLjdbc.User;
//import org.omg.CORBA.portable.InputStream;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Properties;
//
///**
// * Created by 纪雷 on 2019/5/11.
// */
//@WebServlet(name = "ServletLogin",urlPatterns = "ServletLogin")
//public class ServletLogin extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        InputStream resourceAsStream = (InputStream) this.getServletContext().getResourceAsStream("db.properties");
//        Properties properties=new Properties();
//        properties.load(resourceAsStream);
//        String name=properties.getProperty("name");
//        String password=properties.getProperty("password");
//        String url=properties.getProperty("url");
//        System.out.println(url);
//        System.out.println(name);
//        System.out.println(password);
//    }
//}
