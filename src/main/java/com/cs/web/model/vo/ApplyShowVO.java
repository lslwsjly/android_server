/**
 * 
 */
package com.cs.web.model.vo;

/**
 * 活动的申请列表
 * @author 李思良.
 *
 */
public class ApplyShowVO extends ApplyVO {

	private String date = "";
	
	private AuthorVO author;
	
	/**
	 * 
	 * @return 申请时间
	 */
	public String getDate() {
		return this.date;
	}
	/**
	 * 
	 * @param date 申请时间
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the author
	 */
	public AuthorVO getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(AuthorVO author) {
		this.author = author;
	}
}
