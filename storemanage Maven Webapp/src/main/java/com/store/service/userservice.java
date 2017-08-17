package com.store.service;

import java.util.HashMap;
import java.util.List;

import com.store.model.user;

public interface userservice {
	public user Logincheckuser(user user);
	public user getfullUser(String user);
	public boolean addUser(user user);
	public boolean delUser(user user);
	public boolean updateUser(user user);
	public List<user> getfullUserlist(HashMap<String, Object> map);

}
