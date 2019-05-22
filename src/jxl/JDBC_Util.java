package jxl;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Util {
    public static String url = "jdbc:mysql://localhost/username";
    public static String user = "root";
    public static String pwd = "yulei970423L";
    public static String driverName = "com.mysql.jdbc.Driver";
    public static BasicDataSource ds = null;
    //把加载驱动放在static静态代码块中执行，驱动只会执行一次，而不是每次调用方法都要执行一次
    static {
        //创建连接池
        ds = new BasicDataSource();
        ds.setDriverClassName(driverName);
        ds.setUsername(user);
        ds.setPassword(pwd);
        ds.setUrl(url);
    }
    public static Connection getConn(){
        try{
            //2.连接数据库
            return ds.getConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void close(Connection conn, Statement st, ResultSet rs){
        //5.释放资源
        if(rs != null){
            try {
                rs.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(st != null){
            try {
                st.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}