package com.store.service.imp;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.store.dao.managerMapper;
import com.store.dao.userMapper;
import com.store.model.manager;
import com.store.service.managerservice;
@Service(value="mangerService")
public class mangerserviceimp implements managerservice {
	@Resource
	private userMapper userdao;
	@Resource
	private managerMapper managerdao;
	public manager Logincheckmanager(manager manager){
		
		return managerdao.LoginCheckByPrimaryKey(manager);
	}
	@Override
	public manager getfullmanager(String manager) {
		// TODO Auto-generated method stub
		return managerdao.queryforlistByPrimaryKey(manager);
	}
	@Override
	public boolean addmanager(manager manager) {
		// TODO Auto-generated method stub
		if(managerdao.insertSelective(manager)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean delmanager(manager manager) {
		// TODO Auto-generated method stub
		if(managerdao.deleteByPrimaryKey(manager.gettManagerid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatemanager(manager manager) {
		// TODO Auto-generated method stub
		if(managerdao.updateByPrimaryKey(manager)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public List<manager> getfullmanagerlist(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
