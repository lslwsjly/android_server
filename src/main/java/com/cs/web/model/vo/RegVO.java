package com.cs.web.model.vo;

import com.cs.dao.model.UserPO;

/**
 * 注册模型
 * @author 李思良.
 *
 */
public class RegVO extends BaseVO{

    private String mail = "";

    private String password = "";
    
    private String nickname = "";
    
    private String interest = "";
    
    private int role = 0;


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
    /**
     * 持久化
     * @return 持久对象
     */
    public UserPO toPO() {
    	UserPO user = new UserPO();
    	user.setMail(this.mail);
    	user.setPassword(this.password);
    	user.setNickname(this.nickname);
    	user.setInterest(this.interest);
    	user.setRole(this.role);
    	return user;
    }
}
