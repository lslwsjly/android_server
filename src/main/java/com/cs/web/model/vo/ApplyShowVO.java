/**
 * 
 */
package com.cs.web.model.vo;

/**
 * @author ZST
 *
 */
public class ApplyShowVO extends ApplyVO {

	/**
	 * 
	 */
	private String date = "";
	
	private AuthorVO author;
	
	public String getDate() {
		return this.date;
	}
	
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
