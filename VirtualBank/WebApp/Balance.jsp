<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 Account No <%= request.getAttribute("accNo") %><br>
Your balance is <%= request.getAttribute("a") %><br><br>
<a href="Transaction.html">Return to Bank Transaction Page</a>

</body>
</html>