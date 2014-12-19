/**
 * 
 */
package com.cs.web.model.vo;

/**
 * 消息列表
 * @author 李思良.
 *
 */
public class MsgShowVO extends MsgVO {

	private String date;
	
	private AuthorVO author;
	
	/**
	 * 
	 * @return 发布日期.
	 */
	public String getDate() {
		return this.date;
	}
	/**
	 * 
	 * @param date 发布日期.
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * 
	 * @return 发布者.
	 */
	public AuthorVO getAuthor() {
		return this.author;
	}
	/**
	 * 
	 * @param author 发布者.
	 */
	public void setAuthor(AuthorVO author) {
		this.author = author;
	}
}
