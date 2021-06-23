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
	<h1>Add License</h1>
	<form:form action="/licens/add" method="post" modelAttribute="licens">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="person">Person</form:label>
			<form:errors path="person" />
			<form:select path="person" >
			<c:forEach items="${person}" var="song">
				<form:option value="${song.id }">${song.getFirstName()}</form:option>
			 </c:forEach>
			 </form:select>
		</p>
		<p>
			<form:label path="state">State</form:label>
			<form:errors path="state" />
			<form:input path="state" />
		</p>

		<p>
			<form:label path="expirationDate">Expiration Date</form:label>
			<form:errors path="expirationDate" />
			<form:input type="date" path="expirationDate"/>
		</p>


		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>