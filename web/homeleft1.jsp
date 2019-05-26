<%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/5/22
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎使用安徽科技学院学生宿舍管理系统！</title>
    <link rel="stylesheet" href="css/home.css">
</head>
<body>
<header class="home_background"><!-- 设置在顶端 -->
    <nav>
        <div>
            <ul class="big_text">
                <li><a href="homeleft1.jsp" target="iframe_a">安徽科技学院学生宿舍管理系统</a></li>
            </ul>
        </div>
    </nav>
</header>
<table border="1">
    <%--<tr><%@include file="top.jsp"%></tr>--%>
        <tr>
            <td style="background-color: #999999">管理</td>
            <th rowspan="6" width="1200px" height="1800px">
                <div>
                    <iframe src="sushe.html" name="iframe_a" class="iframe_aa" frameborder="0"></iframe>
                </div>
            </th>
        </tr>
        <tr>
            <td><a href="index.html" target="iframe_a">学生信息</a></td>
        </tr>
        <tr>
            <td><a href="sushe.html" target="iframe_a">添加学生</a></td>
        </tr>
        <tr>
            <td><a href="index.html" target="iframe_a">添加管理员</a></td>
        </tr>
        <tr>
            <td><a href="index.html" target="iframe_a">账号管理</a></td>
        </tr>
        <tr>
        <td style="height: 1000px"></td>
        </tr>
</table>

</body>
</html>
