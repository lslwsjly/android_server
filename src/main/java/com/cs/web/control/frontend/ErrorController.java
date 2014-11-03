package com.cs.web.control.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.web.model.vo.ResponseVO;

@Controller
public class ErrorController {
	
	@RequestMapping(value = "/error")
	public final ModelAndView error() {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        ResponseVO response = new ResponseVO();
        response.setErrorcode(ResponseVO.PARAWRONG);
        response.setMsg("请求参数错误");
        modelAndView.addObject("data", response.toJson());
        return modelAndView;
	}
}
