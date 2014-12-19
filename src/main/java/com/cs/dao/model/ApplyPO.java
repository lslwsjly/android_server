/**
 * 
 */
package com.cs.dao.model;


/**
 * 申请持久类.
 * @author 李思良.
 *
 */
public class ApplyPO extends BasePO {

	private int activity = 0;

	private int person = 0;

	private int status = -1;


	/**
	 * @return 活动id.
	 */
	public int getActivity() {
		return activity;
	}

	/**
	 * @param activity 活动id.
	 */
	public void setActivity(int activity) {
		this.activity = activity;
	}

	/**
	 * @return 申请人id.
	 */
	public int getPerson() {
		return person;
	}

	/**
	 * @param person 申请人id.
	 */
	public void setPerson(int person) {
		this.person = person;
	}
	
	/**
	 * 
	 * @return 申请状态，2为未审核，0为被拒绝，1为审核通过.
	 */
	public int getStatus() {
		return this.status;
	}
	/**
	 * 
	 * @param status 申请状态，2为未审核，0为被拒绝，1为审核通过.
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
}
