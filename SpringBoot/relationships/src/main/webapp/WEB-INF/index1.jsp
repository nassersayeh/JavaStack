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
<h1>All Persons</h1>
<table>
    <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${persons}" var="song">
        <tr>
            <td><a href="/persons/${song.id}"><c:out value="${song.firstName}"/></a></td>
            <td><c:out value="${song.lastName}"/></td>
            <td><a href="/delete/${song.id}">Delete</a></td>
            
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="person/newperson">Add new Person</a>
</body>
</html>