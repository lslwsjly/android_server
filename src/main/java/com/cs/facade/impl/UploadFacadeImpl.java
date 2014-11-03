package com.cs.facade.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.commons.fileupload.FileItem;
import org.json.simple.JSONObject;

import com.cs.facade.UploadFacade;

/**
 * @author 李思良 
 */
public class UploadFacadeImpl implements UploadFacade {

    /**
     * 数据宽度.
     */
    private final int width = 30;
    /**
     * 最大值.
     */
    private final long maxSize = 1 << width;
    /**
     * 后缀名.
     */
    private HashMap<String, String> extMap = new HashMap<String, String>() {
        /**
         * 持久化id.
         */
        private static final long serialVersionUID = 1L;

        {
            put("image", "gif,jpg,jpeg,png,bmp");
            put("flash", "swf,flv");
            put("media", "swf,flv,mp3,wav,mid,avi,mpg,rm");
            put("file", "doc,docx,xls,xlsx,ppt"
                    + ",pptx,htm,html,txt,zip,tar,pdf");
        }
    };

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public final String uploadFile(
            final String inSavePath, final String inSaveUrl
            , final List items) {

        // 检查目录
        String savePath = inSavePath;
        String saveUrl = inSaveUrl;
        if (savePath == null) {
            return getError("路径不存在");
        }
        File uploadDir = new File(savePath);
        if (!uploadDir.isDirectory()) {
            return getError("上传目录不存在。");
        }
        if (items == null) {
            return getError("文件不存在");
        }
        Iterator itr = items.iterator();
        if (!itr.hasNext()) {
            return getError("文件不存在");
        }
        String result = "";
        while (itr.hasNext()) {
            FileItem item = (FileItem) itr.next();
            String fileName = item.getName();
            if (!item.isFormField()) {
            	String fileExt = fileName.substring(
                        fileName.lastIndexOf(".")
                        + 1).toLowerCase();
                /*
                // 检查扩展名
                boolean finddir = false;
                
                for (String str : extMap.keySet()) {
                    if (Arrays.<String>
                    asList(extMap.get(str).split(","))
                            .contains(fileExt)) {
                        // 创建文件夹
                        savePath += str + File.separator;
                        saveUrl += str + "/";
                        finddir = true;
                        break;
                    }
                }
                if (!finddir) {
                    return getError("上传文件格式不支持。");
                }
                File saveDirFile = new File(savePath);
                if (!saveDirFile.exists()) {
                    saveDirFile.mkdirs();
                }
                SimpleDateFormat sdf =
                    new SimpleDateFormat("yyyyMMdd");
                String ymd = sdf.format(new Date());
                savePath += ymd + File.separator;
                saveUrl += ymd + "/";
                File dirFile = new File(savePath);
                if (!dirFile.exists()) {
                    dirFile.mkdirs();
                }
                */
                SimpleDateFormat df =
                    new SimpleDateFormat("yyyyMMddHHmmss");
                String newFileName = df.format(new Date()) + "_"
                        + new Random().nextInt(width)
                        + "." + fileExt;
                try {
                    File uploadedFile =
                        new File(savePath
                                , newFileName);
                    item.write(uploadedFile);
                } catch (Exception e) {
                    return getError("上传文件失败。");
                }

                JSONObject obj = new JSONObject();
                obj.put("error", 0);
                obj.put("url", newFileName);
                result += obj.toJSONString() + "\n";
            }
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public final String getError(
            final String message) {
        JSONObject obj = new JSONObject();
        obj.put("error", 1);
        obj.put("message", message);
        return obj.toJSONString();
    }

}
