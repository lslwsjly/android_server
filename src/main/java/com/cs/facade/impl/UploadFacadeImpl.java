package com.cs.facade.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.cs.facade.UploadFacade;
import com.cs.web.model.vo.ResponseVO;

/**
 * @author 李思良 
 */
public class UploadFacadeImpl implements UploadFacade {

    
    private ArrayList<String> ext = new ArrayList<String>();


	@Override
	public String upload(MultipartHttpServletRequest multipartRequest, int uid, int num) {
		if(ext.isEmpty()) {
			ext.add("jpg");
			ext.add("jpeg");
			ext.add("png");
			ext.add("gif");
		}
		ResponseVO response = new ResponseVO();
		String ans = "";
		System.out.println(multipartRequest.getParameter("max"));
		try {
			for(int i = 0; i < num; i++) {
				MultipartFile file = multipartRequest.getFile("file"+i);
				String fileName = file.getOriginalFilename();
				String et = fileName.substring(fileName.lastIndexOf(".")+1,fileName.length()).toLowerCase();
				if(!ext.contains(et)) {
					response.setErrorcode(ResponseVO.FORMATWRONG);
					response.setMsg("文件格式错误");
					return response.toJson();
				}
				String savePath = multipartRequest.getSession().getServletContext().getRealPath("/") + "WEB-INF/img/";
				SimpleDateFormat df = new SimpleDateFormat("yyddHHmmss");
	            String newFileName = "u_"+uid+"_" + df.format(new Date()) + "_" + i + "." + et;
				File saveFile = new File(savePath, newFileName);
				file.transferTo(saveFile);
				if(i == 0)
					ans = newFileName;
				else
					ans = ans + "," + newFileName;
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setErrorcode(ResponseVO.PARAWRONG);
			response.setMsg("上传失败");
			response.setData(e.getMessage());
			return response.toJson();
		}
		response.setErrorcode(ResponseVO.SUCCESS);
		response.setMsg("上传成功");
		response.setData(ans);
		return response.toJson();
	}
	

}
