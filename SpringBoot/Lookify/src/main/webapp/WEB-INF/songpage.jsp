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
<p>Title: </p> <p>${songs.title}</p>
<p>Artist: </p> <p>${songs.artist}</p>
<p>Rationg(1-10): </p> <p>${songs.rating}</p>
<a href="/delete/${songs.id}">Delete</a>
</body>
</html>