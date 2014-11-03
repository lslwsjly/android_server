package com.cs.facade;

import java.util.List;

/**
 * 上传接口.
 * @author 李思良
 */
public interface UploadFacade extends BaseFacade {

    /**
     * 上传文件.
     * @param savePath
     *            保存在服务器的路径
     * @param saveUrl
     *            网络地址
     * @param dirName
     *            本地地址
     * @param items
     *            文件列表
     * @return 上传信息
     */
    String uploadFile(String savePath, String saveUrl, 
            @SuppressWarnings("rawtypes") List items);

    /**
     * 报错信息.
     * @param message 消息
     * @return json字符串
     */
    String getError(String message);
}
