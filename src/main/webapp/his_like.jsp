<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>兴趣爱好</title>
        <base href="<%=basePath%>">
		<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">

        <link rel="stylesheet" type="text/css" href="jqueryvideo/css/video-js.css">

        <!--如果想要支持IE8-->
        <script src="jqueryvideo/js/videojs-ie8.min.js"></script>

		<script type="text/javascript" src="easyui/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

        <script>
            function show(){
                $('#win').window('open');
            }
            function show1(){
                $('#win1').window('open');
            }

            $(document).ready(function(){
                $('#win').window({
                    onBeforeClose:function(){
                        $('video').trigger('pause');
                    }
                });
            });

            $(document).ready(function(){
                $('#win1').window({
                    onBeforeClose:function(){
                        $('video').trigger('pause');
                    }
                });
            });

        </script>

	</head>
	<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">
		兴趣爱好

        <div id="win" class="easyui-window" title="My Window" closed="true" style="width:690px;height:400px;padding:5px;">
            <video id="my-video" class="video-js" controls preload="auto" width="640px" height="350px"
                   poster="MY_VIDEO_POSTER.jpg" data-setup="{}">
                <source src="video/danche.mp4" type='video/mp4'>
                <!--    <source src="video/fushishanxia.mp4" type='video/mp4'>  -->
                <!-- <source src="MY_VIDEO.webm" type='video/webm'> -->
                <p class="vjs-no-js">
                    To view this video please enable JavaScript,and consider upgrading to a web browser that
                    <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
                </p>
            </video>
        </div>

        <div id="win1" class="easyui-window" title="My Window" closed="true" style="width:690px;height:400px;padding:5px;">
            <video id="my-video1" class="video-js" controls preload="auto" width="640px" height="350px"
                   poster="MY_VIDEO_POSTER.jpg" data-setup="{}">
                <!--<source src="video/danche.mp4" type='video/mp4'> -->
                <source src="video/fushishanxia.mp4" type='video/mp4'>
                <!-- <source src="MY_VIDEO.webm" type='video/webm'> -->
                <p class="vjs-no-js">
                    To view this video please enable JavaScript,and consider upgrading to a web browser that
                    <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
                </p>
            </video>
        </div>
        <div align="left">
            <table>
                <tr>
                    <td><a href="javascript:void(0)" onclick="show()">单车-陈奕迅.mv</a></td>
                </tr>
                <tr>
                    <td><a href="javascript:void(0)" onclick="show1()">富士山下-陈奕迅.mv</a></td>
                </tr>
            </table>
        </div>

    <script src="jqueryvideo/js/video.min.js"></script>
	</body>
</html>