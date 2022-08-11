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
 * Servlet implementation class TransferServlet
 */
@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountServices us= BussinessProvider.createBussinessObject();
		int accNo1=Integer.parseInt(request.getParameter("accountNo1"));
		int accNo2=Integer.parseInt(request.getParameter("accountNo2"));
		float amt=Float.parseFloat(request.getParameter("amount"));

	
		if(ValidateInput.validateAccNo(accNo1) && ValidateInput.validateAccNo(accNo2)) {
    		if(ValidateInput.validateAmount(amt)) {
    			float c= us.balEnquiry(accNo1);
    			if(c>amt) {
    				us.transfer(accNo1, accNo2, amt);
    				float a=us.balEnquiry(accNo1);
    				float b=us.balEnquiry(accNo2);
    				request.setAttribute("amt", amt);
    				request.setAttribute("accNo1", accNo1);
    				request.setAttribute("accNo2", accNo2);
    				request.setAttribute("a", a);
    				request.setAttribute("b", b);
    				RequestDispatcher rd=request.getRequestDispatcher("Transfer.jsp");
    				rd.forward(request, response);
    			}
    			else {
    				response.sendRedirect("Insufficient.html");
    			}
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
