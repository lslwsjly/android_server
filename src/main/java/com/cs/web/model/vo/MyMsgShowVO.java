/**
 * 
 */
package com.cs.web.model.vo;

/**
 * @author 李思良.
 *
 */
public class MyMsgShowVO extends MsgVO {

	private String date;

	private MyMsgActVO activity;

	/**
	 * @return 发布日期.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date 发布日期.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return 活动
	 */
	public MyMsgActVO getActivity() {
		return activity;
	}

	/**
	 * @param activity 活动
	 */
	public void setActivity(MyMsgActVO activity) {
		this.activity = activity;
	}
}
