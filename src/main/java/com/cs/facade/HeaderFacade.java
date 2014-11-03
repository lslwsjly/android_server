package com.cs.facade;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

public interface HeaderFacade extends BaseFacade{

	public HashMap<String, Object>getHeader(final int nav, final HttpSession session);
}
