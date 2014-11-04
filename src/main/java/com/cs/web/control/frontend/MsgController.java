/**
 * 
 */
package com.cs.web.control.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.facade.MsgFacade;
import com.cs.web.model.vo.MsgVO;

/**
 * @author 李思良.
 *
 */
@Controller
public class MsgController {

	@Autowired
	private MsgFacade msgFacade;
	
	@RequestMapping("/msg/publish")
	public ModelAndView publish(MsgVO msg) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data", msgFacade.insertMsg(msg));
        return modelAndView;
	}
	
	public ModelAndView searchNewest()
}
