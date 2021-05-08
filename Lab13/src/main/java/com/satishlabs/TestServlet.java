package com.satishlabs;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Collect the data
		String uname = request.getParameter("uname");
		Writer out = response.getWriter();
		out.flush();
		Thread t1 = Thread.currentThread();
		for(int i=0; i<10; i++) {
			System.out.println(t1.getName()+"\t"+uname+"\t"+this);
			out.write("<br/>"+t1.getName()+"\t"+uname+"\t"+this);

			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		out.write("<h1>Hi, "+uname+" <br/>Response from Server");
	}

}