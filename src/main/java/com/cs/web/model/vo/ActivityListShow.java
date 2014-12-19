/**
 * 
 */
package com.cs.web.model.vo;

/**
 * 活动列表
 * @author 李思良.
 *
 */
public class ActivityListShow extends BaseVO {

	private int id;
	
	private String image;
	
	private String title;
	
	private String acttime;
	
	private int applynum;
	
	private int collectnum;
	
	private int watchnum;
	
	private String description;
	
	private AuthorVO author;

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
	 * @return 图片
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image 图片
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return 标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title 标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return 发布时间
	 */
	public String getActtime() {
		return acttime;
	}

	/**
	 * @param acttime 发布时间
	 */
	public void setActtime(String acttime) {
		this.acttime = acttime;
	}

	/**
	 * @return 申请人数
	 */
	public int getApplynum() {
		return applynum;
	}

	/**
	 * @param applynum 申请人数
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
	 * @return 活动介绍
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description 活动介绍
	 */
	public void setDescription(String description) {
		this.description = description;
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
}
