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
import com.cs.web.model.vo.ActivityLimitVO;
import com.cs.web.model.vo.ActivityVO;

/**
 * @author ZST
 *
 */
@Controller
public class ActivityController {
	
	@Autowired
	ActivityFacade actFacade;
	
	@RequestMapping("activity/publish")
	public ModelAndView addAct(ActivityVO avo, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        avo.setPerson((Integer) session.getAttribute("uid"));
        modelAndView.addObject("data",actFacade.insertActivity(avo));
        return modelAndView;
	}
	
	@RequestMapping("activity/list/new")
	public ModelAndView listnew(ActivityLimitVO avo, int offset, int limit) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data",actFacade.getActByNew(avo, offset, limit));
        return modelAndView;
	}
	
	@RequestMapping("activity/detail")
	public ModelAndView getDetail(int id) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data",actFacade.getActivityDetail(id));
        return modelAndView;
	}
	@RequestMapping("activity/my/checkcollect")
	public ModelAndView checkCollect(int id, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        modelAndView.addObject("data",actFacade.checkCollect((Integer) session.getAttribute("uid"), id));
        return modelAndView;
	}
}
