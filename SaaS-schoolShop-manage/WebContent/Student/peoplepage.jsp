<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>people page</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/css.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Student/css/stuCss.css">
</head>
<body>
<a href="${pageContext.request.contextPath}/Students/gethomepage">
<div id="peoplepage">
<div id = "peoplepage-body">

<div id="massage">
<img id="touxiang" alt="touxiang" src="${pageContext.request.contextPath}/Student/img/touxiang.jpg">


<a href="">
<img id="massage_img" alt="massage" src="${pageContext.request.contextPath}/Student/img/massage.png">

</a>



</div>
<div id="news">
	<% String oneOf = (String)session.getAttribute("oneOf");%>
	
	<a href="${pageContext.request.contextPath}/Students/peoplepage/shangxin">
	<%if(oneOf=="shangxin"){ %>
	<div class="top-oneOf shangxin" id="getTheOne">
	<%}else{ %>
	<div class="top-oneOf shangxin" >
	<%} %>
	上新
	
	</div>
	</a>
	
	<a href="${pageContext.request.contextPath}/Students/peoplepage/huodong">
	<%if(oneOf=="huodong"){ %>
	<div class="top-oneOf" id="getTheOne">
	<%}else{ %>
	<div class="top-oneOf" >
	<%} %>
	活动
	</div>
	</a>
	
	
	
</div>
	<div id = "peo-iframe-frame">
	<%if(oneOf=="shangxin"){ %>
	<iframe id = "iframe" src="${pageContext.request.contextPath}/Student/shangxin.jsp" scrolling="yes" />
	<%}else{ %>
	<iframe id = "iframe" src="${pageContext.request.contextPath}/Student/huodong.jsp" scrolling="yes" />
	<%} %>
	</div>

</div>
<jsp:include page="bottom.jsp" flush="true"/>
</div>
</a>
</body>
</html>