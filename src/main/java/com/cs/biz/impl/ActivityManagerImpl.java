/**
 * 
 */
package com.cs.biz.impl;

import java.util.HashMap;
import java.util.List;

import com.cs.biz.ActivityManager;
import com.cs.common.utils.StringUtils;
import com.cs.dao.mapper.ActivityMapper;
import com.cs.dao.mapper.ApplyMapper;
import com.cs.dao.mapper.CollectMapper;
import com.cs.web.model.vo.ActivityConditionVO;
import com.cs.web.model.vo.ActivityDetailVO;
import com.cs.web.model.vo.ActivityLimitVO;
import com.cs.web.model.vo.ActivityListShow;
import com.cs.web.model.vo.ActivityVO;
import com.cs.web.model.vo.ApplyShowVO;
import com.cs.web.model.vo.ApplyVO;
import com.cs.web.model.vo.CollectShowVO;
import com.cs.web.model.vo.CollectVO;
import com.cs.web.model.vo.MyApplyVO;

/**
 * 活动业务接口实现.
 * @author 李思良.
 * 
 */
public class ActivityManagerImpl implements ActivityManager {

    private ActivityMapper activityMapper;
    
    private ApplyMapper applyMapper;
    
    private CollectMapper collectMapper;

    public final ActivityMapper getActivityMapper() {
        return this.activityMapper;
    }

    public final void setActivityMapper(final ActivityMapper activityMapper) {
        this.activityMapper = activityMapper;
    }
	
	/**
	 * @return the applyMapper
	 */
	public ApplyMapper getApplyMapper() {
		return applyMapper;
	}

	/**
	 * @param applyMapper the applyMapper to set
	 */
	public void setApplyMapper(ApplyMapper applyMapper) {
		this.applyMapper = applyMapper;
	}

	/**
	 * @return the collectMapper
	 */
	public CollectMapper getCollectMapper() {
		return collectMapper;
	}

	/**
	 * @param collectMapper the collectMapper to set
	 */
	public void setCollectMapper(CollectMapper collectMapper) {
		this.collectMapper = collectMapper;
	}

	@Override
	public int insertActivity(ActivityVO actVO) {
		if(StringUtils.isEmpty(actVO.getStarttime()) || StringUtils.isEmpty(actVO.getEndtime()) ||
				actVO.getPerson() == 0)
			return 0;
		
		return activityMapper.insertActivity(actVO.toPO());
	}

	@Override
	public boolean updateActivityStatus(ActivityConditionVO acVO) {
		if(acVO.getId() == 0)
			return false;
		return activityMapper.updateActStatus(acVO) != 0;
	}

	@Override
	public int insertApply(ApplyVO avo) {
		if(avo.getActivity() == 0 || avo.getPerson() == 0)
			return 0;
		Integer id = applyMapper.getApplyId(avo.getPerson(), avo.getActivity());
		if(id != null)
			return -1;
		id = applyMapper.insertApply(avo.toPO()); 
		if(id != 0) {
			ActivityConditionVO aco = new ActivityConditionVO();
			aco.setId(avo.getActivity());
			aco.setApplynum(1);
			activityMapper.updateActStatus(aco);
			
			updateActivityHotValue(getActDetail(avo.getActivity()));
		}
		return id;
	}

	@Override
	public boolean updateApplyStatus(int applyId, boolean check) {
		if(applyId == 0)
			return false;
		ApplyVO avo = new ApplyVO();
		avo.setId(applyId);
		if(check) {
			avo.setStatus(1);
		} else {
			avo.setStatus(0);
		}
		return applyMapper.updateStatus(avo) != 0;
	}

	@Override
	public List<ApplyShowVO> getApplyByActId(int actId) {
		if(actId == 0)
			return null;
		List<ApplyShowVO> ans = applyMapper.getApplyByActId(actId);
		if(ans == null || ans.isEmpty())
			return null;	
		return ans;
	}

	@Override
	public ActivityDetailVO getActDetail(int id) {
		if(id == 0)
			return null;
		ActivityDetailVO avo = activityMapper.getActDetail(id);
		if(avo == null)
			return null;
		ActivityConditionVO aco = new ActivityConditionVO();
		aco.setId(id);
		aco.setWatchnum(1);
		activityMapper.updateActStatus(aco);
		avo.setCandidate(getApplyByActId(id));
		updateActivityHotValue(avo);
		return avo;
	}

