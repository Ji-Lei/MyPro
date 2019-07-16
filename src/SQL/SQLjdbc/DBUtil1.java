package SQL.SQLjdbc;

/**
 * Created by ${纪雷} on 2019/4/28.
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtil1 {

    private static final String URL = "jdbc:mysql://localhost:3306/username?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8";
    private static final String NAME = "root";
    private static final String PASSWORD = "yulei970423L";

    private static Connection conn=null;

    static {
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获得数据库的连接
            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
        Statement stmt = conn.createStatement();
        List<User> users = new ArrayList<>();
        ResultSet rs = stmt.executeQuery("select * from userpass");
        while (rs.next()) {
            users.add(new User(rs.getString("nameid"), rs.getString("password"), rs.getString("phone"), rs.getString("email"),rs.getString("sex")));
        }
        for (User user : users) {
            System.out.println(user);
        }
    }
}
