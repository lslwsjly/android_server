/**
 * 
 */
package com.cs.web.model.vo;

/**
 * @author 李思良.
 *
 */
public class MyMsgShowVO extends MsgVO {

	/**
	 * 发布日期.
	 */
	private String date;
	
	private MyMsgActVO activity;

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

	/**
	 * @return the activity
	 */
	public MyMsgActVO getActivity() {
		return activity;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setActivity(MyMsgActVO activity) {
		this.activity = activity;
	}
}
