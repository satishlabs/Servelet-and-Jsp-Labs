package com.satishlabs;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

public class HelloServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

ServletConfig config = null;

@Override
public void init(ServletConfig config) throws ServletException {
this.config = config;
System.out.println("*** init() method of HelloServlet **");
}

/**
* @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
*/
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.err.println("**** service() method of HelloServlet **");
String fname = request.getParameter("fname");
String phone = request.getParameter("phone");

Writer out = response.getWriter();
response.setContentType("text/html");
out.write("<h1>Response from HelloServlet</h1>");
out.write("<h1>Request Parameters</h1>");
out.write("<h1>Fname : "+fname);
out.write("<h1>Phone : "+phone);

out.write("<h1>Servlet ConfigInitParameter</h1>");
out.write("<h1>Request Parameters</h1>");
out.write("<br/> "+config);
String email1  = config.getInitParameter("email");
out.write("<h1>Email : "+email1);

out.write("<h1>Servlet ContextParameter</h1>");
ServletContext context = config.getServletContext();
String web = context.getInitParameter("website");

out.write("<br /> "+context);
out.write("<h1>Websites:  "+web);
}

}