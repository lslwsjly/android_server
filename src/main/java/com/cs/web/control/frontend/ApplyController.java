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
import com.cs.facade.ActivityFacade;
import com.cs.web.model.vo.ApplyVO;

/**
 * @author ZST
 *
 */

@Controller
public class ApplyController {

	@Autowired
	private ActivityFacade actFacade;
	
	@RequestMapping("apply/action/add")
	public ModelAndView addApply(ApplyVO avo, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        avo.setPerson((Integer) session.getAttribute("uid"));
        modelAndView.addObject("data", actFacade.insertApply(avo));
        return modelAndView;
	}
	
	@RequestMapping("apply/action/del")
	public ModelAndView delApply(int activity, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        modelAndView.addObject("data", actFacade.delApply((Integer) session.getAttribute("uid"), activity));
        return modelAndView;
	}
	
	@RequestMapping("apply/action/list")
	public ModelAndView listMy(int offset, int limit, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        modelAndView.addObject("data",actFacade.getUserApply((Integer) session.getAttribute("uid"), offset, limit));
        return modelAndView;
	}
	
	@RequestMapping("apply/action/check")
	public ModelAndView check(int id, int check, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data",actFacade.applyCheck(id, check != 0));
        return modelAndView;
	}
}
