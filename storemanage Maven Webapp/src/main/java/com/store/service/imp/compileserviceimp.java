package com.store.service.imp;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.store.dao.compileMapping;
import com.store.dao.productMapper;
import com.store.model.compiledata;
import com.store.model.product;

@Service(value="compilservice")
public class compileserviceimp implements com.store.service.compileservice {
	@Resource
	private compileMapping compiledao;
	@Resource
	private productMapper productdao;
	@Override
	public List<compiledata> queryreportsaledatabyweek(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return compiledao.queryreportsaledatabyweek(map);
	}

	@Override
	public List<compiledata> queryreportsaledatabymonth(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return compiledao.queryreportsaledatabymonth(map);
	}

	@Override
	public List<compiledata> queryreportsaledatabyday(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return compiledao.queryreportsaledatabyday(map);
	}

	@Override
	public List<compiledata> queryreportpurchasedatabyweek(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return compiledao.queryreportpurchasedatabyweek(map);
	}

	@Override
	public List<compiledata> queryreportpurchasedatabymonth(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return compiledao.queryreportpurchasedatabymonth(map);
	}

	@Override
	public List<compiledata> queryreportpurchasedatabyday(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return compiledao.queryreportpurchasedatabyday(map);
	}

	@Override
	public boolean updateprototalqut(String tManagerid) {
		// TODO Auto-generated method stub
		if(compiledao.updateprototalqut(tManagerid)>=1){
			return true;}else {
				return false;
			}
	}

	@Override
	public boolean updateproremainqut(String tManagerid) {
		// TODO Auto-generated method stub
		if(compiledao.updateproremainqut(tManagerid)>=1){
			return true;}else {
				return false;
			}
	}

	@Override
	public boolean updatepayformbypurchaseid(Map<String, Object> map) {
		// TODO Auto-generated method stub
		if(compiledao.updatepayformbypurchaseid(map)==1){
			return true;}else {
				return false;
			}

	}

	@Override
	public boolean updatepayformbymanagerid(String tManagerid) {
		// TODO Auto-generated method stub
		if(compiledao.updatepayformbymanagerid(tManagerid)>=1){
			return true;}else {
				return false;
			}
	}

	@Override
	public boolean updatereceiptbysaleid(Map<String, Object> map) {
		// TODO Auto-generated method stub
		if(compiledao.updatereceiptbysaleid(map)==1){
			return true;}else {
				return false;
			}

	}

	@Override
	public boolean updatereceiptbymanagerid(String tManagerid) {
		// TODO Auto-generated method stub
		if(compiledao.updatereceiptbymanagerid(tManagerid)>=1){
			return true;}else {
				return false;
			}

	}
	@Override
	public product getproductbyid(String tProid) {
		// TODO Auto-generated method stub
		return productdao.selectByPrimaryKey(tProid);
	}

}
