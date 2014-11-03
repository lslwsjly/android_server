package com.cs.web.control.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cs.facade.UploadFacade;

@Controller
public class UploadController {

	@Autowired
	private UploadFacade uploadFacade;
	
	
}
