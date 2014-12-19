/**
 * 
 */
package com.cs.web.model.vo;

import com.cs.web.model.vo.BaseVO;

/**
 * 活动状态值
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
	 * @return 主键
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id 主键
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return 状态
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status 状态
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return 参加数
	 */
	public int getApplynum() {
		return applynum;
	}

	/**
	 * @param applynum 参加数
	 */
	public void setApplynum(int applynum) {
		this.applynum = applynum;
	}

	/**
	 * @return 收藏数
	 */
	public int getCollectnum() {
		return collectnum;
	}

	/**
	 * @param collectnum 收藏数
	 */
	public void setCollectnum(int collectnum) {
		this.collectnum = collectnum;
	}

	/**
	 * @return 查看数
	 */
	public int getWatchnum() {
		return watchnum;
	}

	/**
	 * @param watchnum 查看数
	 */
	public void setWatchnum(int watchnum) {
		this.watchnum = watchnum;
	}

	/**
	 * @return 热度值
	 */
	public int getHotvalue() {
		return hotvalue;
	}

	/**
	 * @param hotvalue 热度值
	 */
	public void setHotvalue(int hotvalue) {
		this.hotvalue = hotvalue;
	}
}
