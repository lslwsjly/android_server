/**
 * 
 */
package com.cs.dao.model;


/**
 * @author 李思良
 *
 */
public class ApplyPO extends BasePO {

	/**
	 * 申请的id
	 */
	private int id = 0;
	
	/**
	 * 关联活动的id
	 */
	private int activity = 0;
	
	/**
	 * 申请者id
	 */
	private int person = 0;
	
	/**
	 * 申请状态，2为未审核，0为被拒绝，1为审核通过
	 */
	private int status = -1;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the activity
	 */
	public int getActivity() {
		return activity;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setActivity(int activity) {
		this.activity = activity;
	}

	/**
	 * @return the person
	 */
	public int getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(int person) {
		this.person = person;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
}
