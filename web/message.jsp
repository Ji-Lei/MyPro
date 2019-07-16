<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="jxl.UsersDAO" %>
<%@ page import="jxl.JDBC_Util" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="icon" href="images/logo.jpg">
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/javascript; charset=utf-8" />
    <title>学生信息</title>
    <link rel="stylesheet" href="css/message.css">
    <script src="js/jquery-1.12.4.js"></script>
</head>
<body>
<h1 align="center">学生信息表</h1>
<%
    Connection conn = JDBC_Util.getConn();


    String sql = "select * from dormitory";

    PreparedStatement ps = conn.prepareStatement(sql);

    ResultSet rs = ps.executeQuery();
%>
<table align="center" width="100%" frame="box" rules="all">
    <div property="columns">
        <tr>
            <th><div name="name" width="120" headerAlign="center">姓名</div></th>
            <th><div name="sex" width="120" headerAlign="center">性别</div></th>
            <th><div name="college" width="120" headerAlign="center">学院</div></th>
            <th><div name="zhuanye" width="120" headerAlign="center">专业</div></th>
            <th><div name="banji" width="120" headerAlign="center">班级</div></th>
            <th><div name="xuehao" width="120" headerAlign="center">学号</div></th>
            <th><div name="phone" width="120" headerAlign="center">手机号</div></th>
            <th><div name="loudong" width="120" headerAlign="center">楼栋</div></th>
            <th><div name="louceng" width="120" headerAlign="center">楼层</div></th>
            <th><div name="sushe" width="120" headerAlign="center" allowSort="true">宿舍号</div></th>
            <th><div name="sushe" width="120" headerAlign="center" >操作</div></th>
        </tr>
        <%
            while(rs.next()){
        %>
        <tr>
            <td align="center" class="table-color"><% out.print(rs.getString(1)); %></td>
            <td align="center"><% out.print(rs.getString(2)); %></td>
            <td align="center"><% out.print(rs.getString(3)); %></td>
            <td align="center"><% out.print(rs.getString(4)); %></td>
            <td align="center"><% out.print(rs.getString(5)); %></td>
            <td align="center" class="table-color1"><% out.print(rs.getString(6)); %></td>
            <td align="center"><% out.print(rs.getString(7)); %></td>
            <td align="center"><% out.print(rs.getString(8)); %></td>
            <td align="center"><% out.print(rs.getString(9)); %></td>
            <td align="center"><% out.print(rs.getString(10)); %></td>
            <td align="center"><button style="cursor: pointer" id="id_<%=rs.getString(6)%>" >删除</button></td>
        </tr>
        <%
            }
        %>
    </div>
    </div>
</table>

<% if(session.getAttribute("username")==null){ %>
<form action="mesAct.jsp" method="post" id="form1">
    <div id="div1">
        还未登录，请登录！
    </div>
    <input type="hidden" name="id_stu" value="" id="id_stu11">
    <%--<input type="submit" name="submit" value="确定" id="submit1" style="cursor: pointer">--%>
    <input type="button" id="btn1" value="确认" style="cursor: pointer">
</form>
<% }else{ %>
<form action="mesAct.jsp" method="post" id="form">
    <div id="div">
        是否删除该条学生信息？
    </div>
    <input type="hidden" name="id_stu" value="" id="id_stu1">
    <input type="submit" name="submit" value="确定" id="submit" style="cursor: pointer">
    <input type="button" id="btn" value="取消" style="cursor: pointer">
</form>
<%}%>

<%
    JDBC_Util.close(conn,ps,rs);
%>
<script>
    function open1(){
        var id=$(this).attr("id");

        $("#id_stu1").attr("value",id.split("_")[1]);

        $("#form").css("display","block");
    }
    $("button[id^='id_']").on("click",open1);
    $("#btn").click(function () {
        $("#form").css("display","none");
    })

    function open11(){
        var id=$(this).attr("id");

        $("#id_stu11").attr("value",id.split("_")[1]);

        $("#form1").css("display","block");
    }
    $("button[id^='id_']").on("click",open11);
    $("#btn1").click(function () {
        $("#form1").css("display","none");
    })
</script>

<%--<%--%>
    <%--request.setCharacterEncoding("utf-8");--%>
    <%--List<String> list = new LinkedList<String>();--%>
    <%--list = UsersDAO.query(list);--%>
    <%--int sum = 0;--%>
    <%--for (String i : list) {--%>
        <%--out.println(i);--%>
        <%--sum++;--%>
        <%--if (sum % 9 == 0) {--%>
            <%--out.println("<br>");--%>
        <%--}--%>
    <%--}--%>
<%--%>--%>

</body>
</html>
