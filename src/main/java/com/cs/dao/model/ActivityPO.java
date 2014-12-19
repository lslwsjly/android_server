/**
 * 
 */
package com.cs.dao.model;

/**
 * 活动持久对象.
 * @author 李思良.
 *
 */
public class ActivityPO extends BasePO {
	
	private String title = "";
	
	private int person = 0;
	
	private String acttime = "";
	
	private String starttime = "";
	
	private String endtime = "";
	
	private String applytime = "";
	
	
	private int numlimit = -1;
	
	private String address = "";
	
	private int fee = -1;
	
	private String benefit = "";
	
	private String feature = "";
	
	private String description = "";
	
	private int type = 0;
	
	private int schoollimit = -1;
	
	private int gradelimit = -1;
	
	private int genderlimit = -1;
	
	private String contact = "";
	
	private String image = "";

	/**
	 * @return 活动标题.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title 设置活动标题.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return 发布人id.
	 */
	public int getPerson() {
		return person;
	}

	/**
	 * @param person 设置发布人id.
	 */
	public void setPerson(int person) {
		this.person = person;
	}

	/**
	 * @return the acttime
	 */
	public String getActtime() {
		return acttime;
	}

	/**
	 * @param acttime the acttime to set
	 */
	public void setActtime(String acttime) {
		this.acttime = acttime;
	}

	/**
	 * @return 活动开始时间.
	 */
	public String getStarttime() {
		return starttime;
	}

	/**
	 * @param 设置活动开始时间.
	 */
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	/**
	 * @return 活动结束时间.
	 */
	public String getEndtime() {
		return endtime;
	}

	/**
	 * @param endtime 设置活动结束时间.
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	/**
	 * @return 申请结束时间.
	 */
	public String getApplytime() {
		return applytime;
	}

	/**
	 * @param 设置申请结束时间.
	 */
	public void setApplytime(String applytime) {
		this.applytime = applytime;
	}


	/**
	 * @return 最大参加人数.
	 */
	public int getNumlimit() {
		return numlimit;
	}

	/**
	 * @param numlimit 设置最大参加人数。0为不限制.
	 */
	public void setNumlimit(int numlimit) {
		this.numlimit = numlimit;
	}

	/**
	 * @return 活动地址.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address 活动地址.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return 费用.
	 */
	public int getFee() {
		return fee;
	}

	/**
	 * @param 费用.
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}

	/**
	 * @return 收益.
	 */
	public String getBenefit() {
		return benefit;
	}

	/**
	 * @param benefit 收益.
	 */
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	/**
	 * @return 特点.
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * @param feature 特点.
	 */
	public void setFeature(String feature) {
		this.feature = feature;
	}

	/**
	 * @return 描述.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description 描述.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return 类型.
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type 类型.
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return 学校限制.
	 */
	public int getSchoollimit() {
		return schoollimit;
	}

	/**
	 * @param schoollimit 学校限制.
	 */
	public void setSchoollimit(int schoollimit) {
		this.schoollimit = schoollimit;
	}

	/**
	 * @return 年级限制.
	 */
	public int getGradelimit() {
		return gradelimit;
	}

	/**
	 * @param gradelimit 年级限制.
	 */
	public void setGradelimit(int gradelimit) {
		this.gradelimit = gradelimit;
	}

	/**
	 * @return 性别限制.
	 */
	public int getGenderlimit() {
		return genderlimit;
	}

	/**
	 * @param genderlimit 性别限制.
	 */
	public void setGenderlimit(int genderlimit) {
		this.genderlimit = genderlimit;
	}

	/**
	 * @return 联系方式.
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact 联系方式.
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return 图片url.
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image 图片url.
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
}
