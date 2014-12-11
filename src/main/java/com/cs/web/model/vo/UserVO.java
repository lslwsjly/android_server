package com.cs.web.model.vo;

import com.cs.dao.model.UserPO;

/**
 * 用户VO.
 *
 * @author 李思良
 *
 */
public class UserVO {

	/**
     * 用户id.
     */
    private int id = 0;


    /**
     * 邮箱.
     */
    private String mail = "";

    /**
     * 密码.
     */
    private String password = "";

    /**
     * 真实姓名.
     */
    private String realname = "";

    /**
     * 电话.
     */
    private String phone = "";
    
    /**
     * 昵称.
     */
    private String nickname = "";
    
    /**
     * 爱好.
     */
    private String interest = "";
    
    /**
     * 性别.
     */
    private int gender = 0;
    
    /**
     * 学校.
     */
    private int school = 0;
    
    /**
     * 院系.
     */
    private String department = "";
    
    /**
     * 年级.
     */
    private int grade = 0;
    
    /**
     * 学号.
     */
    private String stunum = "";
    
    /**
     * 头像.
     */
    private String headimg = "";
    
    /**
     * 权限值.
     */
    private int privilege = 0;
    
    /**
     * 角色id.
     */
    private int role = 0;
    /**
     * @return 用户主键
     */
    public final int getId() {
        return this.id;
    }

    /**
     * @param id
     *            用户主键
     */
    public final void setId(final int id) {
        this.id = id;
    }


    /**
     * @return 用户邮箱
     */
    public final String getMail() {
        return this.mail;
    }

    /**
     * @param mail
     *            用户邮箱
     */
    public final void setMail(final String mail) {
        this.mail = mail;
    }

    /**
     * @return 用户密码
     */
    public final String getPassword() {
        return this.password;
    }

    /**
     * @param password
     *            用户密码
     */
    public final void setPassword(final String password) {
        this.password = password;
    }

    /**
     * @return 真实姓名
     */
    public final String getRealname() {
        return this.realname;
    }

    /**
     * @param realname
     *            真实姓名
     */
    public final void setRealname(final String realname) {
        this.realname = realname;
    }

    /**
     * @return 电话
     */
    public final String getPhone() {
        return this.phone;
    }

    /**
     * @param phone
     *            用户电话
     */
    public final void setPhone(final String phone) {
        this.phone = phone;
    }
    
    /**
     * @return 昵称
     */
    public final String getNickname() {
        return this.nickname;
    }

    /**
     * @param nickname
     *            昵称
     */
    public final void setNickname(final String nickname) {
        this.nickname = nickname;
    }
    
    /**
     * @return 用户兴趣
     */
    public final String getInterest() {
        return this.interest;
    }

    /**
     * @param interest
     *            用户兴趣
     */
    public final void setInterest(final String interest) {
        this.interest = interest;
    }
    
    /**
     * @return 性别
     */
    public final int getGender() {
        return this.gender;
    }

    /**
     * @param gender
     *            用户性别
     */
    public final void setGender(final int gender) {
        this.gender = gender;
    }
    
    /**
     * @return 学校
     */
    public final int getSchool() {
        return this.school;
    }

    /**
     * @param school
     *            用户学校
     */
    public final void setSchool(final int school) {
        this.school = school;
    }
    
    /**
     * @return 院系
     */
    public final String getDepartment() {
        return this.department;
    }

    /**
     * @param department
     *            用户院系
     */
    public final void setDepartment(final String department) {
        this.department = department;
    }
    
    /**
     * @return 年级
     */
    public final int getGrade() {
        return this.grade;
    }

    /**
     * @param grade
     *            用户年级
     */
    public final void setGrade(final int grade) {
        this.grade = grade;
    }
    
    /**
     * @return 头像
     */
    public final String getHeadimg() {
        return this.headimg;
    }

    /**
     * @param headimg
     *            用户头像
     */
    public final void setHeadimg(final String headimg) {
        this.headimg = headimg;
    }
    
    /**
     * @return 
     */
    public final String getStunum() {
        return this.stunum;
    }

    /**
     * @param newMail
     *            用户邮箱
     */
    public final void setStunum(final String stunum) {
        this.stunum = stunum;
    }
    
    /**
     * @return 权限
     */
    public final int getPrivilege() {
        return this.privilege;
    }

    /**
     * @param privilege
     *            权限
     */
    public final void setPrivilege(final int privilege) {
        this.privilege = privilege;
    }
    
    /**
     * @return 角色
     */
    public final int getRole() {
        return this.role;
    }

    /**
     * @param role
     *            用户角色
     */
    public final void setRole(final int role) {
        this.role = role;
    }
    
    public UserPO toPO() {
    	UserPO user = new UserPO();
    	user.setId(this.id);
    	user.setMail(this.mail);
    	user.setPassword(this.password);
    	user.setPhone(this.phone);
    	user.setRealname(this.realname);
    	user.setNickname(this.nickname);
    	user.setInterest(this.interest);
    	user.setGender(this.gender);
    	user.setSchool(this.school);
    	user.setDepartment(this.department);
    	user.setGrade(this.grade);
    	user.setStunum(this.stunum);
    	user.setRole(this.role);
    	user.setHeadimg(headimg);
    	return user;
    }
}
