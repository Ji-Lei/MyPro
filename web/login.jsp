<%@ page import="jxl.UsersDAO" %><%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/5/27
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<style>
    .div-alian{
        text-align: center;
    }
</style>
<body>
<div class="bottom div-alian">
    <% if(UsersDAO.check(request.getParameter("username"), request.getParameter("password"))) {
        session.setAttribute("username",request.getParameter("username"));
    %>
    <div class="right">
        <h2>登陆成功</h2>
        <p>欢迎你,<%=request.getParameter("username") %></p>
        <%--<a href="homeleft1.jsp">进入主站</a>--%>
        <time id="time"></time>
        <script type="text/javascript">
            var t = 1;
            jump();
            function jump() {
                if(t==1){
 //                    定时跳转
                    window.location.href="homeleft1.jsp"
                }
                document.getElementById('time').innerHTML=t+"秒后跳转到主页";
                t--;
                setTimeout('jump()',1000);
            }
        </script>
    </div>
    <% } else { %>
    <div class="wrong div-alian">
        <h2>登陆失败</h2>
        <p>请检查用户名或密码</p>
        <time id="time2"></time>
        <script type="text/javascript">
            var t2 = 3;
            jump();
            function jump() {
                if(t2==1){
                    window.location.href="login.html"
                }
                document.getElementById('time2').innerHTML=t2+"秒后跳转到登录界面";
                t2--;
                setTimeout('jump()',1000);
            }
        </script>
    </div>
    <% } %>
</div>

</body>
</html>
