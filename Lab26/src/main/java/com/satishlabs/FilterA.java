package com.satishlabs;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class FilterA
 */

public class FilterA implements Filter {

    /**
     * Default constructor. 
     */
    public FilterA() {
        System.out.println("****** FilterA Constructor *******");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("******** FilterA destroy ***********");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("********* FilterA doFilter() started ******");
		chain.doFilter(request, response);
		System.out.println("********* FilterA doFilter() Completed ******");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("**** FilterA init() ********");
	}

}
