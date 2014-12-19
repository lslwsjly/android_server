/**
 * 
 */
package com.cs.web.model.vo;

import java.util.List;

/**
 * 活动详情
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
	 * @return 申请人列表
	 */
	public List<ApplyShowVO> getCandidate() {
		return candidate;
	}

	/**
	 * @param candidate 申请人列表
	 */
	public void setCandidate(List<ApplyShowVO> candidate) {
		this.candidate = candidate;
	}

	/**
	 * @return 发布人
	 */
	public AuthorVO getAuthor() {
		return author;
	}

	/**
	 * @param author 发布人
	 */
	public void setAuthor(AuthorVO author) {
		this.author = author;
	}

	/**
	 * @return 活动状态
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status 活动状态
	 */
	public void setStatus(int status) {
		this.status = status;
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
	 * @return 申请数
	 */
	public int getApplynum() {
		return applynum;
	}

	/**
	 * @param applynum 申请数
	 */
	public void setApplynum(int applynum) {
		this.applynum = applynum;
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
	public float getHotvalue() {
		return hotvalue;
	}

	/**
	 * @param hotvalue 热度值
	 */
	public void setHotvalue(float hotvalue) {
		this.hotvalue = hotvalue;
	}

}
