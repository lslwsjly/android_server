/**
 * 
 */
package com.cs.facade.impl;

import java.util.List;

import com.cs.biz.ActivityManager;
import com.cs.facade.ActivityFacade;
import com.cs.web.model.vo.ActivityConditionVO;
import com.cs.web.model.vo.ActivityDetailVO;
import com.cs.web.model.vo.ActivityListShow;
import com.cs.web.model.vo.ActivityVO;
import com.cs.web.model.vo.ApplyVO;
import com.cs.web.model.vo.CollectShowVO;
import com.cs.web.model.vo.CollectVO;
import com.cs.web.model.vo.MyApplyVO;
import com.cs.web.model.vo.ResponseVO;

/**
 * @author 李思良
 *
 */
public class ActivityFacadeImpl implements ActivityFacade {

	/**
     * 调用的消息服务.
     */
    private ActivityManager activityService;

    
    /**
     * @return 用户服务
     */
    public final ActivityManager getActivityService() {
        return this.activityService;
    }

    /**
     * @param activityService
     *            服务设置
     */
    public final void setActivityService(final ActivityManager activityService) {
        this.activityService = activityService;
    }
	
	@Override
	public void hotAnalysis()  {
		
	}

	@Override
	public String insertActivity(ActivityVO actVO) {
		ResponseVO response = new ResponseVO();
		int id = activityService.insertActivity(actVO); 
		if(id !=0) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(id);
		} else {
			response.setErrorcode(ResponseVO.PARAWRONG);
			response.setMsg("失败");
		}
		return response.toJson();
	}

	@Override
	public void test() {
		ActivityConditionVO acVO = new ActivityConditionVO();
		acVO.setId(1);
		acVO.setStatus(1);
		acVO.setWatchnum(2);
		activityService.updateActivityStatus(acVO);
	}

	@Override
	public String insertApply(ApplyVO avo) {
		ResponseVO response = new ResponseVO();
		int id = activityService.insertApply(avo); 
		if(id > 0) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(id);
		} else if(id == 0){
			response.setErrorcode(ResponseVO.PARAWRONG);
			response.setMsg("失败");
		} else {
			response.setErrorcode(ResponseVO.ALREADY);
			response.setMsg("已经申请");
		}
		return response.toJson();
	}

	@Override
	public String applyCheck(int applyId, boolean check) {
		ResponseVO response = new ResponseVO();
		if(activityService.updateApplyStatus(applyId, check)) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
		} else {
			response.setErrorcode(ResponseVO.PARAWRONG);
			response.setMsg("失败");
		}
		return response.toJson();
	}

	@Override
	public String getActivityDetail(int id) {
		ResponseVO response = new ResponseVO();
		ActivityDetailVO apo = activityService.getActDetail(id);
		if(apo == null) {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		} else {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(apo);
		}
		return response.toJson();
	}

	@Override
	public String getActByNew(int offset, int limit) {
		ResponseVO response = new ResponseVO();
		List<ActivityListShow> ans = activityService.getActByNew(offset, limit);
		if(ans == null) {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		} else {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(ans);
		}
		return response.toJson();
	}

	@Override
	public String insertCollect(CollectVO cvo) {
		ResponseVO response = new ResponseVO();
		int id = activityService.insertCollect(cvo);
		if(id > 0) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(id);
		} else if(id == 0){
			response.setErrorcode(ResponseVO.PARAWRONG);
			response.setMsg("失败");
		} else {
			response.setErrorcode(ResponseVO.ALREADY);
			response.setMsg("已经收藏");
		}
		return response.toJson();
	}

	@Override
	public String getUserCollect(int person, int offset, int limit) {
		ResponseVO response = new ResponseVO();
		List<CollectShowVO> ans = activityService.getUserCollects(person, offset, limit);
		if(ans == null) {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		} else {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(ans);
		}
		return response.toJson();
	}

	@Override
	public String delCollect(int person, int activity) {
		ResponseVO response = new ResponseVO();
		if(activityService.delCollect(person, activity)) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
		} else {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		}
		return response.toJson();
	}

	@Override
	public String getUserApply(int person, int offset, int limit) {
		ResponseVO response = new ResponseVO();
		List<MyApplyVO> ans = activityService.getUserApply(person, offset, limit);
		if(ans == null) {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		} else {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(ans);
		}
		return response.toJson();
	}

	@Override
	public String delApply(int person, int activity) {
		ResponseVO response = new ResponseVO();
		if(activityService.delApply(person, activity)) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
		} else {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		}
		return response.toJson();
	}

	
}
