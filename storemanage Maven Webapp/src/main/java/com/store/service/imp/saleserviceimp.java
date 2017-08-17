package com.store.service.imp;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.store.dao.custctactMapper;
import com.store.dao.managerMapper;
import com.store.dao.saleMapper;
import com.store.dao.saledetailMapper;
import com.store.dao.userMapper;
import com.store.model.custctact;
import com.store.model.sale;
import com.store.model.saledetail;
import com.store.service.saleservice;
@Service(value="saleService")
public class saleserviceimp implements saleservice {
	@Resource
	private userMapper userdao;
	@Resource
	private saleMapper saledao;
	@Resource
	private custctactMapper custctactdao;
	@Resource
	private managerMapper managerdao;
	@Resource
	private saledetailMapper saledetaildao;
	@Override
	public List<sale> getfullsale(sale sale) {
		// TODO Auto-generated method stub
		return saledao.queryforlistByPrimaryKey(sale);
	}
	@Override
	public boolean addsale(sale sale) {
		// TODO Auto-generated method stub
		if(saledao.insertSelective(sale)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean delsale(sale sale) {
		// TODO Auto-generated method stub
		if(saledao.deleteByPrimaryKey(sale.gettSaleid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatesale(sale sale) {
		// TODO Auto-generated method stub
		if(saledao.updateByPrimaryKey(sale)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public List<sale> getfullsalelist(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return saledao.querylistbytime(map);
	}
	@Override
	public boolean addsaledetail(saledetail saledetail) {
		// TODO Auto-generated method stub
		if(saledetaildao.insert(saledetail)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean delsaledetail(saledetail saledetail) {
		// TODO Auto-generated method stub
		if(saledetaildao.deleteByPrimaryKey(saledetail.gettSaleid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatesaledetail(saledetail saledetail) {
		// TODO Auto-generated method stub
		if(saledetaildao.updateByPrimaryKeySelective(saledetail)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public custctact getCustctact(String tCcid) {
		// TODO Auto-generated method stub
		return custctactdao.selectByPrimaryKey(tCcid);
	}
	
	
}
