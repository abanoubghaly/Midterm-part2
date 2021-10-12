<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
<style>
	.error {color:red}
</style>
</head>
<body>
	<form:form action="user-form-result" modelAttribute="user" method="GET">
		Name: <form:input path="name"/>
		<form:errors path="name" cssClass="error"/>
		<br> <br>
		Phone Number: <form:input path="phoneNumber"/>
		<form:errors path="phoneNumber" cssClass="error"/>
		<br/> <br/>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>