package com.satishlabs;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(urlPatterns= {"/hello.abc","/test.abc"})
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Verifying the html action
		String uri = request.getRequestURI();

		System.out.println("URI : "+uri);

		Writer out = response.getWriter();
		response.setContentType("text/html");
		out.write("<h1>Request processed with action: "+uri);
	}

}