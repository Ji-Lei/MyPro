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
                <table style="border: hidden" width="100%">
                     <tr>
                         <td></td>
                         <td><li><a href="message.jsp" target="iframe_a" class="titlestyle">安徽科技学院学生宿舍管理系统</a></li></td>
                         <td>
                             <% if(session.getAttribute("username")==null){ %>
                             <div class="loginstyle">
                                 <a href="login.html">未登陆，请登陆 <img src="images/icons/user.svg" alt="" width="20px"></a>
                             </div>
                             <% }else{ %>
                             <div class="logout">
                                 欢迎你，<a href="message.jsp" target="iframe_a"><img src="images/icons/user.svg" alt="" width="20px"></a><%=session.getAttribute("username")%>,<a href="logout.jsp">注销</a>
                             </div>
                             <% } %>
                         </td>
                     </tr>
                </table>
            </ul>
            <%--<% if(session.getAttribute("username")==null){ %>--%>
            <%--<div>--%>
                <%--你还未登陆，请<a href="login.html">登陆</a>--%>
            <%--</div>--%>
            <%--<% }else{ %>--%>
            <%--<div>--%>
                <%--欢迎你，<%=session.getAttribute("username")%>,<a href="logout.jsp">注销</a>--%>
            <%--</div>--%>
            <%--<% } %>--%>
        </div>
    </nav>
</header>

<table >
    <%--<tr><%@include file="top.jsp"%></tr>--%>
            <tr style="border: hidden">
                <td style="background-color: #999999" width="150px" height="50px">管理</td>
                <th rowspan="3" width="1000px" height="1800px">
                    <div>
                        <iframe src="wellcom.html" name="iframe_a" class="iframe_aa" frameborder="0"></iframe>
                    </div>
                </th>
            </tr>
        <tr valign="top">
            <td>
                <a href="wellcom.html" target="iframe_a"><input type="button" value="欢迎进入" class="button-style" ></a>
                <a href="message.jsp" target="iframe_a"><input type="button" value="学生信息" class="button-style"></a>
                <a href="sushe1.jsp" target="iframe_a"><input type="button" value="添加学生" class="button-style"></a>
                <a href="admin.jsp" target="iframe_a"><input type="button" value="添加管理员" class="button-style"></a>
            </td>
            <td style="height: 1000px"></td>
        </tr>
</table>

<script>
    function jump() {
        if (session.getAttribute("username")==null){
            alert("你还没登录，请登录！");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
