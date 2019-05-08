<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "com.saasschoolshopmanage.stor.entity.Goods" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>shang xin</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/css.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Student/css/stuCss.css">
</head>
<body>
<% Object goodsListObj = session.getAttribute("goodsList");%>
<%if(goodsListObj == null){ %>
<h1>goodsListObj == null;get error.</h1>
<%}else{%>
<%! List<Goods> goodsList = new ArrayList<Goods>();%>
<% goodsList = (List<Goods>)goodsListObj;%>


<!-- 上新商品展示 -->
<%for(Goods goods : goodsList){ %>
<a href="">
<div class ="goods">
<img class ="goods-img" alt="商品图片" src="${pageContext.request.contextPath}/Student/img/<%=goods.getImg() %>">
<div class="good-name"><%=goods.getGoodsName() %></div>
<br>
<div class="good-shop"><%=goods.getShopName() %></div>
<div class="good-price"><%=goods.getPrice() %>￥</div>
<br>
<img class ="star-img" alt="搜藏图片" src="${pageContext.request.contextPath}/Student/img/star.png">
</div>
</a>
<%} %>



<% }%>


</body>
</html>