<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hot page</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/css.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Student/css/stuCss.css">
</head>

<body>
<div id="hotpage">
<div id = "hot-body">
<div id = "top">
<% String oneOf = (String)session.getAttribute("oneOf");%>
<%if(oneOf=="shangxin"){ %>
<div class="top-oneOf shangxin" id="getTheOne">
<%}else{ %>
<div class="top-oneOf shangxin" >
<%} %>
上新
</div>
<%if(oneOf=="huodong"){ %>
<div class="top-oneOf" id="getTheOne">
<%}else{ %>
<div class="top-oneOf" >
<%} %>
活动
</div>
</div>
<div id = "iframe-frame">
<iframe id = "iframe" src="${pageContext.request.contextPath}/Students/hotpage/shangxin" scrolling="yes" />
</div>
</div>
<jsp:include page="bottom.jsp" flush="true"/>
</div>
</body>
</html>