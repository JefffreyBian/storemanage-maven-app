package com.store.controller;

import java.net.URLDecoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.auth0.jwt.interfaces.Claim;
import com.store.model.user;
import com.store.service.imp.userserviceimp;
import com.store.util.userinfotoken;
import com.store.util.util;

/**
 * Servlet Filter implementation class verifypemessionfilter
 */
@CrossOrigin(value="*",maxAge=3600)
public class verifypemessionfilter implements HandlerInterceptor {
	@Autowired
    private userserviceimp userdao;
    private user u;
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		arg1.setHeader("Access-Control-Allow-Origin", "*");
		arg1.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		arg1.setHeader("Access-Control-Max-Age", "3600");
		arg1.setHeader("Access-Control-Allow-Headers", "x-requested-with,access-token,content-type");
		String token=arg0.getHeader("access-token");
		if(!util.isNull(token)){
				u=new user();
				Map<String,Claim> claims=userinfotoken.verifyToken((URLDecoder.decode(token,"utf-8")),null);
				u.settUseraccount(String.valueOf(claims.get("tUseraccount").asString()));
				u.settUserpw(String.valueOf(claims.get("tUserpw").asString()));
			};
		if(userdao.Logincheckuser(u)!=null){
			return true;
		}else {
			return false;
			//arg1.sendRedirect("http://localhost:8080/storemanage/index.jsp");
			//return false;
		}
	}


}
