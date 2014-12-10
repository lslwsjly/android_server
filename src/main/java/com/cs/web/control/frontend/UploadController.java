package com.cs.web.control.frontend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.cs.biz.utils.MySessionContext;
import com.cs.facade.UploadFacade;

@Controller
public class UploadController {

	@Autowired
	private UploadFacade uploadFacade;
	
	
	@RequestMapping(value = "upload/image")
    public final ModelAndView upload(
            final HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		MultipartHttpServletRequest multipartRequest = resolver.resolveMultipart(request);
		HttpSession session = MySessionContext.getSession(multipartRequest.getParameter("token"));
        modelAndView.addObject("data", uploadFacade.upload(multipartRequest, (Integer) session.getAttribute("uid"), Integer.parseInt(multipartRequest.getParameter("max"))));
        return modelAndView;
        
    }
}
