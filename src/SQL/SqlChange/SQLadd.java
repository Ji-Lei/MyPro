package SQL.SqlChange;

/**
 * Created by ${纪雷} on 2019/4/28.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class SQLadd {

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

        /*String sql="insert into userpass values('dlz','12345678','123654789','jl-ahstu@qq.com','男')";*/

        String name1=cin.next();
        String password=cin.next();
        String phone=cin.next();
        String email=cin.next();
        String sex=cin.next();

        stmt.executeUpdate("insert into userpass values("+name1+','+password+','+phone+','+email+','+sex+")");
    }
}
