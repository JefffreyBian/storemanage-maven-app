package com.store.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.model.purchase;
import com.store.model.sale;
import com.store.model.user;
import com.store.service.imp.mangerserviceimp;
import com.store.service.imp.userserviceimp;
import com.store.util.staticvale;
import com.store.util.userinfotoken;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value="/user")
public class usercontroller {

	@Autowired
	private userserviceimp userservice;
	@Autowired
	private mangerserviceimp managerservice;
	@RequestMapping(value="/check")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public String LoginCheck(@RequestBody Map<String, Object> map,HttpServletResponse response){
		if (map!=null) {
			user user=new user();
			user.settUseraccount(String.valueOf(map.get("tUseraccount")));
			user.settUserpw(String.valueOf(map.get("tUserpw").toString()));
			user userbk=null;
			String token=null;
			if(user!=null){
			userbk=(user)userservice.Logincheckuser(user);}
			if(userbk!=null){
				try {
					token = userinfotoken.createToken(userbk);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return token;
			}else {
				return null;
			}
			
		}
		return null;
	}
	@RequestMapping(value="/fullusersales",method=RequestMethod.POST)
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public List<sale> GetUserSales(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tUserid=map.get("tUserid").toString();
			user userbk=null;
			if(tUserid!=null){
			userbk=(user)userservice.getfullUser(tUserid);}
			if(userbk!=null){
				
				return userbk.getSales();
			}else {
				return null;
			}
			
		}
		return null;
	}
	
	@RequestMapping(value="/fulluserpurchases",method=RequestMethod.POST)
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public List<purchase> GetUserPurchases(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tUserid=map.get("tUserid").toString();
			user userbk=null;
			if(tUserid!=null){
			userbk=(user)userservice.getfullUser(tUserid);}
			if(userbk!=null){
				
				return userbk.getPurchases();
			}else {
				return null;
			}
			
		}
		return null;
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public user GetUser(@RequestBody Map<String, Object> map){
		if (map!=null) {
			user user=new user();
			user.settUseraccount(String.valueOf(map.get("tUseraccount")));
			user.settUserpw(String.valueOf(map.get("tUserpw").toString()));
			user userbk=null;
			if(user!=null){
			userbk=(user)userservice.Logincheckuser(user);}
			if(userbk!=null){
				return userbk;
			}else {
				return null;
			}
			
		}
		return null;
	}
	
	@RequestMapping(value="/fulluser",method=RequestMethod.POST)
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public user GetfullUser(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tUserid=map.get("tUserid").toString();
			user userbk=null;
			if(tUserid!=null){
			userbk=(user)userservice.getfullUser(tUserid);}
			if(userbk!=null){
				return userbk;
			}else {
				return null;
			}
			
		}
		return null;
	}

	@RequestMapping(value="/add")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean AddUser(@RequestBody user user){
		if (user!=null&!user.gettUsermanager().equals("")) {
			user.settUserid(staticvale.getuid());
			return userservice.addUser(user);
		}
		return false;
	}
	
	@RequestMapping(value="/del")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean delUser(@RequestBody user user){
		if (user.gettUserid()!=null&user.gettUsermanager()!=null) {
			return userservice.delUser(user);
		}
		return false;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean updateUser(@RequestBody user user){
		if (user.gettUserid()!=null&user.gettUsermanager()!=null) {
			return userservice.updateUser(user);
		}
		return false;
	}
}
