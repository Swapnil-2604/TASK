<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
<center><h2>REGISTER</h2></center>
</head>
<body>
	<form action="reg">
		<table border="1" align="center">
			<tr>
				<td>User Id:</td>
				<td><input type="number" name="id"><br></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username"><br></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"><br></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"><br></td>
			</tr>

			<tr>
				<td>Position:</td>
				<td><input type="text" name="position"><br></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="salary"><br></td>
			</tr>
			</table>
			<table border="1" align="center">
			<tr>
				<td><input type="submit" name="save"></td>
			</tr>
		</table>
	</form>

</body>
</html>