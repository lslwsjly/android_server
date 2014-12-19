/**
 * 
 */
package com.cs.dao.model;

/**
 * @author ZST
 *
 */
public class CollectPO extends BasePO {

	
	private int activity;
	
	private int person;


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
}
