/**
 * 
 */
package com.cs.web.model.vo;

import com.cs.web.model.vo.BaseVO;

/**
 * @author 李思良.
 *
 */
public class ActivityConditionVO extends BaseVO {

	private int id = 0;
	
	private int status = -1;
	
	private int applynum = 0;
	
	private int collectnum = 0;
	
	private int watchnum = 0;
	
	private int hotvalue = -1;

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
	public int getHotvalue() {
		return hotvalue;
	}

	/**
	 * @param hotvalue the hotvalue to set
	 */
	public void setHotvalue(int hotvalue) {
		this.hotvalue = hotvalue;
	}
}
