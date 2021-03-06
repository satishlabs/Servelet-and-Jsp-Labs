package com.satishlabs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletB
 */
@WebServlet("/ServletB")
public class ServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*********** ServletB -- service() ************");
		RequestDispatcher rd = request.getRequestDispatcher("c.test");
		rd.forward(request, response);
		System.out.println("*********** ServletB -- service() Completed************");
	}

}
