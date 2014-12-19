/**
 * 
 */
package com.cs.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.MsgPO;
import com.cs.web.model.vo.MsgShowVO;

/**
 * 消息数据库操作.
 * @author 李思良.
 *
 */
public interface MsgMapper extends BaseMapper {

	public int insertMsg(MsgPO msg);
	
	public int delMsg(HashMap<String, Integer> condition);
	
	public List<MsgShowVO> getMsgByActId(HashMap<String, Integer> condition);
	
	public List<MsgShowVO> getMsgById(HashMap<String, Integer> condition);
	
	public List<MsgShowVO> getMsgByUserId(HashMap<String, Integer> condition);
	
}
