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
   
    font-size: 20px;
}
</style>
</head>
<body>
Your password is successfully changed!!<br>
Your new password is <%= request.getAttribute("password") %><br><br>
<a href="Login.html">Login</a>

</body>
</html>