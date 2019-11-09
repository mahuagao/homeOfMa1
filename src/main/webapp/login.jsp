<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/12/012
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
<head>
    <title>MyHome登录</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <script type="text/javascript" src="easyui/jquery.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

    <style>
        #div1{
            position : absolute;
            left : 480px;
            top :250px;
            width : 350px;
            height : 220px;
        }
    </style>

    <script>

        window.onload = function(){
            if (window.parent.window != window){
                window.top.location = "login.jsp";
            }
        }

        function show(){
            $('#win').window('open');
        }

        function clear1(){
            document.getElementById("username").value("");
            document.getElementById("password").value("");
        }

        function getthrow(){
            var ipt = document.createElement("input");
            ipt.setAttribute("type","hidden");
            ipt.setAttribute("name","guest");
            ipt.setAttribute("value","yes");
            var fom = document.getElementById("ad");
            fom.appendChild(ipt);
            fom.submit();
            //window.location.href="/syslogin.do";
        }

    </script>


</head>
<body background="img/bg4.jpg" style="background-attachment: fixed;background-size: 100%,100%">

<div id = "div1">
     <table width="350px" border="1" >
         <tr><td align="left">用户登录</td></tr>
         <tr><td align="center">
         <form id="ad" action="/syslogin.do" method="post">
          用户名：<input type="text" name="username"/><br/>
          密码：<input type="password" name="password"/><br/>
          <input type="submit" value="登录">
             &nbsp;&nbsp;&nbsp;<button onclick="getthrow()">游客访问</button>
      </form>
         </td>
         </tr>

     </table>
</div>

<!--
<button onclick="show()">登录</button>

<div id="win" class="easyui-window" title="Login" closed="true" style="width:300px;height:180px;">
    <form style="padding:10px 20px 10px 40px;">
        <p>用户名: <input  type="text" name="username"></p>
        <p>密  码: <input  type="password" name="password"></p>
        <div style="padding:5px;text-align:center;">
            <a href="/syslogin.do" class="easyui-linkbutton" icon="icon-ok">Ok</a>
            <a href="javascript:void(0)" onclick="clear1()" class="easyui-linkbutton" icon="icon-cancel">Cancel</a>
        </div>
    </form>
</div>
-->
</body>
</html>