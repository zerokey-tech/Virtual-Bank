<%@page import="java.sql.*" %>
<%
 String query = "select * from student_info";
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection 
con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/wt?autoReconnect=true&useSSL=false","root","thisisme");
Statement stmt=con.createStatement();
ResultSet rs = stmt.executeQuery(query);
 out.println("<html>");
 out.println("<head>");
 out.println("<style> table,tr,th,td {border:1px solid black;} </style>");
 out.println("</head>");
 out.println("<table>");
 out.println("<tr>");
 out.println("<th>ID</th>");
 out.println("<th>Name</th>");
 out.println("<th>Class</th>");
 out.println("<th>Division</th>");
 out.println("<th>City</th>");
 out.println("</tr>");
 while(rs.next())
{
 out.println("<tr>");
 out.println("<td>"+rs.getString("stud_id")+"</td>");
out.println("<td>"+rs.getString("stud_name")+"</td>");
out.println("<td>"+rs.getString("class")+"</td>");
out.println("<td>"+rs.getString("division")+"</td>");
out.println("<td>"+rs.getString("city")+"</td>");
 out.println("</tr>");
 
}
 out.println("</table>");
out.println("</html>");
}
catch(SQLException e)
{
e.printStackTrace();
}
catch(Exception e)
{
e.printStackTrace();
}
%>