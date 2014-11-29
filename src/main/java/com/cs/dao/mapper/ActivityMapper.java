/**
 * 
 */
package com.cs.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.ActivityPO;
import com.cs.web.model.vo.ActivityConditionVO;
import com.cs.web.model.vo.ActivityDetailVO;
import com.cs.web.model.vo.ActivityListShow;

/**
 * @author 李思良.
 *
 */
public interface ActivityMapper extends BaseMapper {

	public int insertActivity(ActivityPO actPO);
	
	public int updateActStatus(ActivityConditionVO acVO);
	
	public ActivityDetailVO getActDetail(int id);
	
	public List<ActivityListShow> getActByNew(HashMap<String, Integer> condition);
	
	
}
