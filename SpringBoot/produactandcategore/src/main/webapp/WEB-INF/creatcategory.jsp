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
<h1>Creat Category</h1>
<form:form action="/category" method="post" modelAttribute="category">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
			 
		</p>
	

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>