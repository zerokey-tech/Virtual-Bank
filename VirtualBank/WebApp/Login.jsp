<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
font-size:20px;
}
a{
text-decoration: none;
color:blue;
font-size: 20px;
}
</style>
</head>
<body>
Congratulations!! <%= request.getAttribute("uname") %><br>
Your new account is successfully created!!<br>
Your account no is <%= request.getAttribute("accNo") %><br><br>
<a href="Login.html">Login</a>

</body>
</html>