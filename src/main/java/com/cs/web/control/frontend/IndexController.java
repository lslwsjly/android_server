package com.cs.web.control.frontend;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.facade.HeaderFacade;

@Controller
public class IndexController {

	@Autowired
	private HeaderFacade headerFacade;
	@RequestMapping(value = "/")
	public final ModelAndView indexPage(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("header", headerFacade.getHeader(0, request.getSession()));
        return modelAndView;
	}
	
	@RequestMapping(value = "/help")
	public final ModelAndView helpPage(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("help");
        modelAndView.addObject("header", headerFacade.getHeader(0, request.getSession()));
        return modelAndView;
	}
}
