<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10/010
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>测试页</title>
    <base href="<%=basePath%>"></head>
<body>
    ${test}
    <h3>权限不足</h3>
    <form action="/findAll.do" method="post">
        <input class="username" type="text" />
        <input type="submit" value="测试"/>
    </form>

    <div id="win" class="easyui-window" title="Login" style="width:300px;height:180px;">
        <form style="padding:10px 20px 10px 40px;">
            <p>Name: <input type="text"></p>
            <p>Pass: <input type="password"></p>
            <div style="padding:5px;text-align:center;">
                <a href="#" class="easyui-linkbutton" icon="icon-ok">Ok</a>
                <a href="#" class="easyui-linkbutton" icon="icon-cancel">Cancel</a>
            </div>
        </form>
    </div>
</body>
</html>
