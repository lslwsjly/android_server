package com.cs.web.control.frontend;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.biz.utils.MySessionContext;
import com.cs.facade.UserFacade;
import com.cs.web.model.vo.ResponseVO;

@Controller
public class LoginController {
	
	@Autowired
	private UserFacade userFacade;
	
	@RequestMapping("/login")
	public final ModelAndView loginPage(final HttpServletRequest request, String mail, String pwd) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data", userFacade.login(mail, pwd, request.getSession()));
        return modelAndView;
	}
	
	
	@RequestMapping("/logout")
	public final ModelAndView logOut(final HttpServletRequest request, String key) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(key);
        MySessionContext.DelSession(session);
        ResponseVO response = new ResponseVO();
        response.setErrorcode(ResponseVO.SUCCESS);
        response.setMsg("注销成功");
        modelAndView.addObject("data", response.toJson());
        return modelAndView;
	}
}
