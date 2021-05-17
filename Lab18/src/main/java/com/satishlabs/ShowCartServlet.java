package com.satishlabs;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowCartServlet
 */

public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session == null) {
			request.setAttribute("MSG", "Session is destroyed");
			RequestDispatcher rd = request.getRequestDispatcher("showbooks.jsp");
			rd.forward(request, response);
		} else {
			Enumeration<String> enums = session.getAttributeNames();
			List<String> selectedList = Collections.list(enums);
			selectedList.remove("BOOKS");
			if (selectedList.size() == 0) {
				request.setAttribute("MSG", "No books selected");
			} else {
				request.setAttribute("CART", selectedList);
			}
			RequestDispatcher rd = request.getRequestDispatcher("showcart.jsp");
			rd.forward(request, response);
		}
	}

}