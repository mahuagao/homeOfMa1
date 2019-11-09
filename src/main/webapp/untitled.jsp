<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html >
<head>
<meta charset=utf-8">
    <link rel="stylesheet" href="css/viewer.css"/>
    <title>无标题文档</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <script type="text/javascript" src="easyui/jquery.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

    <style>
        * { margin: 0; padding: 0;}

        #div1{
            position: absolute;
            width: 100%;
            height: 100%;
        }
        
        #qwer { 
            width: 700px; 
            margin: 0 auto; 
            font-size: 0;
        }
        #qwer li { 
            display: inline-block; 
            width: 32%; 
            margin-left: 1%; 
            padding-top: 1%;
        }
        #qwer li img {
            width: 100%;
        }
        
        
        
    </style>

    <script>
        function show1(){
            $('#win').window('open');
        }
    </script>

</head>
<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">

<div id="win" class="easyui-window" title="My Window" closed="true" style="width:500px;height:400px;padding:5px;">
    图片显示区
</div>
<div id="div1">
    <ul id="qwer">
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/1.jpg" width="400" height="300" alt="图片1"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/2.jpg" width="400" height="300" alt="图片2"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/3.jpg" width="400" height="300" alt="图片3"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/4.jpg" width="400" height="300" alt="图片4"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/5.jpg" width="400" height="300" alt="图片5"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/6.jpg" width="400" height="300" alt="图片6"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/7.jpg" width="400" height="300" alt="图片7"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/8.jpg" width="400" height="300" alt="图片8"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/9.jpg" width="400" height="300" alt="图片9"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/10.jpg" width="400" height="300" alt="图片10"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/11.jpg" width="400" height="300" alt="图片11"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/12.jpg" width="400" height="300" alt="图片12"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/13.jpg" width="400" height="300" alt="图片13"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/14.jpg" width="400" height="300" alt="图片14"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/15.jpg" width="400" height="300" alt="图片15"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/16.jpg" width="400" height="300" alt="图片16"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/17.jpg" width="400" height="300" alt="图片17"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/18.jpg" width="400" height="300" alt="图片18"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/19.jpg" width="400" height="300" alt="图片19"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/20.jpg" width="400" height="300" alt="图片20"></a></li>
        <li><a href="javascript:void(0)" onclick="show1()"><img src="img/21.jpg" width="400" height="300" alt="图片21"></a></li>

    </ul>
</div>
<script type="javascript" src="js/viewer.js"/>
<script>
    var viewer = new Viewer(document.getElementById('qwer'));
</script>

</body>
</html>