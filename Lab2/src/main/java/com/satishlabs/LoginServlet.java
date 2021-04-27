package com.satishlabs;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "mylogin", urlPatterns = {"/welcome"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Collect the data
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		String msg="";
		
		//2. Verifying or Processing the data 
		if(uname.equals(pword)) {
			msg = "<h1>Login Success <br /> Welcome to Satish Labs</h1>";
		}else {
			msg = "<h1>Login Success <br /> Invalid Username or Password</h1>";
		}
		
		//3. Prepare the response
		Writer out = response.getWriter();
		out.write(msg);
	}

}
