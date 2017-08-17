package com.store.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.model.customer;
import com.store.model.manager;
import com.store.model.mfr;
import com.store.model.user;
import com.store.service.imp.mangerserviceimp;
import com.store.util.staticvale;
@Controller
@CrossOrigin
@RequestMapping(value="/manager")
public class managercontroller {
	@Autowired
	private mangerserviceimp managerservice;
	@RequestMapping(value="/users")
	@ResponseBody
	@CrossOrigin
	public List<user> GetmanagerUsers(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tManagerid=String.valueOf(map.get("tManagerid"));
			manager managerbk=null;
			if (tManagerid!=null&!tManagerid.equals("null")) {			
			managerbk=(manager)managerservice.getfullmanager(tManagerid);}
			if(managerbk!=null){
				return managerbk.getUsers();
			}else {
				return null;
			}
			
		}
		return null;
	}
	@RequestMapping(value="/customers")
	@ResponseBody
	@CrossOrigin
	public List<customer> GetmanagerCustomers(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tManagerid=String.valueOf(map.get("tManagerid"));
			manager managerbk=null;
			if (tManagerid!=null&!tManagerid.equals("null")) {			
			managerbk=(manager)managerservice.getfullmanager(tManagerid);}
			if(managerbk!=null){
				return managerbk.getCustomers();
			}else {
				return null;
			}
			
		}
		return null;
	}
	@RequestMapping(value="/mfrs")
	@ResponseBody
	@CrossOrigin
	public List<mfr> Getmanagermfrs(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tManagerid=String.valueOf(map.get("tManagerid"));
			manager managerbk=null;
			if (tManagerid!=null&!tManagerid.equals("null")) {			
			managerbk=(manager)managerservice.getfullmanager(tManagerid);}
			if(managerbk!=null){
				return managerbk.getMfrs();
			}else {
				return null;
			}
			
		}
		return null;
	}
	@RequestMapping(value="/fullmanager")
	@ResponseBody
	@CrossOrigin
	public manager Getfullmanager(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tManagerid=String.valueOf(map.get("tManagerid"));
			manager managerbk=null;
			if (tManagerid!=null&!tManagerid.equals("null")) {			
			managerbk=(manager)managerservice.getfullmanager(tManagerid);}
			if(managerbk!=null){
				return managerbk;
			}else {
				return null;
			}
			
		}
		return null;
	}
	@RequestMapping(value="/add")
	@ResponseBody
	@CrossOrigin
	public boolean Addmanager(@RequestBody manager manager){
		if (manager!=null) {
			manager.settManagerid(staticvale.getmid());
			return managerservice.addmanager(manager);
		}
		return false;
	}
	
	@RequestMapping(value="/del")
	@ResponseBody
	@CrossOrigin
	public boolean delmanager(@RequestBody manager manager){
		if (manager.gettManagerid()!=null) {
			return managerservice.delmanager(manager);
		}
		return false;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	@CrossOrigin
	public boolean updatemanager(@RequestBody manager manager){
		if (manager.gettManagerid()!=null) {
			return managerservice.updatemanager(manager);
		}
		return false;
	}
}
