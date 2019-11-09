<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>文档管理</title>
        <base href="<%=basePath%>">
		<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
		<style type="text/css">#div2 {
	position: absolute;
	left: 6px;
	top: 194px;
	width: 100%;
	height: 177px;
	z-index: 1;
}

#div1 {
	position: absolute;
	left: 6px;
	top: 9px;
	width: 100%;
	height: 99px;
	z-index: 2;
}

#apDiv1 {
	position: absolute;
	left: 6px;
	top: 4px;
	width: 100%;
	height: 175px;
	z-index: 2;
}</style>
		<script type="text/javascript" src="easyui/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

        <script>function openwin() {
	$('#win').window('open');
}</script>
		<script>function openwin1() {
	$('#win1').window('open');
}</script>
	</head>
	<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">
		<div id="win" class="easyui-window" title="My Window" closed="true" style="width:500px;height:400px;padding:5px;">
                <form action="save.do" method="post" enctype="multipart/form-data">
                                   选择文件:<input type="file" name="frfile"><br>
                 <input type="submit" value="上传文件">
                </form>
        </div>
        <div id="win1" class="easyui-window" title="My Window" closed="true" style="width:500px;height:400px;padding:5px;">
                <form action="saves.do" method="post" enctype="multipart/form-data">
                                  选择文件:<input type="file" name="frfiles"><br>
                                  选择文件:<input type="file" name="frfiles"><br>
                                  选择文件:<input type="file" name="frfiles"><br>
                                  选择文件:<input type="file" name="frfiles"><br>
                <input type="submit" value="上传文件">
                              
                </form>
        </div>
    <div id="apDiv1">
    	<table width="100%">
    		<tr>
    			<td width="50%"><h2><strong>文档管理</strong></h2></td>
    		<td width="25%"><button onclick="openwin()"/>单文件上传</td>
    		<td width="25%"><button onclick="openwin1()">多文件上传</td>
    		</tr>
    	</table>
      <table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
          <tr>
		        <td class="ta_01" align="center" bgColor="#afd1f3"><strong>查询条件</strong></td>
	        </tr>
	        
	        	<tr>
					<td>
					
			  <form id="Form1" name="Form1"
		                action="${pageContext.request.contextPath}/servlet/searchProductServlet"
		                method="post">
					
						<table cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">
									文件编号</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text"
									name="id" size="15" value="" id="Form1userName" class="bg" />
								</td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">
									类别：</td>
								<td class="ta_01" bgColor="#ffffff"><select name="category"
									id="category">
										<option value="" selected="selected">--选择文件类型--</option>
										<option value="txt">txt</option>
										<option value="word">word</option>
										<option value="excel">excel</option>
										<option value="ppt">ppt</option>
										<option value="java">java</option>
										<option value="md">md</option>
										<option value="mp3">mp3</option>
									
								</select></td>
							</tr>

							<tr>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">
									文件名称：</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text"
									name="name" size="15" value="" id="Form1_userName" class="bg" />
								</td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">
									文件大小：</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text"
									name="minprice" size="10" value="" />- <input type="text"
									name="maxprice" size="10" value="" /></td>
							</tr>

<tr>
							<td height="22" align="center" bgColor="#f5fafe" class="ta_01">
									浏览次数：</td>
								<td class="ta_01" bgColor="#ffffff"><input type="text"
									name="minprice" size="10" value="" />- <input type="text"
									name="maxprice" size="10" value="" /></td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">
									下载次数：</td>
								<td class="ta_01" bgColor="#ffffff">
									
								</td>
							</tr>

							<tr>
								<td width="100" height="22" align="center" bgColor="#f5fafe"
									class="ta_01">
								    
								</td>
								<td class="ta_01" bgColor="#ffffff"><font face="宋体"
									color="red">&nbsp; </font>
									
								</td>
								<td align="right" bgColor="#ffffff" class="ta_01"><br>
									<br>
								
								</td>
								<td align="right" bgColor="#ffffff" class="ta_01">
									
									<button type="submit" id="search" name="search"
										value="&#26597;&#35810;" class="button_view">
										&#26597;&#35810;</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
									type="reset" name="reset" value="&#37325;&#32622;"
									class="button_view" />
								</td>
							</tr>
						</table>
					</form>	
						
					</td>
				</tr>
				
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>文件列表</strong>
					</td>
				</tr>
				
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
					
					<form action="#" method="post">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="0" id="DataGrid1">
                            <!--style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word"-->
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
								<td align="center" width="5%"><input type="checkbox" id="ckAll" onclick="checkAll()"/>全选/全不选</td>
								<td align="center" width="5%">文件编号</td>
								<td align="center" width="60%">文件名称</td>
								<td align="center" width="5%">文件大小</td>
								<td width="5%" align="center">浏览</td>
								<td width="5%" align="center">编辑</td>
							</tr>
							
							
							<c:forEach items="${dtos}" var="d">
								  <tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px;background-color:#336699;filter:Alpha(opacity=50)" align="center"
										width="9%"><input type="checkbox" name="ids" value="${d.did}"/></td>
									<td style="CURSOR: hand; HEIGHT: 22px;background-color:#336699;filter:Alpha(opacity=50)" align="center"
										width="9%">${d.did}</td>
									<td style="CURSOR: hand; HEIGHT: 22px;background-color:#336699;filter:Alpha(opacity=50)" align="left"
										width="9%">${d.docname}</td>
									<td style="CURSOR: hand; HEIGHT: 22px;background-color:#336699;filter:Alpha(opacity=50)" align="center"
										width="9%">${d.docsize}</td>

									<td align="center" style="HEIGHT: 22px;background-color:#336699;filter:Alpha(opacity=50)" width="9%"><a
										href="/scan.do?id=${d.did}">
											<img
											src="admin/images/i_edit.gif"
											border="0" style="CURSOR: hand"> </a>
									</td>

									<td align="center" style="HEIGHT: 22px;background-color:#336699;filter:Alpha(opacity=50)" width="10%"><a
										href="/edit.do?id=${d.did}">
											<img
											src="admin/images/i_edit.gif"
											width="16" height="16" border="0" style="CURSOR: hand">
									</a>
									</td>
								</tr>
								
						</c:forEach>
						
						</table>
				 </form>
					</td>
				</tr>
				
	        
	</table>
    </div>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
	
		
	<div id="div2"></div>
	
	</body>
</html>