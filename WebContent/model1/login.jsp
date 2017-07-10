<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 接受值 -->
	<!-- class定义全限定名 id起别名 -->
	<jsp:useBean id="u" class="domain.User"></jsp:useBean>
	<jsp:setProperty property="username" name="u" />
	<!-- 打印值 -->
	<jsp:getProperty property="username" name="u"/>
</body>
</html>