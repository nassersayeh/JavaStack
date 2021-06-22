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
<p><a href="/newsong">Add new song</a></p>
<a href="/search/topTen">Top Songs</a>
<form action="/search" method="GET">
<input name="name">
<button type="submit">search</button>
</form>
<h1>All songs</h1>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Rating</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${songs}" var="song">
        <tr>
            <td><a href="/song/${song.id}"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td><a href="/delete/${song.id}">Delete</a></td>
            
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>