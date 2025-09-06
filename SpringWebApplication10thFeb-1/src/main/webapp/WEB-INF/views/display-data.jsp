<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>

	<h2>My Data</h2>

	<h3>Name : ${user.getName()}</h3>
	<h3>Email ID : ${user.getEmail()}</h3>
	<h3>Phone No : ${user.getPhoneNo()}</h3>


</body>
</html>