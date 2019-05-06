<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Homepage</title>
<link rel="stylesheet" type="text/css" href="../css/css.css">
</head>
<body>
<div id="homepage">
<jsp:include page="head.jsp" flush="true"/>
<div id = "body">
<div id ="classFind">
<h1>this is classFind</h1>
<div class="findFrame">&nbsp;&nbsp;&nbsp;请输入检索内容</div><a href=""><img name="find" class="icon2" src="img/find_smal.png"></a>

</div>
<div id ="typeFind">
<h1>this is typeFind</h1>
<div class="findFrame">&nbsp;&nbsp;&nbsp;请输入检索内容</div><a href=""><img name="find" class="icon2" src="img/find_smal.png"></a>

</div>

</div>
<jsp:include page="bottom.jsp" flush="true"/>
</div>
</body>
</html>