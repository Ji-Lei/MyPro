package SQL.SqlChange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by 纪雷 on 2019/5/10.
 */
public class SQLdelete {
    private static final String URL = "jdbc:mysql://localhost:3306/username?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8";
    private static final String NAME = "root";
    private static final String PASSWORD = "yulei970423L";

    public static void main(String[] args) throws Exception {
        Scanner cin=new Scanner(System.in);
        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库的连接
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查
        Statement stmt = conn.createStatement();

        /*String sql="delete from userpass where nameid='dlz'";*/
        String name2=cin.next();
        stmt.executeUpdate("delete from userpass where nameid="+name2);
    }
}
