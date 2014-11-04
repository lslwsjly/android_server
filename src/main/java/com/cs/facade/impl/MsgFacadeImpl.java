/**
 * 
 */
package com.cs.facade.impl;

import java.util.List;

import com.cs.biz.MsgManager;
import com.cs.facade.MsgFacade;
import com.cs.web.model.vo.MsgShowVO;
import com.cs.web.model.vo.MsgVO;
import com.cs.web.model.vo.ResponseVO;

/**
 * @author 李思良.
 *
 */
public class MsgFacadeImpl implements MsgFacade {

	/**
     * 调用的消息服务.
     */
    private MsgManager msgService;

    
    /**
     * @return 用户服务
     */
    public final MsgManager getMsgService() {
        return this.msgService;
    }

    /**
     * @param msgService
     *            服务设置
     */
    public final void setMsgService(final MsgManager msgService) {
        this.msgService = msgService;
    }
	
	@Override
	public String insertMsg(MsgVO msg) {
		ResponseVO response = new ResponseVO();
		int id = msgService.insertMsg(msg); 
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
	public String getMsgById(int id) {
		MsgShowVO show = msgService.getMsgById(id);
		ResponseVO response = new ResponseVO();
		if(show != null) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(show);
		} else {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		}
		return response.toJson();
	}

	@Override
	public String getMsgByAct(int id, int offset, int limit) {
		List<MsgShowVO> show = msgService.getMsgByAct(id, offset, limit);
		ResponseVO response = new ResponseVO();
		if(show != null) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(show);
		} else {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		}
		return response.toJson();
	}

	@Override
	public String getMsgByUser(int id, int offset, int limit) {
		List<MsgShowVO> show = msgService.getMsgByUser(id, offset, limit);
		ResponseVO response = new ResponseVO();
		if(show != null) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(show);
		} else {
			response.setErrorcode(ResponseVO.NOMSG);
			response.setMsg("失败");
		}
		return response.toJson();
	}

}
