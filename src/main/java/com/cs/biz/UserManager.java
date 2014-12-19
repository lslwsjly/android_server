package com.cs.biz;

import com.cs.biz.BaseManager;
import com.cs.web.model.vo.RegVO;
import com.cs.web.model.vo.UserVO;

/**
 * 用户业务处理.
 *
 * @author 李思良.
 *
 */
public interface UserManager extends BaseManager {

    /**
     * 添加用户.
     * @param user 用户.
     * @return 用户id.
     */
    public int insertUser(RegVO user);

   /**
    * 更新用户.
    * @param user 用户.
    * @return 是否成功.
    */
    public boolean updateUser(UserVO user);

    /**
     * 删除用户.
     * @param id 用户id.
     * @return 是否成功.
     */
    public boolean delUser(int id);

    /**
     * 
     * 根据id查找用户.
     * @param id 用户id.
     * @return 用户.
     */
    public UserVO getUserById(int id);

    /**
     * 根据邮箱查找用户.
     * @param mail 邮箱.
     * @return 用户.
     */
    public UserVO getUserByMail(String mail);
    /**
     * 根据昵称查找用户.
     * @param name 用户昵称.
     * @return 用户.
     */
    public UserVO getUserByNickname(String name);
}
