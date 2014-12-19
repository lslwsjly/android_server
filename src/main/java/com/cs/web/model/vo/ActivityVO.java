/**
 * 
 */
package com.cs.web.model.vo;

import com.cs.dao.model.ActivityPO;

/**
 * 活动信息
 * @author 李思良.
 *
 */
public class ActivityVO extends BaseVO {

	private int id = 0;
	
	private String title = "";
	
	private int person = 0;
	
	private String acttime = "";
	
	private String starttime = "";
	
	private String endtime = "";
	
	private String applytime = "";
	
	
	private int numlimit = 0;
	
	private String address = "";
	
	private int fee = 0;
	
	private String benefit = "";
	
	private String feature = "";
	
	private String description = "";
	
	private int type = 0;
	
	private int schoollimit = 0;
	
	private int gradelimit = 0;
	
	private int genderlimit = 0;
	
	private String contact = "";
	
	private String image = "";
	

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
	 * @return 发布人id
	 */
	public int getPerson() {
		return person;
	}

	/**
	 * @param person 发布人id
	 */
	public void setPerson(int person) {
		this.person = person;
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
	 * @return 开始时间
	 */
	public String getStarttime() {
		return starttime;
	}

	/**
	 * @param starttime 开始时间
	 */
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	/**
	 * @return 结束时间
	 */
	public String getEndtime() {
		return endtime;
	}

	/**
	 * @param endtime 结束时间
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	/**
	 * @return 应征时间
	 */
	public String getApplytime() {
		return applytime;
	}

	/**
	 * @param applytime 应征时间
	 */
	public void setApplytime(String applytime) {
		this.applytime = applytime;
	}


	/**
	 * @return 人数限制
	 */
	public int getNumlimit() {
		return numlimit;
	}

	/**
	 * @param numlimit 人数限制
	 */
	public void setNumlimit(int numlimit) {
		this.numlimit = numlimit;
	}

	/**
	 * @return 地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address 地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return 费用
	 */
	public int getFee() {
		return fee;
	}

	/**
	 * @param fee 费用
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}

	/**
	 * @return 收获
	 */
	public String getBenefit() {
		return benefit;
	}

	/**
	 * @param benefit 收获
	 */
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	/**
	 * @return 特点
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * @param feature 特点
	 */
	public void setFeature(String feature) {
		this.feature = feature;
	}

	/**
	 * @return 描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description 描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return 类型
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type 类型
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return 学校
	 */
	public int getSchoollimit() {
		return schoollimit;
	}

	/**
	 * @param schoollimit 学校
	 */
	public void setSchoollimit(int schoollimit) {
		this.schoollimit = schoollimit;
	}

	/**
	 * @return 年级
	 */
	public int getGradelimit() {
		return gradelimit;
	}

	/**
	 * @param gradelimit 年级
	 */
	public void setGradelimit(int gradelimit) {
		this.gradelimit = gradelimit;
	}

	/**
	 * @return 性别
	 */
	public int getGenderlimit() {
		return genderlimit;
	}

	/**
	 * @param genderlimit 性别
	 */
	public void setGenderlimit(int genderlimit) {
		this.genderlimit = genderlimit;
	}

	/**
	 * @return 联系方式
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact 联系方式
	 */
	public void setContact(String contact) {
		this.contact = contact;
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
	 * 持久化
	 * @return 持久对象
	 */
	public ActivityPO toPO() {
		ActivityPO actPO = new ActivityPO();
		actPO.setId(this.id);
		actPO.setTitle(this.title);
		actPO.setPerson(this.person);
		actPO.setStarttime(this.starttime);
		actPO.setEndtime(this.endtime);
		actPO.setApplytime(this.applytime);
		actPO.setNumlimit(this.numlimit);
		actPO.setAddress(this.address);
		actPO.setFee(this.fee);
		actPO.setGradelimit(this.gradelimit);
		actPO.setGenderlimit(this.genderlimit);
		actPO.setDescription(this.description);
		actPO.setType(this.type);
		actPO.setBenefit(this.benefit);
		actPO.setFeature(this.feature);
		actPO.setContact(this.contact);
		actPO.setSchoollimit(this.schoollimit);
		actPO.setId(this.id);
		actPO.setActtime(this.acttime);
		actPO.setImage(image);
		return actPO;
	}
}
