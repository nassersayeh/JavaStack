<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${category.name}</h1>
	<c:forEach items="${category.products }" var="cat">
		<li>${cat.name }</li>
	</c:forEach>
	<h3>Add Category</h3>
	<form method="POST" action="/addproduct/${category.id}">
		<select name="productlist">
		<c:forEach items="${unlisted}" var="cate">
		<option value="${cate.id }">${cate.name }</option>
		</c:forEach>
		</select>
		<input type="submit" value="Add">
	</form>
</body>
</html>