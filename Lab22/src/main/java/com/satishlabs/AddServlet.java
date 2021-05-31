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
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer out = response.getWriter();
		String bnm = request.getParameter("bname");
		Cookie ck1 = new Cookie(bnm, bnm);
		response.addCookie(ck1);
		out.write("<h2> Bname : "+bnm);

		Cookie[] cs = (Cookie[]) request.getCookies();
		if(cs == null) {
			out.write("<h2>You are new Client");
			HttpSession session = request.getSession();
		}else {
			boolean found = false;
			for(Cookie c :cs) {
				String cn = c.getName();
				String cv = c.getValue();
				out.write("<h2> Cookie Name : "+cn);
				out.write("<h2> Cookie Value : "+cv);
				if(cn.equals("JESSIONID")) {
					out.write("<h2>You are old client");
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