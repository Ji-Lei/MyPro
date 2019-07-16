package jxl;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static jxl.JDBC_Util.*;

public class UsersDAO {
    public static void update(String nameid, String password, String phone, String email) throws Exception {

        //获取连接
        Connection conn = JDBC_Util.getConn();

        String sql = "INSERT  INTO userpass(nameid,password,phone,email) VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nameid);
        ps.setString(2, password);
        ps.setString(3, phone);
        ps.setString(4, email);
        ps.executeUpdate();
        close(conn, ps, null);
    }



    public static List<String> query(List<String> list) throws Exception {

        //获取连接
        Connection conn = JDBC_Util.getConn();


        String sql = "select * from dormitory";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            String sex=rs.getString("sex");
            String college = rs.getString("college");
            String zhuanye = rs.getString("zhuanye");
            String banji = rs.getString("banji");
            String xuehao = rs.getString("xuehao");
            String phone = rs.getString("phone");
            String loudong = rs.getString("loudong");
            String louceng = rs.getString("louceng");
            String sushe = rs.getString("sushe");
            list.add(name);
            list.add(sex);
            list.add(college);
            list.add(zhuanye);
            list.add(banji);
            list.add(xuehao);
            list.add(phone);
            list.add(loudong);
            list.add(louceng);
            list.add(sushe);
        }
        JDBC_Util.close(conn, ps, rs);
        return list;

    }


    public static void Delete(String xuehao) throws SQLException {
        //获取连接
        Connection conn = JDBC_Util.getConn();

        String sql = "DELETE FROM dormitory where xuehao =" + "'" + xuehao + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.executeUpdate();
        close(conn, ps, null);
    }

    public static boolean check(String username) throws Exception{

        //获取连接
        Connection conn = JDBC_Util.getConn();

        String sql = "select nameid from userpass where nameid = '"+username+"'";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        if(rs.next())return false;
        else return true;
    }


    public static boolean check(String username,String password) throws Exception{
        boolean flag=false;

        //获取连接
        Connection conn = JDBC_Util.getConn();

        String sql = "select * from userpass where nameid = '"+username+"'";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            String name = rs.getString("nameid");
            String pawd = rs.getString("password");
            if(name.equals(username)&&pawd.equals(password))flag = true;
        }
        JDBC_Util.close(conn, ps, rs);
        return flag;
    }

}