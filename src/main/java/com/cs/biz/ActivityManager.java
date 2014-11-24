package com.cs.biz;

import java.util.List;

import com.cs.web.model.vo.ActivityConditionVO;
import com.cs.web.model.vo.ActivityDetailVO;
import com.cs.web.model.vo.ActivityListShow;
import com.cs.web.model.vo.ActivityVO;
import com.cs.web.model.vo.ApplyShowVO;
import com.cs.web.model.vo.ApplyVO;
import com.cs.web.model.vo.CollectShowVO;
import com.cs.web.model.vo.CollectVO;
import com.cs.web.model.vo.MyApplyVO;

/**
 * 
 * @author 李思良.
 *
 */
public interface ActivityManager extends BaseManager {

	public int insertActivity(ActivityVO actVO);
	
	public boolean updateActivityStatus(ActivityConditionVO acVO);
	
	public int insertApply(ApplyVO avo);
	
	public boolean updateApplyStatus(int applyId, boolean check);
	
	public List<ApplyShowVO> getApplyByActId(int actId);
	
	public List<MyApplyVO> getUserApply(int person, int offset, int limit);
	
	public boolean delApply(int person, int activity);
	
	public ActivityDetailVO getActDetail(int id);
	
	public List<ActivityListShow> getActByNew(int offset, int limit);
	
	public int insertCollect(CollectVO colVO);
	
	public List<CollectShowVO> getUserCollects(int person, int offset, int limit);
	
	public boolean delCollect(int person, int activity);
}
