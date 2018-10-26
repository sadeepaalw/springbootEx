<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Material</title>
</head>
<body>
<form action="saved" method="post">

	Name = <input type="text" name="materialname">
	<br>
	Id = <input type="radio" name="id1">
	<br>
	<input type="submit" value="Create Material"> 

</form>
	${msg1}
	
	<a href="displayAll">View All</a>
</body>
</html>