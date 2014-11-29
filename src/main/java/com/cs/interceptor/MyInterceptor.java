package com.cs.interceptor;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cs.biz.utils.MySessionContext;
import com.cs.web.model.vo.ResponseVO;
/**
 * 自身操作
 * @author 李思良
 *
 */
public class MyInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		arg1.setContentType("text/html; charset=utf-8");
		HttpSession session = MySessionContext.getSession(arg0.getParameter("token"));
		if(session == null) {
			PrintWriter out = arg1.getWriter();
			ResponseVO res = new ResponseVO();
			res.setErrorcode(ResponseVO.NOTLOGIN);
			res.setMsg("用户未登录");
			out.print(res.toJson());
			return false;
		}
		return true;
	}

}