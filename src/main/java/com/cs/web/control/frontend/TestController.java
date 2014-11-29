package com.cs.web.control.frontend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.metadata.TableParameterMetaData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cs.biz.utils.MySessionContext;
import com.cs.common.utils.DateUtils;
import com.cs.dao.model.UserPO;
import com.cs.facade.ActivityFacade;
import com.cs.facade.MsgFacade;
import com.cs.facade.UploadFacade;
import com.cs.facade.UserFacade;
import com.cs.web.model.vo.ActivityVO;
import com.cs.web.model.vo.ApplyVO;
import com.cs.web.model.vo.MsgVO;
import com.cs.web.model.vo.RegVO;
import com.cs.web.model.vo.UserVO;

@Controller
public class TestController {

	@Autowired
	private UserFacade userFacade;
	
	@Autowired
    private UploadFacade uploadFacade;
	
	
	@Autowired
	private MsgFacade msgFacade;
	
	@Autowired
	private ActivityFacade actFacade;
	
	@RequestMapping(value = "/test")
    public final ModelAndView getFriend(final HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        

        
//        modelAndView.addObject("data", actFacade.getActByNew(0, 1));
		return modelAndView;
    }
	
	

    
    /**
     * 上传.
     * @param dir 目录
     * @param request 请求
     * @param response 响应
     * @return 页面
     */
    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/upload")
    public final ModelAndView upload(
            final HttpServletRequest request
            , final HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            if (!ServletFileUpload.isMultipartContent(request)) {
                out.println(uploadFacade.getError("请选择文件。"));
                return null;
            }
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload =
                    new ServletFileUpload(factory);
            upload.setHeaderEncoding("UTF-8");
            List items = upload.parseRequest(request);
            String savePath = request.getSession(
                    ).getServletContext()
                    .getRealPath("/")
                    + "WEB-INF/img/";
            String saveUrl = request.getContextPath() + "/img/";
            out.println(uploadFacade.uploadFile(
                    savePath, saveUrl, items));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
         
}
