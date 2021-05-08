package com.satishlabs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Collect data wtih Request paramters
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		response.setContentType("text/html");
		//Dispaly request paramters
		PrintWriter out = response.getWriter();
		out.print("<h1>Username : "+uname);
		out.print("<h1>Password: "+pass);
		out.print("<hr/>");

		//Display request Headers
		Enumeration e = request.getHeaderNames();
		while(e.hasMoreElements()) {
			String hn = e.nextElement().toString();
			String ab = request.getHeader(hn);
			out.print("<br/>"+hn+" #::::::# "+ab);
		}
		out.print("<hr/>");
		out.print("Local Info");
		//Locales supported by browser
		out.println("<br/> Locales : "+request.getLocale());
		out.print("<hr/>");

		out.println("Other Info");
		out.println("<br/>Method : "+request.getMethod());
		out.println("<br/>Request URI : "+request.getRequestURI());
		out.println("<br/>Request URL : "+request.getRequestURL());
		out.println("<br/>Request Protocl : "+request.getProtocol());
		out.println("<br/>Request Content Lenght : "+request.getContentLength());
		out.println("<br/>Request Content Type : "+request.getContentType());
		out.println("<br/>Request Remote Addr : "+request.getRemoteAddr());
		out.println("<br/>Request Remote Port : "+request.getRemotePort());
		out.println("<br/>Request Remote Host : "+request.getRemoteHost());
		out.println("<br/>Request Server Name : "+request.getServerName());
		out.println("<br/>Request Query String : "+request.getQueryString());
		out.println("<br/>Request Server Path : "+request.getServletPath());
		out.println("<br/>Request Conetxt Path : "+request.getContextPath());

	}

}