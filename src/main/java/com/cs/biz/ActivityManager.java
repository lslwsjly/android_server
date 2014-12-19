package com.cs.biz;

import java.util.List;

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
 * 活动有关操作类.
 * @author 李思良(负责活动基本操作).
 * @author 黎军(负责热度算法和推荐算法).
 *
 */
public interface ActivityManager extends BaseManager {

	/**
	 * 添加活动.
	 * @param actVO 活动内容.
	 * @return 活动主键.
	 */
	public int insertActivity(ActivityVO actVO);
	/**
	 * 更新活动状态值.
	 * @param acVO 活动状态值.
	 * @return 是否成功.
	 */
	public boolean updateActivityStatus(ActivityConditionVO acVO);
	/**
	 * 添加申请.
	 * @param avo 申请.
	 * @return 申请id.
	 */
	public int insertApply(ApplyVO avo);
	
	/**
	 * 更新申请状态.
	 * @param applyId 申请id.
	 * @param check 是否通过.
	 * @return 是否成功.
	 */
	public boolean updateApplyStatus(int applyId, boolean check);
	
	/**
	 * 获取指定活动的所有申请.
	 * @param actId 活动id.
	 * @return 申请列表.
	 */
	public List<ApplyShowVO> getApplyByActId(int actId);
	
	/**
	 * 获取指定用户的所有申请.
	 * @param person 用户id.
	 * @param offset offset.
	 * @param limit limit.
	 * @return 用户申请列表.
	 */
	public List<MyApplyVO> getUserApply(int person, int offset, int limit);
	
	/**
	 * 删除指定用户对指定活动的申请.
	 * @param person 用户id.
	 * @param activity 活动id.
	 * @return 是否成功.
	 */
	public boolean delApply(int person, int activity);
	
	/**
	 * 获取指定活动详情.
	 * @param id 活动id.
	 * @return 活动详细信息.
	 */
	public ActivityDetailVO getActDetail(int id);
	/**
	 * 获取最新活动.
	 * @param avo 活动限制条件.
	 * @param offset offset.
	 * @param limit limit.
	 * @return 活动列表.
	 */
	public List<ActivityListShow> getActByNew(ActivityLimitVO avo, int offset, int limit);
	
	/**
	 * 获取最热活动.
	 * @param avo 活动限制条件.
	 * @param offset offset.
	 * @param limit limit.
	 * @return 活动列表.
	 */
	public List<ActivityListShow> getActByHot(ActivityLimitVO avo, int offset, int limit);
	/**
	 * 获取推荐活动.
	 * @param avo 活动限制条件.
	 * @param offset offset.
	 * @param limit limit.
	 * @return 活动列表.
	 */
	public List<ActivityListShow> getActBySuggest(ActivityLimitVO avo, int offset, int limit);
	/**
	 * 添加收藏.
	 * @param colVO 收藏.
	 * @return 收藏id.
	 */
	public int insertCollect(CollectVO colVO);
	
	/**
	 * 获取指定用户所有收藏.
	 * @param person 用户id.
	 * @param offset offset.
	 * @param limit limit.
	 * @return 收藏列表.
	 */
	public List<CollectShowVO> getUserCollects(int person, int offset, int limit);
	/**
	 * 删除收藏.
	 * @param person 用户id.
	 * @param activity 活动id.
	 * @return 是否成功.
	 */
	public boolean delCollect(int person, int activity);
	/**
	 * 判断是否已收藏.
	 * @param person 用户id.
	 * @param activity 活动id.
	 * @return 是否收藏.
	 */
	public boolean isCollected(int person, int activity);
}
