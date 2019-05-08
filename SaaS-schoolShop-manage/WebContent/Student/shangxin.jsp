<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>shang xin</title>
</head>
<body>
This is  shang xin
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

<% Object typesObj = session.getAttribute("types");%>
<%if(types == null){ %>
<h1>classes == null;get error.</h1>
<%}else{%>
<%! List<String> types = new ArrayList<String>();%>
<% types = (List<String>)typesObj;%>
<%for(String type : types){ %>
<a href="">
<div class ="types"><%=type %></div>
</a>
<%} %>
<% }%>

</body>
</html>