package com.cs.facade.impl;


import java.util.HashMap;

import javax.servlet.http.HttpSession;

import com.cs.biz.UserManager;
import com.cs.common.utils.ToolUtils;
import com.cs.facade.UserFacade;
import com.cs.web.model.vo.RegVO;
import com.cs.web.model.vo.ResponseVO;
import com.cs.web.model.vo.UserVO;

/**
 * 用户页面接口实现.
 * @author 李思良
 */
public class UserFacadeImpl implements UserFacade {

    /**
     * 调用的用户服务.
     */
    private UserManager userService;

    
    /**
     * @return 用户服务
     */
    public final UserManager getUserService() {
        return this.userService;
    }

    /**
     * @param inUserService
     *            服务设置
     */
    public final void setUserService(final UserManager inUserService) {
        this.userService = inUserService;
    }

	@Override
	public String mailCheck(String mail) {
		ResponseVO response = new ResponseVO();
		if(!ToolUtils.isMail(mail)) {
			response.setErrorcode(ResponseVO.MAILFORMAT);
			response.setMsg("邮箱格式错误");
			return response.toJson();
		}
		if(userService.getUserByMail(mail) != null) {
			response.setErrorcode(ResponseVO.MAILREPEAT);
			response.setMsg("注册邮箱重复");
			return response.toJson();
		}
		response.setErrorcode(ResponseVO.SUCCESS);
		response.setMsg("注册邮箱可用");
		return response.toJson();
	}

	@Override
	public String regUser(RegVO user) {
		ResponseVO response = new ResponseVO();
		if(userService.insertUser(user) != 0) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("注册成功");
		} else {
			response.setErrorcode(ResponseVO.REGWRONG);
			response.setMsg("注册失败");
		}
		return response.toJson();
	}
	

	@Override
	public String getUserInfo(int id) {
		UserVO user = userService.getUserById(id);
		ResponseVO response = new ResponseVO();
		if(user == null) {
			response.setErrorcode(ResponseVO.NOUSER);
			response.setMsg("用户不存在");
		} else {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
			response.setData(user);
		}
		return response.toJson();
	}
	
	@Override
	public String delUser(int id) {
		ResponseVO response = new ResponseVO();
		if(userService.delUser(id)) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("成功");
		} else {
			response.setErrorcode(ResponseVO.NOUSER);
			response.setMsg("用户不存在");
		}
		return response.toJson();
	}
	
	@Override
	public String updateUser(UserVO user) {
		ResponseVO response = new ResponseVO();
		if(userService.updateUser(user)) {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("修改成功");
		} else {
			response.setErrorcode(ResponseVO.NOUSER);
			response.setMsg("用户不存在");
		}
		return response.toJson();
	}
	
	@Override
	public String login(String mail, String pwd, HttpSession session) {
		UserVO user = userService.getUserByMail(mail);
		ResponseVO response = new ResponseVO();
		if(user == null) {
			response.setErrorcode(ResponseVO.MAILERROR);
			response.setMsg("用户名错误");
		} else if(!user.getPassword().equalsIgnoreCase(pwd)) {
			response.setErrorcode(ResponseVO.PWDERROR);
			response.setMsg("密码错误");
		} else {
			response.setErrorcode(ResponseVO.SUCCESS);
			response.setMsg("登录成功");
			HashMap<String , Object> data = new HashMap<String, Object>();
			data.put("user", user);
			data.put("token", session.getId());
			response.setData(data);
			session.setAttribute("uid", user.getId());
			session.setAttribute("privilege", user.getPrivilege());
			
		}
		return response.toJson();
	}

	@Override
	public String checkNickname(String nickname) {
		ResponseVO response = new ResponseVO();
		if(userService.getUserByNickname(nickname) != null) {
			response.setErrorcode(ResponseVO.NICKRPEAT);
			response.setMsg("注册昵称重复");
			return response.toJson();
		}
		response.setErrorcode(ResponseVO.SUCCESS);
		response.setMsg("注册昵称可用");
		return response.toJson();
	}
}
