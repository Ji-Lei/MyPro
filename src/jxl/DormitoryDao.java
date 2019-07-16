package jxl;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by 纪雷 on 2019/5/22.
 */
public class DormitoryDao {
    public static void update(String name,String sex,String college,String zhuanye,String banji,String xuehao,String phone,String loudong,String louceng,String sushe) throws Exception {
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

        String sql = "INSERT  INTO dormitory(name,sex,college,zhuanye,banji,xuehao,phone,loudong,louceng,sushe) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, sex);
        ps.setString(3, college);
        ps.setString(4, zhuanye);
        ps.setString(5, banji);
        ps.setString(6, xuehao);
        ps.setString(7, phone);
        ps.setString(8, loudong);
        ps.setString(9, louceng);
        ps.setString(10, sushe);
        ps.executeUpdate();
        JDBC_Util.close(conn, ps, null);
    }
}
