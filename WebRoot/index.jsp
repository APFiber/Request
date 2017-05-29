<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <script type="text/javascript">
<%--    document.getElementById('inputId').value = '';--%>
<%--    document.getElementById('formId').submit();--%>
    function dsnfns()
    {
    document.getElementById("formId").action='reqres';
    document.getElementById('formId').submit();
    }
    
</script>
  <form id="formId">
    <input type="text" id="inputId" name="deviceId" onclick="dsnfns()">
</form>


    This is my JSP page. <br>
  </body>
</html>
