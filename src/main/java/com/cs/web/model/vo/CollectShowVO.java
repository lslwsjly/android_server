/**
 * 
 */
package com.cs.web.model.vo;

/**
 * @author 李思良.
 *
 */
public class CollectShowVO extends BaseVO {

	private int id;
	
	private CollectActVO activity;
	
	private String date;

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
	public CollectActVO getActivity() {
		return activity;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setActivity(CollectActVO activity) {
		this.activity = activity;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
}
