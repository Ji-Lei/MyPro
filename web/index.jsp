<%@ page import="jxl.UsersDAO" %><%--
  Created by IntelliJ IDEA.
  User: 纪小雷
  Date: 2019/5/9
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>恭喜你，添加管理员成功！</title>
    <style>
      .div-alian{
        text-align: center;
      }
    </style>
  </head>
  <body>
  <div class="div-alian">
    <p>添加管理员成功！</p>
    <time id="time2"></time>
    <script type="text/javascript">
        var t2 = 3;
        jump();
        function jump() {
            if(t2==1){
                window.location.href="admin.jsp"
            }
            document.getElementById('time2').innerHTML=t2+"秒后返回";
            t2--;
            setTimeout('jump()',1000);
        }
    </script>
  </div>
  <%
    String c1 = request.getParameter("nameid");
    String c2 = request.getParameter("password");
    String c3 = request.getParameter("phone");
    String c4 = request.getParameter("email");
    UsersDAO.update(c1,c2,c3,c4);
    /*out.println(c1);
    out.println(c2);
    out.println(c3);*/
    %>
  </body>
</html>
