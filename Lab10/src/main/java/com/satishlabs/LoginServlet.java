

package com.satishlabs;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("******* LoginServlet service() ********");
		//Collect the data
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");


		response.setContentType("text/html");
		Writer out = response.getWriter();
		//out.write("<h1>Welcome to my Labs</h1>");
		String page="";
		boolean check = true;
		if((uname == null || uname.trim().isEmpty()) || (pword == null || pword.trim().isEmpty())) {
			System.out.println("Username and password are required1");
			page = "/WEB-INF/required.html";
			check = false;
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}

		if(check) {
			if(uname.equals(pword)) {
				System.out.println("Username and password are same");
				page="/WEB-INF/home.html";
				RequestDispatcher rd = request.getRequestDispatcher(page);
				rd.forward(request, response);
			}else {
				System.out.println("Username and password are not same");
				page="/WEB-INF/error.html";
				RequestDispatcher rd = request.getRequestDispatcher(page);
				rd.forward(request, response);
			}
		}

		out.write("<h1>Again, Welcome to Satish Labs/h1>");
		System.out.println("***service completed -- Last Statement");
	}

}