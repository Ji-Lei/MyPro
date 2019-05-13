package SQL.SqlChange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by 纪雷 on 2019/5/10.
 */
public class SQLlogin {
    public static void main(String[] args) throws Exception {
        // 输入用户名和密码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号");
        String zh=sc.nextLine();
        System.out.println("请输入密码");
        String mm=sc.nextLine();

        //    zh=zh.replaceAll("\'", "\"");     //替换
        //    mm=mm.replaceAll("\'", "\"");        //替换

        //到数据库验证用户名和密码是否正确
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/username?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF8", "root", "yulei970423L");
        Statement state=conn.createStatement();
        String sql="select * from userpass where nameid='"+zh+"' and password='"+mm+"'";
        ResultSet re=state.executeQuery(sql);

        //输出：正确显示欢迎，不正确显示错误
        if(re.next()){
            System.out.println("登陆成功！"+re.getString(3)+" 欢迎你");
        }
        else{
            System.out.println("输入账号或密码错误");
        }


        conn.close();



    }
}
