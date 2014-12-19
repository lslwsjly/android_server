package com.cs.facade;

import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 上传接口.
 * @author 李思良
 */
public interface UploadFacade extends BaseFacade {
    
    String upload(MultipartHttpServletRequest multipartRequest, int uid, int num);
}
