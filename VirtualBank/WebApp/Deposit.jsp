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
<%= request.getAttribute("amt") %> is successfully credited into your account <%= request.getAttribute("accNo") %><br>
Your current balance is <%= request.getAttribute("a") %><br><br>
<a href="Transaction.html">Return to Bank Transaction Page</a>

</body>
</html>