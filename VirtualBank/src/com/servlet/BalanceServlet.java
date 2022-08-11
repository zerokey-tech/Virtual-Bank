package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.provider.BussinessProvider;
import com.model.services.AccountServices;
import com.model.validation.ValidateInput;

/**
 * Servlet implementation class BalanceServlet
 */
@WebServlet("/BalanceServlet")
public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountServices us= BussinessProvider.createBussinessObject();
		int accNo=Integer.parseInt(request.getParameter("accountNo"));
		

	
	 
		if(ValidateInput.validateAccNo(accNo)) {
    		 
    			float a=us.balEnquiry(accNo);
    			
    			request.setAttribute("accNo", accNo);
    			request.setAttribute("a", a);
    			RequestDispatcher rd=request.getRequestDispatcher("Balance.jsp");
    			rd.forward(request, response);
    		 }
	}


}
