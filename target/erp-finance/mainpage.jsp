<%@page import="bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	UserBean user = null;
	String userName = "";

	try
	{
		user = (UserBean) session.getAttribute("user");
		userName = user.getUserName();
	} catch (Exception e)
	{}
	if (userName.isEmpty())
	{
		response.sendRedirect("index.jsp");
	}
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello!<%=userName%><br>
	<a href = "zongzhanggl.jsp"><button value="">总账管理</button></a>
	<a href = "gudingzichan.jsp"><button value="">固定资产</button></a>
	<a href = "baobiao.jsp"><button value="">报表</button></a>
	<a href = "yingshoukuan.jsp"><button value="">应收款管理</button></a>
	<a href = "yingfukuan.jsp"><button value="">应付款管理</button></a>
</body>
</html>