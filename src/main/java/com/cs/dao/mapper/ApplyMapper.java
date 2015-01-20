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

	/**
	 * 添加一条申请
	 * @param apo
	 * @return 申请主键
	 */
	public int insertApply(ApplyPO apo);
	/**
	 * 更新申请状态
	 * @param avo
	 * @return 申请主键
	 */
	public int updateStatus(ApplyVO avo);
	/**
	 * 获取用户申请
	 * @param condition 条件
	 * @return
	 */
	public List<MyApplyVO> getApplyByPerson(HashMap<String, Integer> condition);
	/**
	 * 
	 * @param actId
	 * @return
	 */
	public List<ApplyShowVO> getApplyByActId(int actId);
	/**
	 * 
	 * @param person
	 * @param activity
	 * @return
	 */
	public Integer getApplyId(int person, int activity);
	/**
	 * 
	 * @param person
	 * @param activity
	 * @return
	 */
	public int delApply(int person, int activity);
}
