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
		<title>他的动态</title>
        <base href="<%=basePath%>">
		<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
		<style type="text/css">
    #apDiv1 {
	position: absolute;
	left: 165px;
	top: 40px;
	width: 787px;

	z-index: 1;
}
        #apDiv2 {
	position: absolute;
	left: 131px;
	top: 45px;
	width: 528px;

	z-index: 2;
}
        </style>
		<script type="text/javascript" src="easyui/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
        <link href="kindeditor/themes/default/default.css" rel="stylesheet" />
        <script src="kindeditor/kindeditor-min.js"></script>
        <script src="kindeditor/lang/zh_CN.js"></script>

        <script type="text/javascript">
            var editor;
            KindEditor.ready(function(K) {
                editor = K.create('textarea[name="contents"]', {
                    resizeType: 1,
                    allowPreviewEmoticons: false,
                    allowImageUpload: false,
                    items: [
                        'fontname', 'fontsize', '|', 'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
                        'removeformat', '|', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
                        'insertunorderedlist', '|', 'emoticons', 'image', 'link'
                    ]
                });
            });
        </script>

        <script>
            function sshw(){
                $('#win').window('open');
            }
            function sshq(){

            }

            window.onload=function(){
                $.ajax({
                   url: '/seleAct.do',
                   type: 'post',
                   dataType: 'html',
                   error: function(){ alert('出现未知错误！'); }
                   sucess

                });
            }

        </script>

        <style>
            #absodiv{
                position: absolute;
                top:0px;
                height: 30px;
                width: 100%;
            }
        </style>

	</head>

	<body  background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">
        <div id="absodiv">
            <button onclick="sshw()">添加动态</button>
        </div>
        <div id="content11">

        </div>
        <div id="win" class="easyui-window" title="My Window" closed="true" style="width:690px;height:400px;padding:5px;">
            <textarea name="contents" id="contents" rows="10" style="width:360px;height:160px;visibility:hidden;"></textarea>
            <button onclick="sshq()">发表</button>
        </div>

	</body>
</html>
