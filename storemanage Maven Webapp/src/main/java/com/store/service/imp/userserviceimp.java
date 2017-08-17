package com.store.service.imp;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.store.dao.managerMapper;
import com.store.dao.saleMapper;
import com.store.dao.userMapper;
import com.store.model.user;
import com.store.service.userservice;

@Service(value="userService")
public class userserviceimp implements userservice {

	@Resource
	private userMapper userdao;
	@Resource
	private saleMapper saledao;
	@Resource
	private managerMapper managerdao;
	public user Logincheckuser(user user){
			
		return userdao.LoginCheckByPrimaryKey(user);
	}
	public user getfullUser(String tUserid) {
		// TODO Auto-generated method stub
		return userdao.queryforlistByPrimaryKey(tUserid);
	}
	@Override
	public boolean addUser(user user) {
		// TODO Auto-generated method stub
		if(userdao.insert(user)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean delUser(user user) {
		// TODO Auto-generated method stub
		if(userdao.deleteByPrimaryKey(user.gettUserid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updateUser(user user) {
		// TODO Auto-generated method stub
		if(userdao.updateByPrimaryKey(user)==1){
			return true;}else {
				return false;
			}
	}
	public List<user> getfullUserlist(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
