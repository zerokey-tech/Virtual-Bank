package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.services.Services;
import com.model.provider.LoginProvider;


/**
 * Servlet implementation class AuthenticateServlet
 */
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Services us= LoginProvider.createBussinessObject();
		String username=request.getParameter("Uname");
		String password=request.getParameter("Pword");
		boolean ans=us.authenticate(username, password);
		if(ans) {
			response.sendRedirect("Transaction.html");
		}
		else {
			response.sendRedirect("InvalidCredential.html");
		}
	}

}
