package com.satishlabs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowHomeServlet
 */

public class ShowHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*********  ShowHomeServlet  -- service() **********");
		RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/header.html");
		rd1.include(request, response);
		RequestDispatcher rd2 = request.getRequestDispatcher("/WEB-INF/menu.html");
		rd2.include(request, response);
		RequestDispatcher rd4 = request.getRequestDispatcher("/WEB-INF/home.html");
		rd4.include(request, response);
		RequestDispatcher rd3 = request.getRequestDispatcher("/WEB-INF/footer.html");
		rd3.include(request, response);

	}

}