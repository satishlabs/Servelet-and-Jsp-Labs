package com.satishlabs;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RemoveServlet
 */

public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bnm = request.getParameter("bname");
		Cookie[] cs = request.getCookies();
		Writer out = response.getWriter();
		if(cs == null) {
			out.write("<h2>You are new Client");
			HttpSession session = request.getSession();
		}else {
			boolean found = false;
			for(Cookie c :cs) {
				String cn = c.getName();
				String cv = c.getValue();
				if(cn.equals("JESSIONID")) {
					found = true;
					out.write("<h2> Cookie Name : "+cn);
					out.write("<h2> Cookie Value : "+cv);
				}if(cn.equals(bnm)) {
					c.setMaxAge(0);
					response.addCookie(c);
				}else {
					out.write("<h2> Cookie Name : "+cn);
					out.write("<h2> Cookie Value : "+cv);
				}
				if(found) {
					out.write("<h2>You are old Client");

				}else {
					out.write("<h2>You are new Client");
					HttpSession session = request.getSession();
				}
			}
			out.write("<hr/>");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}

}