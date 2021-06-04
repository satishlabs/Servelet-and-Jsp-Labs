package com.satishlabs;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet implementation class DemoFilter
 */

@WebFilter(
			filterName = "demoFilter",
			urlPatterns = {"/demo"},
			initParams = {
					@WebInitParam(name = "city", value = "Banaglore")
			}
		)

public class DemoFilter implements Filter {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see Servlet#init(FilterConfig)
	 */
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("********* DemoFilter -- init() ************");
		String ci = fc.getInitParameter("city");
		System.out.println(ci);
	}

	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException, ServletException {
		System.out.println("********* DemoFilter  -- doFilter() -- Before **********");
		String nm = request.getParameter("name");
		String email = request.getParameter("email");
		String ip = request.getRemoteAddr();
		
		System.out.println(nm);
		System.out.println(email);
		System.out.println(ip);
		
		chain.doFilter(request, response);
		
		System.out.println("****** DemoFilter  --  doFilter() -- After ************");
		Object obj = request.getAttribute("MSG");
		System.out.println(obj);
		String msg = obj.toString();
		System.out.println(msg);
	}
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("***** DemoFilter -- destroy() **********");
	}

}
