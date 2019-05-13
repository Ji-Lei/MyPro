package SQL.SqlChange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by 纪雷 on 2019/5/10.
 */
public class SQLfind {
    public static void main(String[] args) throws Exception {
        //导入驱动包
        Class.forName("com.mysql.cj.jdbc.Driver");
        //链接至数据库
        String jdbc = "jdbc:mysql://localhost:3306/username?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8";
        Connection conn = DriverManager.getConnection(jdbc, "root", "yulei970423L");

        Statement state = conn.createStatement();//容器
        String sql = "select * from userpass";           //sql语句
        ResultSet rs = state.executeQuery(sql);     //将sql语句传至数据库，返回的值为一个字符集用一个变量接收

        while (rs.next()) {    //next（）获取里面的内容
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            //getString（n）获取第n列的内容
            //数据库中的列数是从1开始的
        }


        conn.close();
    }
}
