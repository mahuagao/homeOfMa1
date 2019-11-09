<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>时光匆匆</title>
        <base href="<%=basePath%>">
		<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
        <link rel="stylesheet" type="text/css" href="css/main.css"/>
		<script type="text/javascript" src="easyui/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

        <style type="text/css">
            #apDiv1 {
                position: absolute;
                left: 7px;
                top: 12px;
                width: 130px;
                height: 130px;
                z-index: 1;
            }
            #apDiv2 {
                position: absolute;
                left: 161px;
                top: 12px;
                width: 130px;
                height: 130px;
                z-index: 2;
            }
            #apDiv3 {
                position: absolute;
                left: 301px;
                top: 12px;
                width: 130px;
                height: 130px;
                z-index: 3;
            }
            #apDiv4 {
                position: absolute;
                left: 450px;
                top: 12px;
                width: 130px;
                height: 130px;
                z-index: 4;
            }
            #apDiv5 {
                position: absolute;
                left: 614px;
                top: 12px;
                width: 130px;
                height: 130px;
                z-index: 5;
            }
            #apDiv6 {
                position: absolute;
                left: 769px;
                top: 12px;
                width: 130px;
                height: 130px;
                z-index: 6;
            }
            #apDiv7 {
                position: absolute;
                left: 921px;
                top: 12px;
                width: 130px;
                height: 130px;
                z-index: 7;
            }
            #apDiv8 {
                position: absolute;
                left: 8px;
                top: 158px;
                width: 130px;
                height: 130px;
                z-index: 8;
            }
            #apDiv9 {
                position: absolute;
                left: 160px;
                top: 158px;
                width: 130px;
                height: 130px;
                z-index: 9;
            }
            #apDiv10 {
                position: absolute;
                left: 300px;
                top: 158px;
                width: 130px;
                height: 130px;
                z-index: 10;
            }
            #apDiv11 {
                position: absolute;
                left: 450px;
                top: 158px;
                width: 130px;
                height: 130px;
                z-index: 11;
            }
            #apDiv12 {
                position: absolute;
                left: 613px;
                top: 158px;
                width: 130px;
                height: 130px;
                z-index: 12;
            }
            #apDiv13 {
                position: absolute;
                left: 768px;
                top: 158px;
                width: 130px;
                height: 130px;
                z-index: 13;
            }
            #apDiv14 {
                position: absolute;
                left: 921px;
                top: 158px;
                width: 130px;
                height: 130px;
                z-index: 14;
            }
            #apDiv15 {
                position: absolute;
                left: 7px;
                top: 307px;
                width: 130px;
                height: 130px;
                z-index: 15;
            }
            #apDiv16 {
                position: absolute;
                left: 158px;
                top: 307px;
                width: 130px;
                height: 130px;
                z-index: 16;
            }
            #apDiv17 {
                position: absolute;
                left: 302px;
                top: 307px;
                width: 130px;
                height: 130px;
                z-index: 17;
            }
            #apDiv18 {
                position: absolute;
                left: 450px;
                top: 307px;
                width: 130px;
                height: 130px;
                z-index: 18;
            }
            #apDiv19 {
                position: absolute;
                left: 612px;
                top: 307px;
                width: 130px;
                height: 130px;
                z-index: 19;
            }
            #apDiv20 {
                position: absolute;
                left: 770px;
                top: 307px;
                width: 130px;
                height: 130px;
                z-index: 20;
            }
            #apDiv21 {
                position: absolute;
                left: 922px;
                top: 307px;
                width: 130px;
                height: 130px;
                z-index: 21;
            }

        </style>

        <script>
            function show(truepath){
                //拼接原图的路径
                //      var truepath = i +"_"+ j;
                //获取div
                var win = document.getElementById("win");
                //获取图片
                var chge = document.getElementById("chge");
                //创建一个新节点
                var img = document.createElement("img");
                img.setAttribute("src",truepath);
                img.setAttribute("width","550px");
                img.setAttribute("height","450px");
                //替换
                win.replaceChild(img,chge);
                $('#win').window('open');
            }

            $(document).ready(function(){
                $('#win').window({
                    onBeforeClose:function(){
                        window.location.href = "/getAllImg.do";
                    }
                });
            });



        </script>

    </head>

	<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">

    <div id="win" class="easyui-window" title="My Window" closed="true" style="width:600px;height:500px;padding:5px;">
        <img src="img/1_1.jpg" id="chge" width="550px" height="450px">
    </div>

    <%! int i = 0; %>

    <c:forEach items="${dtos}" var="b">
        <%
            i++;
            String str = "apDiv"+i;
            pageContext.setAttribute("i",i);
            pageContext.setAttribute("str",str);
        %>
        <a href="javascript:void(0)" onclick="show('${b.imgpath}')"> <img src="${b.imgpath}" id="${str}" width="130px" height="130px"></a>
        <c:if test="${i==21}">
            <%
                i=0;
            %>
        </c:if>
    </c:forEach>
<!--
    <a href="javascript:void(0)" onclick="show()"><img src="img/2.jpg" id="apDiv2" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/3.jpg" id="apDiv3" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/4.jpg" id="apDiv4" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/5.jpg" id="apDiv5" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/6.jpg" id="apDiv6" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/7.jpg" id="apDiv7" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/8.jpg" id="apDiv8" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/9.jpg" id="apDiv9" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/10.jpg" id="apDiv10" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/11.jpg" id="apDiv11" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/12.jpg" id="apDiv12" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/13.jpg" id="apDiv13" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/14.jpg" id="apDiv14" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/15.jpg" id="apDiv15" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/16.jpg" id="apDiv16" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/17.jpg" id="apDiv17" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/18.jpg" id="apDiv18" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/19.jpg" id="apDiv19" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/20.jpg" id="apDiv20" width="130px" height="130px"></a>
    <a href="javascript:void(0)" onclick="show()"><img src="img/21.jpg" id="apDiv21" width="130px" height="130px"></a>
	-->
	</body>

</html>