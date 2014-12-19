package com.cs.web.model.vo;

import com.cs.common.utils.JacksonJsonUtil;


/**
 * 返回模型
 * @author 李思良
 *
 */
public class ResponseVO extends BaseVO{
	/**
	 * 成功.
	 */
	public static final int SUCCESS = 0;
	/**
	 * 参数错误.
	 */
	public static final int PARAWRONG = 100;
	
	/**
	 * 权限错误.
	 */
	public static final int NOPRIVILEGE = 101;
	
	/**
	 * 未登录.
	 */
	public static final int NOTLOGIN = 102;
	/**
	 * 注册邮箱重复.
	 */
	public static final int MAILREPEAT = 200;
	/**
	 * 邮箱格式错误.
	 */
	public static final int MAILFORMAT = 201;
	
	/**
	 * 昵称重复.
	 */
	public static final int NICKRPEAT = 202;
	/**
	 * 注册失败.
	 */
	public static final int REGWRONG = 103;
	
	/**
	 * 格式错误.
	 */
	public static final int FORMATWRONG = 104;
	
	/**
	 * 邮箱不存在.
	 */
	public static final int MAILERROR = 300;
	
	/**
	 * 密码错误.
	 */
	public static final int PWDERROR = 301;
	
	/**
	 * 用户不存在.
	 */
	public static final int NOUSER = 400;
	
	/**
	 * 
	 */
	public static final int NOMSG = 500;
	
	/**
	 * 已经操作.
	 */
	public static final int ALREADY = 600;
	
	private int errorcode;
	
	/**
	 * 错误信息
	 */
	private String msg;
	
	private Object data;
	
	/**
	 * 
	 * @return 错误代码.
	 */
	public int getErrorcode() {
		return this.errorcode;
	}
	/**
	 * 
	 * @param errorcode 错误代码.
	 */
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	/**
	 * 
	 * @return 信息
	 */
	public String getMsg() {
		return this.msg;
	}
	/**
	 * 
	 * @param msg 信息
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * 
	 * @return 数据
	 */
	public Object getData() {
		return this.data;
	}
	
	/**
	 * 
	 * @param data 数据
	 */
	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * 
	 * @return json化
	 */
	public String toJson() {
		return JacksonJsonUtil.beanToJson(this);
	}
}
