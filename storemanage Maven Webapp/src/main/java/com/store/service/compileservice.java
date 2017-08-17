package com.store.service;

import java.util.List;
import java.util.Map;

import com.store.model.compiledata;
import com.store.model.product;

public interface compileservice {
	public List<compiledata> queryreportsaledatabyweek(Map<String, Object> map);
	public List<compiledata> queryreportsaledatabymonth(Map<String, Object> map);
	public List<compiledata> queryreportsaledatabyday(Map<String, Object> map);
	public List<compiledata> queryreportpurchasedatabyweek(Map<String, Object> map);
	public List<compiledata> queryreportpurchasedatabymonth(Map<String, Object> map);
	public List<compiledata> queryreportpurchasedatabyday(Map<String, Object> map);
	public boolean updateprototalqut(String tManagerid);
	public boolean updateproremainqut(String tManagerid);
	public boolean updatepayformbypurchaseid(Map<String, Object> map);
	public boolean updatepayformbymanagerid(String tManagerid);
	public boolean updatereceiptbysaleid(Map<String, Object> map);
	public boolean updatereceiptbymanagerid(String tManagerid);
	public product getproductbyid(String tProid);
}
