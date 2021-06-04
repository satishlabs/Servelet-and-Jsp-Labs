package com.satishlabs;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(
		name = "testServlet",
		urlPatterns = "/test"
		)
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestServlet - service() ");
		System.out.println("******* Accessing  Session Object ******");
		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		ServletContext ctx = getServletContext();
		System.out.println("Storing attribute in Context ");
		ctx.setAttribute("email", email);
		System.out.println("Replacing attribute in Context");
		ctx.setAttribute("email", "satish@gmail.com");
		
		System.out.println("Remvoing attribute in Context");
		ctx.removeAttribute("email");
		
		System.out.println("Invalding Session Object");
		session.invalidate();
		
		Writer out = response.getWriter();
		out.write("<h1>Verify the server console ");
	}

}
