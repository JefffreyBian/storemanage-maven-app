package com.store.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.auth0.jwt.interfaces.Claim;
import com.store.model.compiledata;
import com.store.model.product;
import com.store.model.user;
import com.store.service.imp.compileserviceimp;
import com.store.service.imp.mangerserviceimp;
import com.store.service.imp.saleserviceimp;
import com.store.service.imp.userserviceimp;
import com.store.util.cyclecount;
import com.store.util.userinfotoken;
import com.store.util.util;

@Controller
@CrossOrigin
@RequestMapping(value="/comprehensive")
public class compileservice {
	@Autowired
	private userserviceimp userservice;
	@Autowired
	private mangerserviceimp managerservice;
	@Autowired
	private saleserviceimp saleservice;
	@Autowired
	private compileserviceimp compileservice;
	@RequestMapping(value="/salereport")
	@ResponseBody
	@CrossOrigin
	public String salereportdata(Map<String, Object> map) {
		String starttime=null;
		String endtime=null;
		String cycle=null;
		String tManagerid=null;
		List<compiledata> compiledatas=null;
		Map<String, Object> rtmap=new HashMap<String, Object>();
		if (map!=null) {
			starttime=map.get("starttime").toString();
			endtime=map.get("endtime").toString();
			cycle=map.get("cycle").toString();
		}
		if(!util.isNull(starttime)&!util.isNull(endtime)&!util.isNull(cycle)){
		if(String.valueOf(map.get("token"))!=null){
		user user=new user();
		Map<String, Claim> claims=null;
		try {
			claims = userinfotoken.verifyToken(String.valueOf(map.get("token")), null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user.settUseraccount(claims.get("tUseraccount").asString());
		user.settUserpw(claims.get("tUserpw").asString());
		userservice.Logincheckuser(user);
		tManagerid=user.gettUsermanager();
		}
		if(!util.isNull(tManagerid)&cycle.equals("week")){
		map.put("tManagerid", tManagerid);
		compiledatas=compileservice.queryreportsaledatabyweek(map);}
		}else if (!util.isNull(tManagerid)&cycle.equals("month")) {
			compiledatas=compileservice.queryreportsaledatabymonth(map);
		}else if (!util.isNull(tManagerid)&cycle.equals("month")) {
			compiledatas=compileservice.queryreportsaledatabyday(map);
		};
		rtmap=cyclecount.countcyle(starttime, endtime, cycle,compiledatas);
		return rtmap.toString();
	}
	@RequestMapping(value="/purchasereport")
	@ResponseBody
	@CrossOrigin
	public String purchasereportdata(Map<String, Object> map) {
		String starttime=null;
		String endtime=null;
		String cycle=null;
		String tManagerid=null;
		List<compiledata> compiledatas=null;
		Map<String, Object> rtmap=new HashMap<String, Object>();
		if (map!=null) {
			starttime=map.get("starttime").toString();
			endtime=map.get("endtime").toString();
			cycle=map.get("cycle").toString();
		}
		if(!util.isNull(starttime)&!util.isNull(endtime)&!util.isNull(cycle)){
		if(String.valueOf(map.get("token"))!=null){
		user user=new user();
		Map<String, Claim> claims=null;
		try {
			claims = userinfotoken.verifyToken(String.valueOf(map.get("token")), null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user.settUseraccount(claims.get("tUseraccount").asString());
		user.settUserpw(claims.get("tUserpw").asString());
		userservice.Logincheckuser(user);
		tManagerid=user.gettUsermanager();
		}
		if(!util.isNull(tManagerid)&cycle.equals("week")){
		map.put("tManagerid", tManagerid);
		compiledatas=compileservice.queryreportpurchasedatabyweek(map);}
		}else if (!util.isNull(tManagerid)&cycle.equals("month")) {
			compiledatas=compileservice.queryreportpurchasedatabymonth(map);
		}else if (!util.isNull(tManagerid)&cycle.equals("month")) {
			compiledatas=compileservice.queryreportpurchasedatabyday(map);
		};
		rtmap=cyclecount.countcyle(starttime, endtime, cycle,compiledatas);
		return rtmap.toString();
	}

	@RequestMapping(value="/product")
	@ResponseBody
	@CrossOrigin
	public product getcustctact(@RequestBody product product){
		if (product.gettProid()!=null) {
			return compileservice.getproductbyid(product.gettProid());
		}
		return null;
	}

}
