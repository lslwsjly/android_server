/**
 * 
 */
package com.cs.web.model.vo;

/**
 * 活动筛选
 * @author 李思良.
 *
 */
public class ActivityLimitVO {

	private int school = 0;
	
	private int grade = 0;
	
	private int gender = 0;
	
	private int type = 0;
	
	private int num = 0;

	/**
	 * @return 学校
	 */
	public int getSchool() {
		return school;
	}

	/**
	 * @param school 学校
	 */
	public void setSchool(int school) {
		this.school = school;
	}

	/**
	 * @return 年级
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade 年级
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return 性别
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender 性别
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @return 活动类型
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type 活动类型
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return 人数
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num 人数
	 */
	public void setNum(int num) {
		this.num = num;
	}
}
