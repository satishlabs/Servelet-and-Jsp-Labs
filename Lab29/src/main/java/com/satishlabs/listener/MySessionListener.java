package com.satishlabs.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MySessionListener() {
       System.out.println("****** MySessionListener() Def Cons ********");
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event)  { 
         HttpSession session = event.getSession();
         ServletContext ctx = session.getServletContext();
         int tv = (int) ctx.getAttribute("TV");
         tv++;
         ctx.setAttribute("TV", tv);
         int ra = (int) ctx.getAttribute("TA");
         ra++;
         ctx.setAttribute("TA", ra);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         System.out.println("******** sessionDestroyed() ************");
    }
	
}
