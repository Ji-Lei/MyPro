package SQL.SQLjdbc;

/**
 * Created by ${纪雷} on 2019/4/28.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/username?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8";
    private static final String NAME = "root";
    private static final String PASSWORD = "yulei970423L";

    public static void main(String[] args) throws Exception {

        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库的连接
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        List<User> users = new ArrayList<>();
        ResultSet rs = stmt.executeQuery("select * from userpass");//选择import java.sql.ResultSet;
        while (rs.next()) {
            users.add(new User(rs.getString("nameid"), rs.getString("password"), rs.getString("phone"), rs.getString("email"),rs.getString("sex")));
        }
        for (User user : users) {
            System.out.println(user);
        }
    }
}
