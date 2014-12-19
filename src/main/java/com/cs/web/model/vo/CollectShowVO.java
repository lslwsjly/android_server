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
	 * @return 收藏id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id 收藏id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return 活动
	 */
	public CollectActVO getActivity() {
		return activity;
	}

	/**
	 * @param activity 活动
	 */
	public void setActivity(CollectActVO activity) {
		this.activity = activity;
	}

	/**
	 * @return 收藏时间
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date 收藏时间
	 */
	public void setDate(String date) {
		this.date = date;
	}
}
