/**
 * 
 */
package com.cs.web.model.vo;

/**
 * 个人申请列表
 * @author 李思良.
 *
 */
public class MyApplyVO extends BaseVO {

	private int id;
	
	private int status;
	
	private String date;
	
	private ApplyActVO activity;

	/**
	 * @return 主键
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id 主键
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return 申请状态
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status 申请状态
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return 申请时间
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date 申请时间
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return 活动
	 */
	public ApplyActVO getActivity() {
		return activity;
	}

	/**
	 * @param activity 活动
	 */
	public void setActivity(ApplyActVO activity) {
		this.activity = activity;
	}
}
