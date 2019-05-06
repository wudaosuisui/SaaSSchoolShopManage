<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/css.css">
</head>
<body>
<jsp:include page="includeHead.jsp" flush="true"/>
<div id="first">first div</div>
<%
for(int i = 1;i<4;i++){ %>
   <font class="font"  size="5">
    中文测试
   </font><br />
<%} %>


</body>
</html>