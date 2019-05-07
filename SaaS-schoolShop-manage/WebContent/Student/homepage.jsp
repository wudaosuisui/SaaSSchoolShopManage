<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import = "java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Homepage</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/css.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Student/css/stuCss.css">
</head>
<body>
<div id="homepage">
<jsp:include page="head.jsp" flush="true"/>
<div id = "body">
<div id ="classFind">
<h1>&nbsp;&nbsp;&nbsp;类别检索</h1>
<a href="">
<div class="findFrame">&nbsp;&nbsp;&nbsp;请输入检索内容</div>
<img name="find" class="icon2" src="${pageContext.request.contextPath}/Student/img/find_smal.png">
</a>
<% Object classesObj = session.getAttribute("classes");%>
<%if(classesObj == null){ %>
<h1>classes == null;get error.</h1>
<%}else{%>
<%! List<String> classes = new ArrayList<String>();%>
<% classes = (List<String>)classesObj;%>
<%for(String clas : classes){ %>
<a href="">
<div class ="classes"><%=clas %></div>
</a>
<%} %>
<% }%>
</div>
<div id ="typeFind">
<h1>&nbsp;&nbsp;&nbsp;标签检索</h1>
<a href="">
<div class="findFrame">&nbsp;&nbsp;&nbsp;请输入检索内容</div>
<img name="find" class="icon2" src="${pageContext.request.contextPath}/Student/img/find_smal.png">
</a>
<a href="">
<img alt="type" class="types" src="${pageContext.request.contextPath}/Student/img/type.png">
</a>

</div>
</div>
<jsp:include page="bottom.jsp" flush="true"/>
</div>
</body>
</html>