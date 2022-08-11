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

import com.model.services.AccountServices;

import com.model.validation.ValidateInput;

/**
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AccountServices us= BussinessProvider.createBussinessObject();
		int accNo=Integer.parseInt(request.getParameter("accountNo"));
		float amt=Float.parseFloat(request.getParameter("amount"));

	    if(ValidateInput.validateAccNo(accNo)) {
    		if(ValidateInput.validateAmount(amt)) {
    			float a=us.deposit(accNo,amt);
    			request.setAttribute("amt", amt);
    			request.setAttribute("accNo", accNo);
    			request.setAttribute("a", a);
    			RequestDispatcher rd=request.getRequestDispatcher("Deposit.jsp");
    			rd.forward(request, response);
    		}
    		else {
    			response.sendRedirect("AmountNotValid.jsp");
    		}
	}
		else {
			response.sendRedirect("AccountNoNotValid.jsp");
		}
	}

}
