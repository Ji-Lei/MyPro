package SQL.Login2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
/**
 * Created by 纪雷 on 2019/5/11.
 */
public class JDBCUitl2 {
    private JDBCUitl2(){
    }
    private static Connection connection;
    private static Properties properties;

    private static Properties readFile() {
        // 通过类加载器获取bin文件夹下的文件的字节流
        InputStream is = JDBCUitl2.class.getClassLoader().getResourceAsStream("dbinfo.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    static {
        // 只读一次文件
        properties = readFile();
        try {
            Class.forName(properties.getProperty("driverClass"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("注册驱动失败");
        }
    }
    public static Connection getConnection() {
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("connection failure");
        }
        return connection;
    }
    //关闭资源
    public static void JDBCClose(Connection connection, java.sql.Statement statement, ResultSet rs) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
