/**
 * 
 */
package com.cs.web.model.vo;

import com.cs.dao.model.CollectPO;

/**
 * @author 李思良.
 *
 */
public class CollectVO {

	private int id;
	
	private int activity;
	
	private int person;

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
	
	public CollectPO toPO() {
		CollectPO cpo = new CollectPO();
		cpo.setId(id);
		cpo.setActivity(activity);
		cpo.setPerson(person);
		return cpo;
	}
}
