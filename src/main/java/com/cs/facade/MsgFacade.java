/**
 * 
 */
package com.cs.facade;

import com.cs.web.model.vo.MsgVO;

/**
 * @author 李思良.
 *
 */
public interface MsgFacade extends BaseFacade {

	/**
	 * 插入消息.
	 * @param msg
	 * @return
	 */
	public String insertMsg(MsgVO msg);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public String getMsgById(int id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public String getMsgByAct(int id, int offset, int limit);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public String getMsgByUser(int id, int offset, int limit);
	
}
