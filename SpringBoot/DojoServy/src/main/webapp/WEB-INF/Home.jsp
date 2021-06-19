<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1><a href="#">Submitted Info</a></h1>
<h3>Name:</h3>
<c:out value="${name}"/>
<h3>Dojo Location:</h3>
<c:out value="${location}"/>
<h3>Favorite Language:</h3>
<c:out value="${lang}"/>
<h3>Comment:</h3>
<c:out value="${comment}"/>

</body>
</html>