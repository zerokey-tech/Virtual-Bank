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
 * Servlet implementation class CloseServlet
 */
@WebServlet("/CloseServlet")
public class CloseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//AccountServices us= BussinessProvider.createBussinessObject();
		int accNo=Integer.parseInt(request.getParameter("accno"));
		
		Services a= LoginProvider.createBussinessObject();
		String username=request.getParameter("Uname");
		String password=request.getParameter("Pword");
		a.deleteAccount(username,password,accNo );
		RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
		rd.forward(request, response);
		//PrintWriter p=response.getWriter();
		//p.println("your account is successfully deleted");
		
	}

}
