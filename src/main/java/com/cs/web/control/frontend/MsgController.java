/**
 * 
 */
package com.cs.web.control.frontend;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.biz.utils.MySessionContext;
import com.cs.facade.MsgFacade;
import com.cs.web.model.vo.MsgVO;

/**
 * 留言系统.
 * @author 李思良.
 *
 *
 * 提供发布留言，查看特定活动留言，查看自己的留言功能.
 * 测试正确.
 */
@Controller
public class MsgController {

	@Autowired
	private MsgFacade msgFacade;
	
	@RequestMapping("/msg/publish")
	public ModelAndView publish(MsgVO msg, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        msg.setUid((Integer) session.getAttribute("uid"));
        modelAndView.addObject("data", msgFacade.insertMsg(msg));
        return modelAndView;
	}
	
	@RequestMapping("msg/list")
	public ModelAndView listMsg(int actid, int offset, int limit) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data", msgFacade.getMsgByAct(actid, offset, limit));
        return modelAndView;
	}
	
	@RequestMapping("msg/my/list")
	public ModelAndView listMy(int offset, int limit, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        modelAndView.addObject("data", msgFacade.getMsgByUser((Integer) session.getAttribute("uid"), offset, limit));
        return modelAndView;
	}
}
