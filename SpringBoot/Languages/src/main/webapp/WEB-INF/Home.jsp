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
	<table>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${lang}" var="lang">
			<tr>
				<td><a href="/language/show/${lang.id}">${lang.title}</a></td>
				<td>${lang.creator}</td>
				<td>${lang.virsion}</td>
				<td><a href="/language/${lang.id}">Delete</a><a href="/language/edit/${lang.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<h1>New Book</h1>
	<form:form action="/languages" modelAttribute="Language" method="POST">
		<p>
			<form:label path="title">Title</form:label>
			<form:errors path="title" />
			<form:input path="title" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:textarea path="creator" />
		</p>
		<p>
			<form:label path="virsion">Virsion</form:label>
			<form:errors path="virsion" />
			<form:input path="virsion" />
		</p>

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>