<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
  <tr>
    <th>id</th>
    <th>Material</th>
  </tr>
  <c:forEach items="${allMat}" var="mats">
  <tr>
    <td>${mats.id}</td>
  	 <td>${mats.materialname}</td>
  	 <td><a href="deleteByID?id=${mats.id}">delete</a></td>
  	 <td><a href="updateByID?id=${mats.id}?name=$name">update</a><input type="text" id="name"></td>
  </tr>
  </c:forEach>
</table>

<a href="create">add record</a>
</body>
</html>