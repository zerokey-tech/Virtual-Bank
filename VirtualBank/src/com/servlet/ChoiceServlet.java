package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChoiceServlet
 */
@WebServlet("/ChoiceServlet")
public class ChoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ChoiceServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i=Integer.parseInt(request.getParameter("choice"));
		switch(i) {
		case 1:
			response.sendRedirect("Deposit.html");
			break;
		case 2:
			response.sendRedirect("Withdraw.html");
			break;
		case 3:
			response.sendRedirect("Transfer1.html");
			break;
		case 4:
			response.sendRedirect("Balance.html");
			break;
		case 5:
			response.sendRedirect("Welcome.html");
			break;
		case 6:
			response.sendRedirect("CloseAccount.html");
			break;
		
	}
	}

}
