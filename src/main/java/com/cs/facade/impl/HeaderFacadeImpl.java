package com.cs.facade.impl;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import com.cs.facade.HeaderFacade;

public class HeaderFacadeImpl implements HeaderFacade {

	@Override
	public HashMap<String, Object> getHeader(final int nav, final HttpSession session) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("nav", nav);
		if(session.getAttribute("userId")!=null) {
			result.put("userName", session.getAttribute("userName"));
			result.put("userId", session.getAttribute("userName"));
			result.put("admin", session.getAttribute("admin"));
		} else {
			result.put("userId", 0);
		}
		return result;
	}

}
