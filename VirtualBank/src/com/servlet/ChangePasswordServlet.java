package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.provider.LoginProvider;
import com.model.services.Services;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Services us= LoginProvider.createBussinessObject();
		String username=request.getParameter("Uname");
		String password1=request.getParameter("Pword1");
		String password2=request.getParameter("Pword2");
		us.updatePassword(username, password1,password2);
		//PrintWriter p=response.getWriter();
		//p.println("Your new password is "+password2);
		request.setAttribute("password", password2);
		RequestDispatcher rd=request.getRequestDispatcher("UpdatePassword.jsp");
		rd.forward(request, response);
		
	}

}
