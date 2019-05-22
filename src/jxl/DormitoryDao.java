package jxl;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by 纪雷 on 2019/5/22.
 */
public class DormitoryDao {
    public static void update(String name,String college,String zhuanye,String banji,String xuehao,String phone,String loudong,String louceng,String sushe) throws Exception {
        String url = "jdbc:mysql://localhost/username";
        String user = "root";
        String pwd = "yulei970423L";
        String driverName = "com.mysql.jdbc.Driver";

        //创建连接池
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverName);
        ds.setUsername(user);
        ds.setPassword(pwd);
        ds.setUrl(url);

        //获取连接
        Connection conn = ds.getConnection();

        String sql = "INSERT  INTO dormitory(name,college,zhuanye,banji,xuehao,phone,loudong,louceng,sushe) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, college);
        ps.setString(3, zhuanye);
        ps.setString(4, banji);
        ps.setString(5, xuehao);
        ps.setString(6, phone);
        ps.setString(7, loudong);
        ps.setString(8, louceng);
        ps.setString(9, sushe);
        ps.executeUpdate();
        JDBC_Util.close(conn, ps, null);
    }
}
