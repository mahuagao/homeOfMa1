<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>left</title>
	<meta charset="utf-8" />
    <base href="<%=basePath%>">


    <script>

  /*        function chgback(){
              document.getElementById('asd').style.setProperty('background-image','url(\'img/left.jpg\')');
              var  topW = window.top.top;
              var ifan = window.getElementsByName('top').contentWindow;
              ifan.chgback1();
          }
   */
          function chgback(){
              document.getElementById('asd').style.setProperty('background-image','url(\'img/left.jpg\')');
          }

    </script>

</head>
<body id="asd" style="background-image: url('img/left.jpg');background-attachment: fixed;background-size: 100%,100%">

  <audio autoplay="autopaly">
    <source src="mp3/whistle.mp3" type="audio/mp3" />
  </audio>

    <ol>
        <li onclick="chgback()"><a href="/getAllImg.do" target="right">时光匆匆</a></li>
        <li onclick="chgback()"><a href="/findResum.do" target="right">电子简历</a></li>
        <li onclick="chgback()"><a href="his_msg.jsp" target="right">留言板块</a></li>
        <li onclick="chgback()"><a href="/findAll.do" target="right">文档管理</a></li>
        <li onclick="chgback()"><a href="/seleAct.do" target="right">他的动态</a></li>
        <li onclick="chgback()"><a href="his_like.jsp" target="right">兴趣爱好</a></li>
        <li onclick="chgback()"><a href="his_technology.jsp" target="right">技术特点</a></li>
        <li onclick="chgback()"><a href="his_plan.jsp" target="right">职业规划</a></li>
        <!--是管理员角色的人才能看到-->
        <shiro:hasPermission name="logging">
            <li onclick="chgback()"><a href="web_log.jsp" target="right">日志监控</a></li>
        </shiro:hasPermission>
    </ol>

</body>
</html>