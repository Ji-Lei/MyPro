<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加学生信息</title>
    <link rel="stylesheet" href="css/home.css">
</head>
<body>
<% if(session.getAttribute("username")==null){ %>
<form action="denglu.jsp">
    <div class="sushe add-style">
        <h3>请添加学生信息</h3>
        姓&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp名：<input type="text" name="name" value=""><br>
        性&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp别：<input type="text" name="sex" value=""><br>
        学&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp院：<input type="text" name="college" value=""><br>
        专&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp业：<input type="text" name="zhuanye" value=""><br>
        班&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp级：<input type="text" name="banji" value=""><br>
        学&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp号：<input type="text" name="xuehao" value=""><br>
        联系方式：<input type="text" name="phone" value=""><br>
        楼&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp栋：<input type="text" name="loudong" value=""><br>
        楼&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp层：<input type="text" name="louceng" value=""><br>
        宿&nbsp舍&nbsp号：<input type="text" name="sushehao" value=""><br><br>
        <button type="submit" name="submit" class="button-style1">提&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp交</button>
    </div>
</form>
<% }else{ %>
<form action="sushe.jsp">
    <div class="sushe add-style">
        <h3>请添加学生信息</h3>
        姓&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp名：<input type="text" name="name" id="name" value=""><br>
        性&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp别：<input type="text" name="sex" id="sex" value=""><br>
        学&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp院：<input type="text" name="college" value=""><br>
        专&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp业：<input type="text" name="zhuanye" value=""><br>
        班&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp级：<input type="text" name="banji" value=""><br>
        学&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp号：<input type="text" name="xuehao" value=""><br>
        联系方式：<input type="text" name="phone" value=""><br>
        楼&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp栋：<input type="text" name="loudong" value=""><br>
        楼&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp层：<input type="text" name="louceng" value=""><br>
        宿&nbsp&nbsp&nbsp舍&nbsp&nbsp号：<input type="text" name="sushehao" value=""><br><br>
        <button type="submit" name="submit" class="button-style1">提&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp交</button>
    </div>
</form>
<%}%>
</body>
</html>