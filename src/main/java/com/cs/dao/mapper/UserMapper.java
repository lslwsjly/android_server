package com.cs.dao.mapper;

import java.util.HashMap;

import com.cs.dao.model.UserPO;

/**
 * 用户业务数据库接口.
 *
 * @author 李思良
 *
 */
public interface UserMapper extends BaseMapper {

	/**
     * 插入用户.
     *
     * @param user
     *            用户
     */
    void insertUser(UserPO user);

    /**
     * 更新用户.
     *
     * @param user
     *            用户
     */
    int updateUser(UserPO user);

    /**
     * 删除用户.
     *
     * @param id
     *            用户id
     */
    int delUser(int id);

    UserPO getUser(HashMap<String, Object> condition);
    
    
}
