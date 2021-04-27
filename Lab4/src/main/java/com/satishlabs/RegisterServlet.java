package com.satishlabs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */

/**
 * @author Satish
 *
 */
@WebServlet(name = "mylogin", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Collect the data
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String timings = request.getParameter("timings");
		String course = request.getParameter("course");
		String []courses = request.getParameterValues("course");
		String re = request.getParameter("remarks");

		String msg = "Your data added successfully!";
		//Process the data
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Phone : "+phone);
		System.out.println("Gender : "+gender);
		System.out.println("Timings : "+timings);
		System.out.println("Name : "+name);
		System.out.println("Course : "+course);
		if(courses != null) {
			for(String c: courses) {
				System.out.println(c);
			}
		}

		System.out.println("Remarks : "+re);

		//Send response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome in Satish Labs</h1>");
		out.println("<h2>"+msg+"</h2>");
		out.println("<h2>Name : </h2>"+name);
		out.println("<h2>Email : </h2>"+email);
		out.println("<h2>Phone : </h2>"+phone);
		out.println("<h2>Gender : </h2>"+gender);
		out.println("<h2>Timings : </h2>"+timings);
		out.println("<h2>Course : </h2>"+course);
		out.println("<h2>All Course : </h2>");
		if(courses != null) {
			for(String c: courses) {
				out.println("<br/>"+c);
			}
		}
		out.println("<h2>Remarks : </h2>"+re);

	}

}
