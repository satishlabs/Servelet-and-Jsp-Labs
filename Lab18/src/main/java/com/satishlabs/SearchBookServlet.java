package com.satishlabs;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchBookServlet
 */
public class SearchBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Collect the data
		String cat = request.getParameter("category");
		if(cat != null & (cat.equals("Java")||cat.equals("Spring") )) {
			ArrayList<String> blist = new ArrayList<>();
			blist.add("Java");
			blist.add("Servlet");
			blist.add("JSP");
			blist.add("Spring");
			blist.add("Angular");
			blist.add("Hibernate");

			HttpSession session = request.getSession();
			session.setAttribute("BOOKS", blist);
		}else {
			request.setAttribute("MSG", "No Books found with category : "+cat);
		}

		RequestDispatcher rd = request.getRequestDispatcher("showbooks.jsp");
		rd.forward(request, response);
	}

}