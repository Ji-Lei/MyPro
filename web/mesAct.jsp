<%@ page import="jxl.UsersDAO" %><%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/5/27
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<script>
    <%
    UsersDAO.Delete(request.getParameter("id_stu"));
   %>
    window.location.href = "message.jsp";
</script>
</body>
</html>
