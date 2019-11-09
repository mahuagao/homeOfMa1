<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/15/015
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>添加简历</title>
    <base href="<%=basePath%>">
</head>
<body background="img/center.jpg" style="background-attachment: fixed;background-size: 100%,100%">
<p>添加个人简历 </p>
<div class="resu" id="resu">
    <p>&nbsp;</p>
    <form id="resume" action="/addResum.do" method="post">
        <table width="77%" border="1" align="center">
            <tr>
                <td width="9%" height="53">姓名</td>
                <td width="18%" align="center">
                    <input name="iname" type="text" />
                </td>
                <td width="9%">性别</td>
                <td width="18%" align="center">
                    <input name="isex" type="text" />
                </td>
                <td width="9%">学历</td>
                <td width="19%" align="center">
                    <input type="text" name="educate" />
                </td>
                <td width="18%" rowspan="4" align="center"><img src="img/mhg.jpg" width="169" height="233"></td>
            </tr>
            <tr>
                <td height="48">民族</td>
                <td align="center">
                    <input type="text" name="nation" />
                </td>
                <td>健康状况</td>
                <td align="center">
                    <input type="text" name="health" />
                </td>
                <td>培养类别</td>
                <td>
                    <input type="text" name="majortype" />
                </td>
            </tr>
            <tr>
                <td height="52">户口</td>
                <td align="center">
                    <input type="text" name="province" />
                </td>
                <td>婚姻状况</td>
                <td align="center">
                    <input type="text" name="marry" />
                </td>
                <td>毕业时间</td>
                <td>
                    <input type="text" name="gradutedate" />
                </td>
            </tr>
            <tr>
                <td height="61">籍贯</td>
                <td>
                    <input type="text" name="address" />
                </td>
                <td>专业名称</td>
                <td align="center">
                    <input type="text" name="major" />
                </td>
                <td>出生年月</td>
                <td>
                    <input type="text" name="birthday" />
                </td>
            </tr>
            <tr>
                <td height="57">院系</td>
                <td>
                    <input type="text" name="faculty" />
                </td>
                <td>毕业院校</td>
                <td>
                    <input type="text" name="school" />
                </td>
                <td>计算机水平</td>
                <td colspan="2" align="center">
                    <input text="text" name="cplevel" />
                </td>
            </tr>
            <tr>
                <td>求职主页</td>
                <td >
                    <input type="text" name="mypage" />
                </td>
                <td>手机</td>
                <td colspan="2">
                    <input type="text" name="phone" />
                </td>
            </tr>
            <tr>
                <td>QQ</td>
                <td>
                    <input type="text" name="qqnum" />
                </td>
                <td>微信</td>
                <td>
                    <input type="text" name="weixin" />
                </td>
                <td>Email</td>
                <td colspan="2">
                    <input type="text" name="email" />
                </td>
            </tr>
            <tr>
                <td>求职意向</td>
                <td colspan="6" align="center">
                    <input type="text" name="findjob" />
                </td>
            </tr>
            <tr>
                <td>技术特点</td>
                <td colspan="6">
                    <textarea name="technology"></textarea>
                </td>
            </tr>
            <tr>
                <td>使用工具</td>
                <td colspan="6">
                    <input type="text" name="devtool" />
                </td>
            </tr>
            <tr>
                <td>教育背景</td>
                <td colspan="6">
                    <input type="text" name="eduback" />
                </td>
            </tr>
            <tr>
                <td>英语能力</td>
                <td colspan="6">
                    <input type="text" name="english" />
                </td>
            </tr>
            <tr>
                <td>项目经验</td>
                <td colspan="6" align="left" valign="top">
                    <textarea name="project"></textarea>
                </td>
            </tr>
            <tr>
                <td>主修课程</td>
                <td colspan="6">
                    <textarea name="object"></textarea>
                </td>
            </tr>
            <tr>
                <td>自我鉴定</td>
                <td colspan="6">
                    <textarea name="evaluation"></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="7">
                    <input type="submit" value="保存"/>
                </td>
            </tr>
        </table>
    </form>
    <p>&nbsp;</p>
</div>
<p>&nbsp;</p>
</body>
</html>
