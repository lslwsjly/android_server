/**
 * 
 */
package com.cs.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.MsgPO;
import com.cs.web.model.vo.MsgShowVO;

/**
 * @author 李思良
 *
 */
public interface MsgMapper extends BaseMapper {

	public int insertMsg(MsgPO msg);
	
	public int delMsg(HashMap<String, Integer> condition);
	
	public List<MsgShowVO> getMsg(HashMap<String, Integer> condition);
	
}