	@Override
	public List<ActivityListShow> getActByNew(ActivityLimitVO avo, int offset, int limit) {
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("school", avo.getSchool());
		condition.put("gender", avo.getGender());
		condition.put("grade", avo.getGrade());
		condition.put("type", avo.getType());
		condition.put("num", avo.getNum());
		condition.put("offset", offset);
		condition.put("limit", limit);
		List<ActivityListShow> ans = activityMapper.getActByNew(condition);
		if(ans == null || ans.isEmpty())
			return null;
		return ans;
	}

	@Override
	public int insertCollect(CollectVO colVO) {
		if(colVO.getActivity() == 0 || colVO.getPerson() == 0)
			return 0;
		Integer id = collectMapper.getCollectId(colVO.getPerson(), colVO.getActivity());
		if(id != null)
			return -1;
		id = collectMapper.insertCollect(colVO.toPO());
		if(id != 0) {
			ActivityConditionVO aco = new ActivityConditionVO();
			aco.setId(colVO.getActivity());
			aco.setCollectnum(1);
			activityMapper.updateActStatus(aco);
			updateActivityHotValue(getActDetail(colVO.getActivity()));
		}
		return id;
	}

	@Override
	public List<CollectShowVO> getUserCollects(int person, int offset, int limit) {
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("person", person);
		condition.put("offset",	offset);
		condition.put("limit", limit);
		List<CollectShowVO> ans = collectMapper.getCollects(condition);
		if(ans == null || ans.isEmpty())
			return null;
		return ans;
	}

	@Override
	public boolean delCollect(int person, int activity) {
		int num = collectMapper.delCollect(person, activity);
		if(num != 0) {
			ActivityConditionVO aco = new ActivityConditionVO();
			aco.setId(activity);
			aco.setCollectnum(-1);
			activityMapper.updateActStatus(aco);
			return true;
		}
		return false;
	}

	@Override
	public List<MyApplyVO> getUserApply(int person, int offset, int limit) {
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("person", person);
		condition.put("offset",	offset);
		condition.put("limit", limit);
		List<MyApplyVO> ans = applyMapper.getApplyByPerson(condition);
		if(ans == null || ans.isEmpty())
			return null;
		return ans;
	}

	@Override
	public boolean delApply(int person, int activity) {
		int num = applyMapper.delApply(person, activity);
		if(num != 0) {
			ActivityConditionVO aco = new ActivityConditionVO();
			aco.setId(activity);
			aco.setApplynum(-1);
			activityMapper.updateActStatus(aco);
			return true;
		}
		return false;
	}

	@Override
	public boolean isCollected(int person, int activity) {
		Integer id = collectMapper.getCollectId(person, activity);
		if(id == null)
			return false;
		return true;
	}

	@Override
	public List<ActivityListShow> getActByHot(ActivityLimitVO avo, int offset,
			int limit) {
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("school", avo.getSchool());
		condition.put("gender", avo.getGender());
		condition.put("grade", avo.getGrade());
		condition.put("type", avo.getType());
		condition.put("num", avo.getNum());
		condition.put("offset", offset);
		condition.put("limit", limit);
		List<ActivityListShow> ans = activityMapper.getActByHot(condition);
		if(ans == null || ans.isEmpty())
			return null;
		return ans;
	}

	@Override
	public List<ActivityListShow> getActBySuggest(ActivityLimitVO avo,
			int offset, int limit) {
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("school", avo.getSchool());
		condition.put("gender", avo.getGender());
		condition.put("grade", avo.getGrade());
		condition.put("type", avo.getType());
		condition.put("num", avo.getNum());
		condition.put("offset", offset);
		condition.put("limit", limit);
		List<ActivityListShow> ans = activityMapper.getActByHot(condition);
		if(ans == null || ans.isEmpty())
			return null;
		return ans;
	}
	
	private void updateActivityHotValue(ActivityDetailVO aVO) {
        int heat = 0;
        heat = aVO.getApplynum() + aVO.getCollectnum()*2 +aVO.getWatchnum()/5;
        ActivityConditionVO aco = new ActivityConditionVO();
        aco.setHotvalue(heat);
        activityMapper.updateActStatus(aco);
    }
}
