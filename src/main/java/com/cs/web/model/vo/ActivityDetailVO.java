/**
 * 
 */
package com.cs.web.model.vo;

import java.util.List;

/**
 * @author 李思良.
 *
 */
public class ActivityDetailVO extends ActivityVO {

	private List<ApplyShowVO> candidate = null;
	
	private AuthorVO author = null;
	
	private int status;
	
	private int collectnum;
	
	private int applynum;
	
	private int watchnum;
	
	private float hotvalue;
	
	/**
	 * @return the candidate
	 */
	public List<ApplyShowVO> getCandidate() {
		return candidate;
	}

	/**
	 * @param candidate the candidate to set
	 */
	public void setCandidate(List<ApplyShowVO> candidate) {
		this.candidate = candidate;
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

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the collectnum
	 */
	public int getCollectnum() {
		return collectnum;
	}

	/**
	 * @param collectnum the collectnum to set
	 */
	public void setCollectnum(int collectnum) {
		this.collectnum = collectnum;
	}

	/**
	 * @return the applynum
	 */
	public int getApplynum() {
		return applynum;
	}

	/**
	 * @param applynum the applynum to set
	 */
	public void setApplynum(int applynum) {
		this.applynum = applynum;
	}

	/**
	 * @return the watchnum
	 */
	public int getWatchnum() {
		return watchnum;
	}

	/**
	 * @param watchnum the watchnum to set
	 */
	public void setWatchnum(int watchnum) {
		this.watchnum = watchnum;
	}

	/**
	 * @return the hotvalue
	 */
	public float getHotvalue() {
		return hotvalue;
	}

	/**
	 * @param hotvalue the hotvalue to set
	 */
	public void setHotvalue(float hotvalue) {
		this.hotvalue = hotvalue;
	}

}
