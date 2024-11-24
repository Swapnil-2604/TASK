<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Data</title>
    <center><h2>EDIT DATA</h2></center>
</head>
<body>
    <form action="/update" method="post">
        <table border="1" align="center">
            <input type="hidden" name="id" value="${data.id}">

            <tr>
                <td>Username:</td>
                <td><input type="text" name="username" value="${data.username}"><br></td>
            </tr>

            <tr>
                <td>Password:</td>
                <td><input type="text" name="password" value="${data.password}"></td>
            </tr>

            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value="${data.name}"></td>
            </tr>

            <tr>
                <td>Position:</td>
                <td><input type="text" name="position" value="${data.position}"></td>
            </tr>

            <tr>
                <td>Salary:</td>
                <td><input type="text" name="salary" value="${data.salary}"></td>
            </tr>
        </table>
        <table border="1" align="center">
            <tr>
                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</body>
</html>
