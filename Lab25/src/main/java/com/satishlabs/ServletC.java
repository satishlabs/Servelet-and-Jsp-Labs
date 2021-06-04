package com.satishlabs;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletC
 */
@WebServlet("/ServletC")
public class ServletC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("********* ServletC  -- service() ***********");
		Writer out = response.getWriter();
		out.write("<h2><br/>Verify the Server Console ");
		System.out.println("********* ServletC  -- service() Completed***********");
	}

}
