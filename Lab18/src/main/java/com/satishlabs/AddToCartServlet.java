package com.satishlabs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddToCartServlet
 */

public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// access the existing session object
		HttpSession session = request.getSession(false);
		// Validate the session
		if (session == null) {
			request.setAttribute("MSG", "Session is destroyed");
		} else {
			String bnm = request.getParameter("bname");
			// Adding teh client selected book to session
			session.setAttribute(bnm, bnm);
			request.setAttribute("ADDED", bnm + " ia added to cart");
		}
		RequestDispatcher rd = request.getRequestDispatcher("showbooks.jsp");
		rd.forward(request, response);
	}

}