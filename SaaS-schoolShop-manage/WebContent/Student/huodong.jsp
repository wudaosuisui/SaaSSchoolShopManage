<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "com.saasschoolshopmanage.stor.entity.Activity" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>huo dong</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/css.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Student/css/stuCss.css">
</head>
<body>
<% Object activityListObj = session.getAttribute("activitysList");%>
<%if(activityListObj == null){ %>
<h1>activityListObj == null;get error.</h1>
<%}else{%>
<%! List<Activity> activityList = new ArrayList<Activity>();%>
<% activityList = (List<Activity>)activityListObj;%>


<!-- 上新商品展示 -->
<%for(Activity activity : activityList){ %>
<a href="">
<div class ="goods">
<img class ="goods-img" alt="活动图片" src="${pageContext.request.contextPath}/Student/img/<%=activity.getImg() %>">
<div class="good-name"><%=activity.getActivName() %></div>
<br>
<div class="good-shop"></div>
<div class="good-price"></div>
<br>
<img class ="huodong-star-img" alt="搜藏图片" src="${pageContext.request.contextPath}/Student/img/huodong_star.png">
</div>
</a>
<%} %>



<% }%>

</body>
</html>