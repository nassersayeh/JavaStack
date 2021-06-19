<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form method="POST" action="/main" >
<label for="yourname">Your Name</label>
<input type="text" name="yourname"><br><br>
<label for="selectone">Dojo Location</label>
<select name="selectone">
<option>San Jase</option>
<option>Nasser Sayeh</option>
</select><br><br>
<label for="Programming">Favoret Languege </label>
<select name="Programming">
<option>Python</option>
<option>Java</option>
</select><br><br>
<label for="textbox">Comment(optinal)</label>
<textarea rows="3" cols="10" name="textbox"></textarea>
<br><br>
<input type="submit" value="Button">
</form>
</body>
</html>