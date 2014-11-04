/**
 * 
 */
package com.cs.biz;

import java.util.List;

import com.cs.web.model.vo.MsgShowVO;
import com.cs.web.model.vo.MsgVO;

/**
 * @author 李思良
 *
 */
public interface MsgManager extends BaseManager {
	
	/**
	 * 添加一条留言
	 * @param msg 留言
	 * @return 留言id
	 */
	public int insertMsg(MsgVO msg);
	
	/**
	 * 根据留言id删除留言
	 * @param id
	 * @return
	 */
	public boolean delMsgById(int id);
	
	/**
	 * 根据活动id删除留言
	 * @param id
	 * @return
	 */
	public boolean delMsgByAct(int id);
	
	/**
	 * 根据用户id删除留言
	 * @param id
	 * @return
	 */
	public boolean delMsgByUser(int id);
	
	/**
	 * 根据留言id获取留言
	 * @param id 留言id
	 * @return
	 */
	public MsgShowVO getMsgById(int id);
	
	/**
	 * 根据活动id获取留言
	 * @param id 活动id
	 * @return
	 */
	public List<MsgShowVO> getMsgByAct(int id, int offset, int limit);
	
	/**
	 * 根据用户id获取留言
	 * @param id 
	 * @return
	 */
	public List<MsgShowVO> getMsgByUser(int id, int offset, int limit);
}
