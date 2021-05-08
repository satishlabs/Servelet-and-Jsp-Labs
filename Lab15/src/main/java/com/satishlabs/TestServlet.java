package com.satishlabs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static  int count=0;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;
		System.out.println("------ service() ---------: "+count);
		PrintWriter out = response.getWriter();
		Date dt =  new Date();
		out.println("<h1> : "+dt);
		if(count <=10) {
			response.setHeader("Refersh", "1");
		}else {
			response.setHeader("Refersh", "1, https://github.com/login");
		}
	}

}