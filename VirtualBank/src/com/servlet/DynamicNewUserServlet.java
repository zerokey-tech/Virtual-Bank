package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.provider.BussinessProvider;
import com.model.provider.LoginProvider;
import com.model.services.AccountServices;
import com.model.services.Services;

/**
 * Servlet implementation class DynamicNewUserServlet
 */
@WebServlet("/DynamicNewUserServlet")
public class DynamicNewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Services us= LoginProvider.createBussinessObject();
		String username=request.getParameter("Uname");
		String password=request.getParameter("Pword");
		String sq=request.getParameter("sQ");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String accType=request.getParameter("accType");
		int a=us.signUp(username, password,sq,name,email,accType,0);
		//PrintWriter p=response.getWriter();
		//p.println("<h4>Congrtulations "+username+"<br>your new account is created</h4><br>");
		//AccountServices ac= BussinessProvider.createBussinessObject();
		//int a=ac.openAccount(0);
		//p.println("Your account no is "+a);
		request.setAttribute("uname", username);
		request.setAttribute("accNo", a);
		
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
		
		
		


		
	
	}

}
