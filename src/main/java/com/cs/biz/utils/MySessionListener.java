package com.cs.biz.utils;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 复写session监听器.
 * @author 李思良.
 *
 */
public class MySessionListener implements HttpSessionListener {
	@Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
    	HttpSession session = httpSessionEvent.getSession();
    	session.setMaxInactiveInterval(5 * 60 * 60);
    	MySessionContext.AddSession(httpSessionEvent.getSession());
    }
	@Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        MySessionContext.DelSession(httpSessionEvent.getSession());
    }

}