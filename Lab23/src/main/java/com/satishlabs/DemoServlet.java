package com.satishlabs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */

public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  @Override
public void init(ServletConfig config) throws ServletException {
	  System.out.println("******* DemoServlet -- init() ********");
	  String ci = config.getInitParameter("city");
	  System.out.println(ci);
}
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("********** DemoServlet -- service() ***********");
		String nm = request.getParameter("name");
		String email = request.getParameter("email");
		String ip = request.getRemoteAddr();
		String msg = "<h1>Hello ! "+nm+"<br>";
		msg = msg+"Your Email Id is "+email+"<br>";
		msg = msg+"You are sending the requesting from ip Address : "+ip;
		request.setAttribute("MSG", msg);
		PrintWriter out = response.getWriter();
		out.print(msg);
	}
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("**********DemoServlet  -- destroy() **************");
	}
}
