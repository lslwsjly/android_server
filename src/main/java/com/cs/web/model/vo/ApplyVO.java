/**
 * 
 */
package com.cs.web.model.vo;

import com.cs.dao.model.ApplyPO;

/**
 * 申请
 * @author 李思良.
 *
 */
public class ApplyVO extends BaseVO {

	private int id = 0;

	private int activity = 0;

	private int person = 0;
	
	private int status = -1;
	
	
	
	/**
	 * @return 申请的id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id 申请的id
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return 关联活动的id
	 */
	public int getActivity() {
		return activity;
	}



	/**
	 * @param activity 关联活动的id
	 */
	public void setActivity(int activity) {
		this.activity = activity;
	}



	/**
	 * @return 申请者id
	 */
	public int getPerson() {
		return person;
	}



	/**
	 * @param person 申请者id
	 */
	public void setPerson(int person) {
		this.person = person;
	}



	/**
	 * @return 申请状态，2为未审核，0为被拒绝，1为审核通过
	 */
	public int getStatus() {
		return status;
	}



	/**
	 * @param status 申请状态，2为未审核，0为被拒绝，1为审核通过
	 */
	public void setStatus(int status) {
		this.status = status;
	}


	/**
	 * 申请持久化
	 * @return 持久对象
	 */
	public ApplyPO toPO() {
		ApplyPO apo = new ApplyPO();
		apo.setId(id);
		apo.setActivity(activity);
		apo.setPerson(person);
		apo.setStatus(status);
		return apo;
	}
}
