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
import com.cs.web.model.vo.CollectVO;

/**
 * @author ZST
 *
 */

@Controller
public class CollectController {

	@Autowired
	private ActivityFacade actFacade;
	
	@RequestMapping("collect/my/add")
	public ModelAndView addCollect(CollectVO cvo, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        cvo.setPerson((Integer) session.getAttribute("uid"));
        modelAndView.addObject("data", actFacade.insertCollect(cvo));
        return modelAndView;
	}
	
	@RequestMapping("collect/my/list")
	public ModelAndView listMy(int offset, int limit, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        modelAndView.addObject("data",actFacade.getUserCollect((Integer) session.getAttribute("uid"), offset, limit));
        return modelAndView;
	}
	
	@RequestMapping("collect/my/del")
	public ModelAndView delMy(int activity, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        modelAndView.addObject("data",actFacade.delCollect((Integer) session.getAttribute("uid"), activity));
        return modelAndView;
	}
}
