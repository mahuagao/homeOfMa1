<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>电子简历</title>
        <base href="<%=basePath%>">
		<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">

		<script type="text/javascript" src="easyui/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	</head>
	<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">
		<p>这是他的个人简历 </p>
		<div class="resu" id="resu">
		  <p>&nbsp;</p>
		  <table width="77%" border="1" align="center">
		    <tr>
		      <td width="9%" height="53">姓名</td>
		      <td width="18%" align="center">
		        马华高</td>
		      <td width="9%">性别</td>
		      <td width="18%" align="center">男</td>
		      <td width="9%">学历</td>
		      <td width="19%" align="center">本科</td>
		      <td width="18%" rowspan="4" align="center"><img src="img/mhg.jpg" width="169" height="233"></td>
	        </tr>
		    <tr>
		      <td height="48">民族</td>
		      <td align="center">汉族</td>
		      <td>健康状况</td>
		      <td align="center">良好</td>
		      <td>培养类别</td>
		      <td>计算机、网络、安全</td>
	        </tr>
		    <tr>
		      <td height="52">户口</td>
		      <td align="center">广西壮族自治区</td>
		      <td>婚姻状况</td>
		      <td align="center">未婚</td>
		      <td>毕业时间</td>
		      <td>2018-07-01</td>
	        </tr>
		    <tr>
		      <td height="61">籍贯</td>
		      <td>广西壮族自治区南宁市西乡塘区金光农场</td>
		      <td>专业名称</td>
		      <td align="center">信息安全</td>
		      <td>出生年月</td>
		      <td>1995-01-01</td>
	        </tr>
		    <tr>
		      <td height="57">院系</td>
		      <td>控制与计算机工程学院</td>
		      <td>毕业院校</td>
		      <td>华北电力大学（双一流、211）</td>
		      <td>计算机水平</td>
		      <td colspan="2" align="center">精通</td>
	        </tr>
		    <tr>
		      <td>求职主页</td>
		      <td colspan="3">http://47.94.168.85/mypage</td>
		      <td>手机</td>
		      <td colspan="2">18810523780</td>
	        </tr>
		    <tr>
		      <td>QQ</td>
		      <td>460402052</td>
		      <td>微信</td>
		      <td>mhg0101</td>
		      <td>Email</td>
		      <td colspan="2">mahuagao@163.com</td>
	        </tr>
		    <tr>
		      <td>求职意向</td>
		      <td colspan="6" align="center">JAVA开发工程师</td>
	        </tr>
		    <tr>
		      <td>技术特点</td>
		      <td colspan="6"><p>1，IO流、List/Set/map集合、反射、多线程</p>
	          <p>2，jsp+servlet+mysql、MVC框架</p>
	          <p>3，框架spring、springmvc、mybatis、hibernate、springdata、hibernate-jpa</p>
	          <p>4，主要使用ssm、ssh、ssshj进行开发</p>
	          <p>5，dbcp、c3p0、druid连接池</p>
	          <p>6，其他：redis、zookeeper、activiti</p></td>
	        </tr>
		    <tr>
		      <td>使用工具</td>
		      <td colspan="6">idea、myeclipse、eclipse、xshell、postman、hbuilder、dreamweaver</td>
	        </tr>
		    <tr>
		      <td>教育背景</td>
		      <td colspan="6">2014-09-01至2018-07-01 华北电力大学——控制与计算机工程学院</td>
	        </tr>
		    <tr>
		      <td>英语能力</td>
		      <td colspan="6">英语4级 500分</td>
	        </tr>
		    <tr>
		      <td>项目经验</td>
		      <td colspan="6" align="left" valign="top"><p>1.图书商城，使用jsp+servlet+mysql， 后台增删改查，前台浏览商品，分页，购买商品，订单查询</p>
	          <p>2.云主机后台，使用ssm框架，后台增删改查，云主机、云硬盘、负载均衡、云数据库、云内存、云防护、云工单</p>
	          <p>3.公司员工管理系统，使用ssm框架，部门、职位、员工增删改查，导出信息为excel表格</p>
	          <p>4.图书馆图书管理，图书类型增删改查，图书信息增删改查，登录验证、修改密码</p></td>
	        </tr>
		    <tr>
		      <td>主修课程</td>
		      <td colspan="6"><p >数据结构与算法、数据库原理、Java语言程序设计、web技术及应用、计算机网络、操作系统、C语言程序设计、VC++程序设计、计算机组成与结构、计算机密码学、信息安全基础、信息论与编码学、操作系统安全技术、计算机网络及安全、接口与通信技术、网络安全、信息对抗技术</p></td>
	        </tr>
		    <tr>
		      <td>自我鉴定</td>
		      <td colspan="6"><p >本人热爱软件和数据行业，对IT领域的软件与数据类开发和设计工作有浓厚的兴趣，自学能力强，喜欢钻研新技术，有比较强的动手能力，勇于面对困难和挑战，有很好的分析问题与解决问题的能力，工作认真负责，积极上进，能够吃苦耐劳，有着浓烈的学习兴趣和与之适应的学习能力。</p></td>
	       </tr>
	      </table>

		  <p>&nbsp;</p>
		</div>
		<p>&nbsp;</p>
	</body>
</html>
