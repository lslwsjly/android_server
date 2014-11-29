package com.cs.facade;


import javax.servlet.http.HttpServletRequest;

/**
 * 上传接口.
 * @author 李思良
 */
public interface UploadFacade extends BaseFacade {
    
    String upload(HttpServletRequest request, int uid, int num);
}
