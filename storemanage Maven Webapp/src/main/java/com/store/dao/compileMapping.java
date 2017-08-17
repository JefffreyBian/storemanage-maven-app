package com.store.dao;

import java.util.List;
import java.util.Map;

import com.store.model.compiledata;

public interface compileMapping {
	List<compiledata> queryreportsaledatabyweek(Map<String, Object> map);
	List<compiledata> queryreportsaledatabymonth(Map<String, Object> map);
	List<compiledata> queryreportsaledatabyday(Map<String, Object> map);
	List<compiledata> queryreportpurchasedatabyweek(Map<String, Object> map);
	List<compiledata> queryreportpurchasedatabymonth(Map<String, Object> map);
	List<compiledata> queryreportpurchasedatabyday(Map<String, Object> map);
	int updateprototalqut(String tManagerid);
	int updateproremainqut(String tManagerid);
	int updatepayformbypurchaseid(Map<String, Object> map);
	int updatepayformbymanagerid(String tManagerid);
	int updatereceiptbysaleid(Map<String, Object> map);
	int updatereceiptbymanagerid(String tManagerid);

}
