/**
 * 
 */
package com.cs.web.control.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.facade.ActivityFacade;
import com.cs.web.model.vo.ActivityLimitVO;

/**
 * @author 李思良.
 *
 */
@RequestMapping("api")
public class ApiController {

	@Autowired
	ActivityFacade actFacade;
	
	@RequestMapping("/new")
	public ModelAndView listNew(ActivityLimitVO avo, int offset, int limit) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data",actFacade.getActByNew(avo, offset, limit));
        return modelAndView;
	}
	
	@RequestMapping("/hot")
	public ModelAndView listHot(ActivityLimitVO avo, int offset, int limit) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data",actFacade.getActByHot(avo, offset, limit));
        return modelAndView;
	}
	
	@RequestMapping("/detail")
	public ModelAndView getDetail(int id) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data",actFacade.getActivityDetail(id));
        return modelAndView;
	}
}
