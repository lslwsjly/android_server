/**
 * 
 */
package com.cs.dao.model;

import com.cs.common.utils.DateUtils;

/**
 * @author 李思良
 *
 */
public class ApplyPO extends BasePO {

	/**
	 * 申请的id
	 */
	private int applyId = 0;
	
	/**
	 * 关联活动的id
	 */
	private int activityId = 0;
	
	/**
	 * 活动发布者id
	 */
	private int publisherId = 0;
	
	/**
	 * 申请者id
	 */
	private int candidateId = 0;
	
	/**
	 *  申请者姓名
	 */
	private String candidateName = "";
	
	/**
	 * 申请日期yyyy-MM-dd
	 */
	private String date = DateUtils.format(DateUtils.getNowDate(),
            DateUtils.DATE_FORMATTER_2);
	/**
	 * 申请状态，－1为未审核，0为被拒绝，1为审核通过
	 */
	private int status = -1;
	
	public int getPublisherId() {
		return this.publisherId;
	}
	
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	
	public int getCandidateId() {
		return this.candidateId;
	}
	
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	
	public String getCandidateName() {
		return this.candidateName;
	}
	
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
