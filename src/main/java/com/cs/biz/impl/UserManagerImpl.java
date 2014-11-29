package com.cs.biz.impl;

import java.util.HashMap;

import com.cs.biz.UserManager;
import com.cs.common.utils.StringUtils;
import com.cs.dao.mapper.UserMapper;
import com.cs.dao.model.UserPO;
import com.cs.web.model.vo.RegVO;
import com.cs.web.model.vo.UserVO;

/**
 * 用户业务接口实现.
 *
 * @author 李思良
 */
public class UserManagerImpl implements UserManager {

    /**
     * UserMapper.
     */
    private UserMapper userMapper;

    /**
     * UserMapper的get方法.
     *
     * @return UserMapper
     */
    public final UserMapper getUserMapper() {
        return this.userMapper;
    }

    /**
     * UserMapper的set方法.
     *
     * @param newUserMapper
     *            被set的UserMapper
     */
    public final void setUserMapper(final UserMapper newUserMapper) {
        this.userMapper = newUserMapper;
    }

    @Override
    public final int insertUser(final RegVO user) {
    	UserPO upo = user.toPO();
    	if(StringUtils.isEmpty(user.getMail()) || StringUtils.isEmpty(user.getPassword()) || StringUtils.isEmpty(user.getInterest()))
    		return 0;
    	userMapper.insertUser(upo);
        return upo.getId();
    }

    @Override
    public final boolean updateUser(final UserVO user) {
    	if(user.getId() == 0)
    		return false;
        return userMapper.updateUser(user.toPO()) != 0;
    }

    @Override
    public final boolean delUser(final int id) {
    	if(id == 0)
    		return false;
        return userMapper.delUser(id) != 0;
    }


	@Override
	public UserVO getUserById(int id) {
		if(id == 0)
			return null;
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("id", id);
		condition.put("mail", "");
		condition.put("nickname", "");
		UserPO upo = userMapper.getUser(condition);
		if(upo == null)
			return null;
		return upo.toVO();
	}

	@Override
	public UserVO getUserByMail(String mail) {
		if(StringUtils.isEmpty(mail))
			return null;
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("id", 0);
		condition.put("mail", mail);
		condition.put("nickname", "");
		UserPO upo = userMapper.getUser(condition);
		if(upo == null)
			return null;
		return upo.toVO();
	}

	@Override
	public UserVO getUserByNickname(String name) {
		if(StringUtils.isEmpty(name))
			return null;
		HashMap<String, Object> condition = new HashMap<String, Object>();
		condition.put("id", 0);
		condition.put("mail", "");
		condition.put("nickname", name);
		UserPO upo = userMapper.getUser(condition);
		if(upo == null)
			return null;
		return upo.toVO();
	}
    
}
