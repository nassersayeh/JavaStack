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
<h1>All License</h1>
<table>
    <thead>
        <tr>
            <th>Number</th>
            <th>Expiration</th>
            <th>State</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${licens}" var="song">
        <tr>
            <td><c:out value="${song.number}"/></td>
            <td><c:out value="${song.expirationDate}"/></td>
            <td><c:out value="${song.state}"/></td>
            <td><a href="/delete/${song.id}">Delete</a></td>
            
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>