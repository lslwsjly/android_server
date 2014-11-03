package com.cs.biz.utils;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MySessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
    	HttpSession session = httpSessionEvent.getSession();
    	session.setMaxInactiveInterval(5 * 60 * 60);
    	MySessionContext.AddSession(httpSessionEvent.getSession());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        MySessionContext.DelSession(httpSessionEvent.getSession());
    }

}