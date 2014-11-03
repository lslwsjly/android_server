/**
 * 
 */
package com.cs.biz;

import java.util.HashMap;

/**
 * @author 李思良
 *
 */
public interface SessionManager {

	/**
	 * 获取用户session.
	 * @param id sessionId
	 * @return
	 */
	public HashMap<String, Object> getSession(String id);
	
	/**
	 * 清空session.
	 */
	public void invalidate();
	
	/**
	 * 初始化.
	 */
	public void init();
	
	/**
	 * 
	 */
	public void destroy();
}
