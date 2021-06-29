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
	<form action="/logout" method="get">
		<p>
			<input type="submit" value="Logout">
		</p>
	</form>

	<form:form method="post" action="/events/new" modelAttribute="event">
		
		<form:label path="name">Name:
			<form:errors path="name"></form:errors>
			<form:input path="name"/>
		</form:label>
		
		<form:label path="date">Date:
			<form:errors path="date"></form:errors>
			<form:input type="date" path="date"/>
		</form:label>
		
		
		<form:label path="city">City:
			<form:errors path="city"></form:errors>
			<form:input path="city"/>
		</form:label>
		
		<form:label path="state">State:
			<form:errors path="state"></form:errors>
			<form:input path="state"/>
		</form:label>
		
		<input type="submit" value="Create Event" />
	</form:form>
</body>
</html>