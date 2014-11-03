/**
 * 
 */
package com.cs.biz;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.ApplyPO;

/**
 * @author 李思良
 *
 */
public interface ApplyManager extends BaseManager {
	/**
	 * 添加一项申请
	 * @param applyPO 申请模型
	 */
	public void insertApply(ApplyPO applyPO);
	
	/**
	 * 根据申请id删除申请
	 * @param applyId 申请id
	 */
	public void delApplyById(int applyId);
	
	/**
	 * 根据活动id删除申请
	 * @param activityId 活动id
	 */
	public void delApplyByActivity(int activityId);
	
	/**
     * 搜素申请.
     *
     * @param condition
     *            搜索条件<br/>
     *            activityId : 活动id
     *            offset : 返回结果从第offset+1个开始返回（int必选）<br/>
     *            limit : 返回limit个结果（int必选） <br/>
     * @return 申请列表
     */
	public List<ApplyPO> getApplys(HashMap<String, Object>condition);
}
