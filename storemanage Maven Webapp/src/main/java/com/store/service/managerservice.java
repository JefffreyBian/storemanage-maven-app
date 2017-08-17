package com.store.service;

import java.util.HashMap;
import java.util.List;

import com.store.model.manager;

public interface managerservice {
	public manager getfullmanager(String manager);
	public boolean addmanager(manager manager);
	public boolean delmanager(manager manager);
	public boolean updatemanager(manager manager);
	public List<manager> getfullmanagerlist(HashMap<String, Object> map);

}
