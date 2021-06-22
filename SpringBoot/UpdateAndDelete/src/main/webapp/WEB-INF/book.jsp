<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${book.title}</h1>
	<p>Description :</p> <p>${book.description }</p>
	<p>Language :</p> <p>${book.language }</p>
	<p>Number of pages :</p> <p>${book.numberOfPages }</p>
</body>
</html>