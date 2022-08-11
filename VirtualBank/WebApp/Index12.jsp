<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Student Information System</title>
 </head>
 <body>
 <h1>Student Information System</h1>
 <form method="post" action='Insert.jsp'>
 <input type="text" name="id" placeholder="ID" /><br />
 <input type="text" name="name" placeholder="Name" /><br />
 <input type="text" name="class" placeholder="Class" /><br />
 <input type="text" name="division" placeholder="Division" /><br />
 <input type="text" name="city" placeholder="City" /><br />
 <br />
 <input type="submit" value="INSERT" />
 </form>
 
 
 <form method='post' action='Display.jsp'>
 <input type="submit" value="DISPLAY" />
 </form>
 </body>
</html>