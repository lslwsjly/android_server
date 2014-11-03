package com.cs.facade;

import javax.servlet.http.HttpSession;

import com.cs.web.model.vo.RegVO;
import com.cs.web.model.vo.UserVO;


/**
 * 用户页面接口.
 * @author 李思良
 */
public interface UserFacade extends BaseFacade {

	/**
	 * 邮箱验证.
	 * @param mail 邮箱
	 * @return json
	 */
    public String mailCheck(String mail);
    
    /**
     * 注册一般用户.
     * @param regVO 用户模型
     * @return json
     */
    public String regUser(RegVO regVO);
    
    /**
     * 注册管理员.
     * @param regVO 用户模型
     * @return
     */
    public String regAdmin(RegVO regVO);
 
    /**
     * 获取个人信息.
     * @param id 用户id
     * @return
     */
    public String getUserInfo(int id);
    
    /**
     * 删除用户.
     * @param id 用户id
     * @return
     */
    public String delUser(int id);
    
    /**
     * 更新用户信息.
     * @param user 用户信息
     * @return
     */
    public String updateUser(UserVO user);
    
    /**
     * 登录.
     * @param mail 邮箱
     * @param pwd 密码
     * @return 
     */
    public String login(String mail, String pwd, HttpSession session);
    
}
