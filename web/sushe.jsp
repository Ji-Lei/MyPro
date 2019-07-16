<%@ page import="jxl.DormitoryDao" %>
<%@ page import="jxl.UsersDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.LinkedList" %>
<%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/5/22
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎来到学生宿舍成员管理系统！</title>
</head>
<body>
<%--<a href="sushe1.jsp">继续添加学生信息</a><br>--%>
<script>
    <%
    request.setCharacterEncoding("UTF-8");
    String d1 = request.getParameter("name");
    String d2 = request.getParameter("sex");
    String d3 = request.getParameter("college");
    String d4 = request.getParameter("zhuanye");
    String d5 = request.getParameter("banji");
    String d6 = request.getParameter("xuehao");
    String d7 = request.getParameter("phone");
    String d8 = request.getParameter("loudong");
    String d9 = request.getParameter("louceng");
    String d10 = request.getParameter("sushehao");
    DormitoryDao.update(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
%>
    alert("提交成功！");
    window.location.href = "sushe1.jsp";
</script>

</body>
</html>
