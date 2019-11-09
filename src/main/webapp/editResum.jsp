<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/15/015
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>修改简历</title>
    <base href="<%=basePath%>">
</head>
<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">
<p>修改个人简历 </p>
<div class="resu" id="resu">
    <p>&nbsp;</p>
    <form id="resume" action="/updaResum.do" method="post">
        <table width="77%" border="1" align="center">
            <tr>
                <td width="9%" height="53">姓名</td>
                <td width="18%" align="center">
                 <input name="iname" type="text" readonly value="${dto1.iname}"/>
                </td>
                <td width="9%">性别</td>
                <td width="18%" align="center">
                    <input name="isex" type="text" readonly value="${dto1.isex}"/>
                </td>
                <td width="9%">学历</td>
                <td width="19%" align="center">
                    <input type="text" name="educate" value="${dto1.educate}" />
                </td>
                <td width="18%" rowspan="4" align="center"><img src="img/mhg.jpg" width="169" height="233"></td>
            </tr>
            <tr>
                <td height="48">民族</td>
                <td align="center">
                    <input type="text" name="nation" value="${dto1.nation}"/>
                </td>
                <td>健康状况</td>
                <td align="center">
                    <input type="text" name="health" value="${dto1.health}" />
                </td>
                <td>培养类别</td>
                <td>
                    <input type="text" name="majortype" value="${dto1.majortype}" />
                </td>
            </tr>
            <tr>
                <td height="52">户口</td>
                <td align="center">
                    <input type="text" name="province" value="${dto1.province}"/>
                </td>
                <td>婚姻状况</td>
                <td align="center">
                    <input type="text" name="marry" value="${dto1.marry}"/>
                </td>
                <td>毕业时间</td>
                <td>
                    <input type="text" name="gradutedate" value="${dto1.gradutedate}"/>
                </td>
            </tr>
            <tr>
                <td height="61">籍贯</td>
                <td>
                    <input type="text" name="address" value="${dto1.address}"/>
                </td>
                <td>专业名称</td>
                <td align="center">
                    <input type="text" name="major" value="${dto1.major}"/>
                </td>
                <td>出生年月</td>
                <td>
                    <input type="text" name="birthday" value="${dto1.birthday}"/>
                </td>
            </tr>
            <tr>
                <td height="57">院系</td>
                <td>
                    <input type="text" name="faculty" value="${dto1.faculty}"/>
                </td>
                <td>毕业院校</td>
                <td>
                    <input type="text" name="school" value="${dto1.school}"/>
                </td>
                <td>计算机水平</td>
                <td colspan="2" align="center">
                    <input text="text" name="cplevel" value="${dto1.cplevel}"/>
                </td>
            </tr>
            <tr>
                <td>求职主页</td>
                <td >
                    <input type="text" name="mypage" value="${dto1.mypage}"/>
                </td>
                <td>手机</td>
                <td colspan="2">
                    <input type="text" name="phone" value="${dto1.phone}"/>
                </td>
            </tr>
            <tr>
                <td>QQ</td>
                <td>
                    <input type="text" name="qqnum" value="${dto1.qqnum}"/>
                </td>
                <td>微信</td>
                <td>
                    <input type="text" name="weixin" value="${dto1.weixin}"/>
                </td>
                <td>Email</td>
                <td colspan="2">
                    <input type="text" name="email" value="${dto1.email}"/>
                </td>
            </tr>
            <tr>
                <td>求职意向</td>
                <td colspan="6" align="center">
                    <input type="text" name="findjob" value="${dto1.findjob}"/>
                </td>
            </tr>
            <tr>
                <td>技术特点</td>
                <td colspan="6">
                    <textarea name="technology">${dto1.technology}</textarea>
                </td>
            </tr>
            <tr>
                <td>使用工具</td>
                <td colspan="6">
                    <input type="text" name="devtool" value="${dto1.devtool}"/>
                </td>
            </tr>
            <tr>
                <td>教育背景</td>
                <td colspan="6">
                    <input type="text" name="eduback" value="${dto1.eduback}"/>
                </td>
            </tr>
            <tr>
                <td>英语能力</td>
                <td colspan="6">
                    <input type="text" name="english" value="${dto1.english}"/>
                </td>
            </tr>
            <tr>
                <td>项目经验</td>
                <td colspan="6" align="left" valign="top">
                    <textarea name="project">${dto1.project}</textarea>
                </td>
            </tr>
            <tr>
                <td>主修课程</td>
                <td colspan="6">
                    <textarea name="object">${dto1.object}</textarea>
                </td>
            </tr>
            <tr>
                <td>自我鉴定</td>
                <td colspan="6">
                    <textarea name="evaluation">${dto1.evaluation}</textarea>
                </td>
            </tr>
            <tr>
                <td colspan="7">
                    <input type="submit" value="提交"/>
                </td>
            </tr>
        </table>
    </form>
    <p>&nbsp;</p>
</div>
<p>&nbsp;</p>
</body>
</html>
