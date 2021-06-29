<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>

	<h1>Register!</h1>

	<p>
		<form:errors path="user.*" />
	</p>

	<form:form method="POST" action="/registration" modelAttribute="user">
		<p>
			<form:label path="email">Email:</form:label>
			<form:errors path="email"></form:errors>
			<form:input type="text" path="email" />
		</p>
		<p>
			<form:label path="password">Password:</form:label>
			<form:errors path="password"></form:errors>
			<form:password path="password" />
		</p>
		<p>
			<form:label path="passwordConfirmation">Password Confirmation:</form:label>
			<form:errors path="passwordConfirmation"></form:errors>
			<form:password path="passwordConfirmation" />
		</p>
		<p>
			<form:label path="city">City:</form:label>
			<form:errors path="city"></form:errors>
			<form:input type="text" path="city" />
		</p>
		
			<p>
			<form:label path="state">State:</form:label>
			<form:errors path="state"></form:errors>
			<form:input type="text" path="state" />
		</p>
		<input type="submit" value="Register!" />
	</form:form>

</body>
</html>


