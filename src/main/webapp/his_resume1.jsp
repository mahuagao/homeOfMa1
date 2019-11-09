<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	    <script>
            function editResum(ina){
                window.location.href = "/editResum.do?iname="+ina;
            }
            function addResum(){
                window.location.href = "/addResum.jsp";
            }
            function deleResum(ine){
                var msg = "是否确认删除简历("+ine+")？";
                if (confirm(msg)==true){
                    window.location.href = "/deleResum.do?iname="+ine;
                }
            }
            function func() {
                var vs = $('select option:selected').val();
                window.location.href = "/findById1.do?iname="+vs;
            }
        </script>
    </head>
	<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">
		<p>马华高一年java开发工程师 &nbsp;&nbsp;<button onclick="editResum('${dto.iname}')">修改简历</button>
        &nbsp;&nbsp;<button onclick="addResum()">增加简历</button>
        &nbsp;&nbsp;<button onclick="deleResum('${dto.iname}')">删除简历</button>
        &nbsp;&nbsp;简历：&nbsp;&nbsp;
            <select name="resumeType" id="resumeType" onchange="func()">
                <option value="">请选择</option>
                <c:forEach items="${inames}" var="n">
                <option value="${n}">${n}</option>
                </c:forEach>
            </select>
        &nbsp;&nbsp;<button onclick="">导出为pdf</button>
        &nbsp;&nbsp;<button onclick="">导出为excel</button>
        </p>

		<div class="resu" id="resu">
		  <p>&nbsp;</p>
		  <table width="77%" border="1" align="center">
		    <tr>
		      <td width="9%" height="53">姓名</td>
		      <td width="18%" align="center">
		        ${dto.iname}</td>
		      <td width="9%">性别</td>
		      <td width="18%" align="center">${dto.isex}</td>
		      <td width="9%">学历</td>
		      <td width="19%" align="center">${dto.educate}</td>
		      <td width="18%" rowspan="4" align="center"><img src="${dto.imgpath}" width="169" height="233"></td>
	        </tr>
		    <tr>
		      <td height="48">民族</td>
		      <td align="center">${dto.nation}</td>
		      <td>健康状况</td>
		      <td align="center">${dto.health}</td>
		      <td>培养类别</td>
		      <td>${dto.majortype}</td>
	        </tr>
		    <tr>
		      <td height="52">户口</td>
		      <td align="center">${dto.address}</td>
		      <td>婚姻状况</td>
		      <td align="center">${dto.marry}</td>
		      <td>毕业时间</td>
		      <td>${dto.gradutedate}</td>
	        </tr>
		    <tr>
		      <td height="61">籍贯</td>
		      <td>${dto.address}</td>
		      <td>专业名称</td>
		      <td align="center">${dto.major}</td>
		      <td>出生年月</td>
		      <td>${dto.birthday}</td>
	        </tr>
		    <tr>
		      <td height="57">院系</td>
		      <td>${dto.faculty}</td>
		      <td>毕业院校</td>
		      <td>${dto.school}</td>
		      <td>计算机水平</td>
		      <td colspan="2" align="center">${dto.cplevel}</td>
	        </tr>
		    <tr>
		      <td>求职主页</td>
		      <td colspan="3">${dto.mypage}</td>
		      <td>手机</td>
		      <td colspan="2">${dto.phone}</td>
	        </tr>
		    <tr>
		      <td>QQ</td>
		      <td>${dto.qqnum}</td>
		      <td>微信</td>
		      <td>${dto.weixin}</td>
		      <td>Email</td>
		      <td colspan="2">${dto.email}</td>
	        </tr>
		    <tr>
		      <td>求职意向</td>
		      <td colspan="6" align="center">${dto.findjob}</td>
	        </tr>
		    <tr>
		      <td>技术特点</td>
		      <td colspan="6">
                  ${dto.technology}
              </td>
	        </tr>
		    <tr>
		      <td>使用工具</td>
		      <td colspan="6">${dto.devtool}</td>
	        </tr>
		    <tr>
		      <td>教育背景</td>
		      <td colspan="6">
                  ${dto.eduback}
              </td>
	        </tr>
		    <tr>
		      <td>英语能力</td>
		      <td colspan="6">${dto.english}</td>
	        </tr>
		    <tr>
		      <td>项目经验</td>
		      <td colspan="6" align="left" valign="top">
                  ${dto.project}
              </td>
	        </tr>
		    <tr>
		      <td>主修课程</td>
		      <td colspan="6"><p>${dto.object}</p></td>
	        </tr>
		    <tr>
		      <td>自我鉴定</td>
		      <td colspan="6"><p>${dto.evaluation}</p></td>
	       </tr>
	      </table>
		  <p>&nbsp;</p>
		</div>
		<p>&nbsp;</p>
	</body>
</html>
