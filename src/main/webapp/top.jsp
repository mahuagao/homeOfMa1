<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>top</title>
	<meta charset="utf-8" />
    <base href="<%=basePath%>">

    <script>

        function chgback1(){
            document.getElementById('qwe').style.setProperty('background-image','url(\'img/top.jpg\')');
        }

    </script>

</head>
<body id="qwe" style="background-image: url('img/top.jpg');background-attachment: fixed;background-size: 100%,100%">

    <h3 align="center"></h3>
    <div margin-top="90%" margin-bottom="0px">
    <a href="/logout.do" align="right">注销用户</a>
        &nbsp;&nbsp; <button onclick="chgback1()">切换</button>
    </div>
</body>
</html>