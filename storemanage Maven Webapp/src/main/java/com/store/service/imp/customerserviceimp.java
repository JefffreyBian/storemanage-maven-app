package com.store.service.imp;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.store.dao.custctactMapper;
import com.store.dao.customerMapper;
import com.store.dao.saleMapper;
import com.store.dao.userMapper;
import com.store.model.custctact;
import com.store.model.customer;
import com.store.service.customerservice;
@Service(value="customerService")
public class customerserviceimp implements customerservice {
	@Resource
	private userMapper userdao;
	@Resource
	private custctactMapper custctactdao;
	@Resource
	private customerMapper customerdao;
	@Resource
	private saleMapper saledao
	;
	/**
	 * 获取完整customer实体
	 * @param customerid
	 * @return customer
	 */
	@Override
	public List<customer> getfullcustomer(customer customer) {
		// TODO Auto-generated method stub
		return customerdao.queryforlistByPrimaryKey(customer);
	}
	/**
	 * 添加单个customer实体
	 * @param customer
	 * @return boolean
	 */
	@Override
	public boolean addcustomer(customer customer) {
		// TODO Auto-generated method stub
		if(customerdao.insertSelective(customer)==1){
		return true;}else {
			return false;
		}
	}
	@Override
	public boolean delcustomer(customer customer) {
		// TODO Auto-generated method stub
		if(customerdao.deleteByPrimaryKey(customer.gettCustomerid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatecustomer(customer customer) {
		// TODO Auto-generated method stub
		if(customerdao.updateByPrimaryKey(customer)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public List<customer> getfullcustomerlist(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean addcustctact(custctact custctact) {
		// TODO Auto-generated method stub
		if(custctactdao.updateByPrimaryKey(custctact)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean delcustctact(custctact custctact) {
		// TODO Auto-generated method stub
		if(custctactdao.deleteByPrimaryKey(custctact.gettCcid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatecustctact(custctact custctact) {
		// TODO Auto-generated method stub
		if(custctactdao.updateByPrimaryKey(custctact)==1){
			return true;}else {
				return false;
			}

	}
}
