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
 * Servlet implementation class ForgotPasswordServlet
 */
@WebServlet("/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Services us= LoginProvider.createBussinessObject();
		String username=request.getParameter("Uname");
		String sq=request.getParameter("sQ");
		us.forgetPassword(username, sq);
		//PrintWriter p=response.getWriter();
		//p.println("Your new password is "+"hello");
		RequestDispatcher rd=request.getRequestDispatcher("ForgotPassword.jsp");
		rd.forward(request, response);
		
	}
}
