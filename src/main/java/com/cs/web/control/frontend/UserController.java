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
import com.cs.facade.UserFacade;
import com.cs.web.model.vo.RegVO;
import com.cs.web.model.vo.UserVO;

/**
 * @author ZST
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserFacade userFacade;
	
	@RequestMapping("user/my/manage")
	public ModelAndView manageMy(UserVO user, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        user.setId((Integer) session.getAttribute("uid"));
        user.setRole(0);
        modelAndView.addObject("data",userFacade.updateUser(user));
        return modelAndView;
	}
	
	@RequestMapping("admin/role")
	public ModelAndView role(UserVO user, String token) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        UserVO uv = new UserVO();
        uv.setId(user.getId());
        uv.setRole(user.getRole());
        modelAndView.addObject("data",userFacade.updateUser(uv));
        return modelAndView;
	}
	
	@RequestMapping("mailcheck")
	public ModelAndView mailCheck(String mail) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data",userFacade.mailCheck(mail));
        return modelAndView;
	}
	
	@RequestMapping("nickcheck")
	public ModelAndView nickCheck(String nickname) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        modelAndView.addObject("data",userFacade.checkNickname(nickname));
        return modelAndView;
	}
	
	@RequestMapping("reg")
	public ModelAndView regUsr(RegVO regVO) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        regVO.setRole(2);
        modelAndView.addObject("data",userFacade.regUser(regVO));
        return modelAndView;
	}
	
	@RequestMapping("admin/reg")
	public ModelAndView regAdmin(RegVO regVO) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        regVO.setRole(3);
        modelAndView.addObject("data",userFacade.regUser(regVO));
        return modelAndView;
	}
}
