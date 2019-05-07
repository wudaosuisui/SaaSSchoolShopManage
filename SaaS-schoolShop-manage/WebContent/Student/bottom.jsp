<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student bottom</title>
</head>
<body>
<div id="bottom">
<% String at = (String)session.getAttribute("at");%>

<!-- 到主页（检索页） -->
<a href="${pageContext.request.contextPath}/Students/gethomepage">
<%if(at == "home"){ %>
<img name="home" class="icon1" src="${pageContext.request.contextPath}/Student/img/find_on.png">
<%}else{ %>
<img name="home" class="icon1" src="${pageContext.request.contextPath}/Student/img/find.png">
<%} %>
</a>

<!-- 热门页 -->
<a href="${pageContext.request.contextPath}/Students/gethotpage">
<%if(at == "hot"){ %>
<img name="hot" class="icon1" src="${pageContext.request.contextPath}/Student/img/hot_on.png">
<%}else{ %>
<img name="hot" class="icon1" src="${pageContext.request.contextPath}/Student/img/hot.png">
<%} %>
</a>

<!-- 个人主页 -->
<a href="${pageContext.request.contextPath}/Students/getpeoplepage">
<%if(at == "people"){ %>
<img name="people" class="icon1" src="${pageContext.request.contextPath}/Student/img/peo_on.png">
<%}else{ %>
<img name="people" class="icon1" src="${pageContext.request.contextPath}/Student/img/peo.png">
<%} %>
</a>

</div>
</body>
</html>