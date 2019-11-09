<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>



    <frameset rows="20%, * ">
        <frame id="top" name="top" src="top.jsp" />
        <frameset cols="15%,*">
            <frame id="left" name="left" src="left.jsp" />
            <frame id="right" name="right" src="introduce.jsp" />
        </frameset>
    </frameset>
</html>