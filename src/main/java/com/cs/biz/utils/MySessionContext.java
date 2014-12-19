/**
 * 
 */
package com.cs.biz.utils;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

/**
 * session模拟.
 * @author 李思良
 *
 */
public class MySessionContext {
	private static HashMap<String, HttpSession> mymap = new HashMap<String, HttpSession>();

	/**
	 * 添加session.
	 * @param session 用户session.
	 */
    public static synchronized void AddSession(HttpSession session) {
        if (session != null) {
            mymap.put(session.getId(), session);
        }
    }

    /**
     * 删除session.
     * @param session 用户session.
     */
    public static synchronized void DelSession(HttpSession session) {
        if (session != null) {
            mymap.remove(session.getId());
        }
    }

    /**
     * 查找session.
     * @param session_id session的id.
     * @return 用户session.
     */
    public static synchronized HttpSession getSession(String session_id) {
        if (session_id == null)
        	return null;
        return (HttpSession) mymap.get(session_id);
    }
}
