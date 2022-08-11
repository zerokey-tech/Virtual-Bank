<%@page import="java.sql.*" %>
<%
 String id = request.getParameter("id");
 String name = request.getParameter("name");
 String class_ = request.getParameter("class");
 String division = request.getParameter("division");
 String city = request.getParameter("city");
 try
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/wt?autoReconnect=true&useSSL=false","root","thisisme");
	Statement stmt=con.createStatement();
	stmt.executeUpdate("INSERT INTO student_info (stud_id, stud_name, class, division, city) VALUES "
			 +"('"+id+"', '"+name+"', '"+class_+"', '"+division+"', '"+city+"')");
	out.println("Inserted Successfully!!");
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}

%>