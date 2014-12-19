/**
 * 
 */
package com.cs.biz.impl;

import java.util.HashMap;
import java.util.List;

import com.cs.biz.MsgManager;
import com.cs.dao.mapper.MsgMapper;
import com.cs.web.model.vo.MsgShowVO;
import com.cs.web.model.vo.MsgVO;

/**
 * 消息接口实现.
 * @author 李思良.
 *
 */
public class MsgManagerImpl implements MsgManager {

    private MsgMapper msgMapper;


    public final MsgMapper getMsgMapper() {
        return this.msgMapper;
    }

    public final void setMsgMapper(final MsgMapper msgMapper) {
        this.msgMapper = msgMapper;
    }
	
	@Override
	public int insertMsg(MsgVO msg) {
		return msgMapper.insertMsg(msg.toPO());
	}

	@Override
	public boolean delMsgById(int id) {
		if(id == 0)
			return false;
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("id", id);
		condition.put("actid", 0);
		condition.put("uid", 0);
		return msgMapper.delMsg(condition) != 0;
	}

	@Override
	public boolean delMsgByAct(int id) {
		if(id == 0)
			return false;
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("id", 0);
		condition.put("actid", id);
		condition.put("uid", 0);
		return msgMapper.delMsg(condition) != 0;
	}

	@Override
	public boolean delMsgByUser(int id) {
		if(id == 0)
			return false;
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("id", 0);
		condition.put("actid", 0);
		condition.put("uid", id);
		return msgMapper.delMsg(condition) != 0;
	}

	@Override
	public MsgShowVO getMsgById(int id) {
		if(id == 0)
			return null;
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("id", id);
		condition.put("offset", 0);
		condition.put("limit", 1);
		List<MsgShowVO> ans = msgMapper.getMsgById(condition);
		if(ans == null || ans.isEmpty())
			return null;	
		return ans.get(0);
	}

	@Override
	public List<MsgShowVO> getMsgByAct(int id, int offset, int limit) {
		if(id == 0)
			return null;
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("actid", id);
		condition.put("offset", offset);
		condition.put("limit", limit);
		List<MsgShowVO> ans = msgMapper.getMsgByActId(condition);
		if(ans == null || ans.isEmpty())
			return null;	
		return ans;
	}

	@Override
	public List<MsgShowVO> getMsgByUser(int id, int offset, int limit) {
		if(id == 0)
			return null;
		HashMap<String, Integer> condition = new HashMap<String, Integer>();
		condition.put("uid", id);
		condition.put("offset", offset);
		condition.put("limit", limit);
		List<MsgShowVO> ans = msgMapper.getMsgByUserId(condition);
		if(ans == null || ans.isEmpty())
			return null;	
		return ans;
	}

}
