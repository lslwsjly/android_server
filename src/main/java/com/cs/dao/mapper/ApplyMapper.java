/**
 * 
 */
package com.cs.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.ApplyPO;
import com.cs.web.model.vo.ApplyShowVO;
import com.cs.web.model.vo.ApplyVO;
import com.cs.web.model.vo.MyApplyVO;


/**
 * 申请数据库操作.
 * @author 李思良.
 *
 */
public interface ApplyMapper extends BaseMapper {

	public int insertApply(ApplyPO apo);
	
	public int updateStatus(ApplyVO avo);
	
	public List<MyApplyVO> getApplyByPerson(HashMap<String, Integer> condition);
	
	public List<ApplyShowVO> getApplyByActId(int actId);
	
	public Integer getApplyId(int person, int activity);
	
	public int delApply(int person, int activity);
}
