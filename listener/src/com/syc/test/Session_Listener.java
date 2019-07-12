package com.syc.test;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Session_Listener
 *
 */
@WebListener
public class Session_Listener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public Session_Listener() {
    	
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent s)  { 
    	System.out.println("a session haven been created: "+s.getSession());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("destroy!");
    }
	
}
