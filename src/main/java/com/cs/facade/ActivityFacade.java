/**
 * 
 */
package com.cs.facade;

import com.cs.web.model.vo.ActivityLimitVO;
import com.cs.web.model.vo.ActivityVO;
import com.cs.web.model.vo.ApplyVO;
import com.cs.web.model.vo.CollectVO;

/**
 * @author 李思良
 *
 */
public interface ActivityFacade extends BaseFacade {
	
	public void hotAnalysis();
	
	public String insertActivity(ActivityVO actVO);
	
	public void test();
	
	public String insertApply(ApplyVO avo);
	
	public String applyCheck(int applyId, boolean check);
	
	public String getUserApply(int person, int offset, int limit);
	
	public String delApply(int person, int activity);
	
	public String getActivityDetail(int id);
	
	public String getActByNew(ActivityLimitVO avo, int offset, int limit);
	
	public String insertCollect(CollectVO cvo);
	
	public String getUserCollect(int person, int offset, int limit);
	
	public String delCollect(int person, int activity);
	
	public String checkCollect(int person, int activity);
}
