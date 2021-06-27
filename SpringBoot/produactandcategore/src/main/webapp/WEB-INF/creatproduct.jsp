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
<h1>Creat Product</h1>
<form:form action="/product" method="post" modelAttribute="product">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
			 
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description" />
			<form:input path="description" />
		</p>

		<p>
			<form:label path="price">Price</form:label>
			<form:errors path="price" />
			<form:input  path="price"/>
		</p>


		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>