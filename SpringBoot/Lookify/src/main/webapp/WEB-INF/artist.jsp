<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Song By artist ${x.artist } </h2>
<form action="/search" method="GET">
<input name="name">
<button type="submit">search</button>
</form>
<a href="/dashboard">Dashbaord</a>

<table >
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Rating</th>
      <th scope="col">Options</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${g}" var="x">
    <tr>
      <td><a href="/music/${x.id }">${x.title }</a></td>
      <td>${x.rating }</td>
      <td><a href="/delete/${x.id }">Delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>