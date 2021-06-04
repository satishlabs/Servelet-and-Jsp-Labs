package com.satishlabs;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterB
 */
public class FilterC implements Filter {

    /**
     * Default constructor. 
     */
    public FilterC() {
    	 System.out.println("****** FilterC Constructor *******");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("******** FilterC destroy ***********");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("********* FilterC doFilter() started ******");
		chain.doFilter(request, response);
		System.out.println("********* FilterC doFilter() Completed ******");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("**** FilterC init() ********");
	}

}
