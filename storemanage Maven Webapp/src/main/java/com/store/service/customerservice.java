package com.store.service;

import java.util.HashMap;
import java.util.List;

import com.store.model.custctact;
import com.store.model.customer;

public interface customerservice {
	public List<customer> getfullcustomer(customer customer);
	public boolean addcustomer(customer customer);
	public boolean delcustomer(customer customer);
	public boolean updatecustomer(customer customer);
	public boolean addcustctact(custctact custctact);
	public boolean delcustctact(custctact custctact);
	public boolean updatecustctact(custctact custctact);
	public List<customer> getfullcustomerlist(HashMap<String, Object> map);

}
