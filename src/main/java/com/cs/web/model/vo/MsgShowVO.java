/**
 * 
 */
package com.cs.web.model.vo;

/**
 * @author 李思良
 *
 */
public class MsgShowVO extends MsgVO {

	/**
	 * 发布日期.
	 */
	private String date;
	
	/**
	 * 发布者.
	 */
	private AuthorVO author;
	
	public String getDate() {
		return this.date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public AuthorVO getAuthor() {
		return this.author;
	}
	
	public void setAuthor(AuthorVO author) {
		this.author = author;
	}
}
