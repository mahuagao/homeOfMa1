<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>留言板</title>
        <base href="<%=basePath%>">
		<link href="css/style.css" rel="stylesheet" />

		<script type="text/javascript" src="Scripts/jquery-1.4.1.min.js"></script>
		<script type="text/javascript" src="Scripts/messagelist.js"></script>
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
	</head>

	<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">
		<div class="mainbody">
			<div class="FeedTitle">请给我留言吧</div>
			<div style="clear:both;">
				<div class="tr">
					<div class="lefttitle">留言标题：</div>
					<div class="righttitile"><input id="title" type="text" value="Best wishes!" readonly /></div>
				</div>
				<div class="tr">
					<div class="left_content">留言内容：</div>
					<div class="right_content">
						<textarea name="contents" id="contents" rows="10" style="width:360px;height:160px;visibility:hidden;"></textarea></div>
				</div>
				<div class="tr">
					<div class="lefttitle">留言人：</div>
					<div class="righttitile"><input id="muser" type="text" /></div>
				</div>
				<div class="tr" style="text-align:center;"><input type="button" class="btnSubmit" onclick="add();" value="发表留言" /></div>
			</div>
			<div class="listtitle">留言列表</div>
			<div id="content"></div>
			<div class="navigation">
				<div class="pageleft">
					共<label id="lblToatl">0</label>条数据 第[<label id="lblCurent">0</label>]页/共[<label id="lblPageCount">0</label>]页
				</div>
				<div class="pageright">
					<a id="first" href="#">首页</a>
					<a id="previous" href="#">上一页</a>
					<a id="next" href="#"> 下一页</a>
					<a id="last" href="#">末页</a>
				</div>
			</div>
		</div>
	</body>

</html>