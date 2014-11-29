package com.cs.web.control.frontend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.biz.utils.MySessionContext;
import com.cs.facade.UploadFacade;

@Controller
public class UploadController {

	@Autowired
	private UploadFacade uploadFacade;
	
	
	@RequestMapping(value = "upload/my/image")
    public final ModelAndView upload(
            final HttpServletRequest request, String token, int max) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        HttpSession session = MySessionContext.getSession(token);
        modelAndView.addObject("data", uploadFacade.upload(request, (Integer) session.getAttribute("uid"), max));
        return modelAndView;
        
    }
}
