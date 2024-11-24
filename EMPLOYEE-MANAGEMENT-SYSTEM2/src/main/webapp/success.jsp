<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<center><h1>ALL INFORMATION</h1></center>
<script type="text/javascript">
function addUser()
{
	document.fn.action="register";
	document.fn.submit();
}

function deleteUser(){
	
	alert("Delete Data");
	document.fn.action="delete";
	document.fn.submit();
}

function editUser(){
	document.fn.action="edit";
	document.fn.submit();
} 
	
</script>
</head>
<body>
	<form name="fn">
		<table border="1" align="center">
			<th>Check</th>
			<th>Id</th>
			<th>Name</th>
			<th>User Name</th>
			<th>password</th>
			<th>Position</th>
			<th>Salary</th>
			<tr>
				<c:forEach items="${data}" var="user">
					<br>
					<td><input type="radio" name="id" value="${user.id}"></td>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.username}</td>
					<td>${user.password}</td>
					<td>${user.position}</td>
					<td>${user.salary}</td>
			</tr>
			</c:forEach>

		</table>
		<table border="2" align="center">
			<tr>
				<td><input type="button" value="EDIT" onclick="editUser()"></td>
				<td><input type="button" value="ADD" onclick="addUser()"></td>
				<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
			</tr>
		</table>
	</form>

</body>
</html>