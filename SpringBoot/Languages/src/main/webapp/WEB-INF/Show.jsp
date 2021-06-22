<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${language.title}</h2>
	<h2>${language.creator}</h2>
	<h2>${language.virsion}</h2>
<a href="/language/${language.id}">Delete</a><br>
<a href="/language/edit/${language.id}">Edit</a>
<a href="/language">Dashboard</a>

</body>
</html>