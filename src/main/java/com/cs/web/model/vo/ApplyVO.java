/**
 * 
 */
package com.cs.web.model.vo;

import com.cs.dao.model.ApplyPO;

/**
 * @author 李思良.
 *
 */
public class ApplyVO extends BaseVO {

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



	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}



	public ApplyPO toPO() {
		ApplyPO apo = new ApplyPO();
		apo.setId(id);
		apo.setActivity(activity);
		apo.setPerson(person);
		apo.setStatus(status);
		return apo;
	}
}
