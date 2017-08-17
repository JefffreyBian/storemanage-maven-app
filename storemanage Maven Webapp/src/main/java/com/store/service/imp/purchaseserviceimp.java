package com.store.service.imp;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.store.dao.managerMapper;
import com.store.dao.mfrctactMapper;
import com.store.dao.pcdetailMapper;
import com.store.dao.purchaseMapper;
import com.store.dao.userMapper;
import com.store.model.mfrctact;
import com.store.model.pcdetail;
import com.store.model.purchase;
import com.store.service.purchaseservice;
@Service(value="purchaseService")
public class purchaseserviceimp implements purchaseservice {
	@Resource
	private userMapper userdao;
	@Resource
	private purchaseMapper purchasedao;
	@Resource
	private mfrctactMapper mfrctactdao;
	@Resource
	private managerMapper managerdao;
	@Resource
	private pcdetailMapper pcdetaildao;
	@Override
	public List<purchase> getfullpurchase(purchase purchase) {
		// TODO Auto-generated method stub
		return purchasedao.queryforlistByPrimaryKey(purchase);
	}
	@Override
	public boolean addpurchase(purchase purchase) {
		// TODO Auto-generated method stub
		if(purchasedao.insertSelective(purchase)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean delpurchase(purchase purchase) {
		// TODO Auto-generated method stub
		if(purchasedao.deleteByPrimaryKey(purchase.gettPurchaseid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatepurchase(purchase purchase) {
		// TODO Auto-generated method stub
		if(purchasedao.updateByPrimaryKey(purchase)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public List<purchase> getfullpurchaselist(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return purchasedao.querylistbytime(map);
	}
	@Override
	public boolean addpcdetail(pcdetail pcdetail) {
		// TODO Auto-generated method stub
		if(pcdetaildao.insertSelective(pcdetail)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean delpcdetail(pcdetail pcdetail) {
		// TODO Auto-generated method stub
		if(pcdetaildao.deleteByPrimaryKey(pcdetail.gettPcdetailid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatepcdetail(pcdetail pcdetail) {
		// TODO Auto-generated method stub
		if(pcdetaildao.updateByPrimaryKey(pcdetail)==1){
			return true;}
		else {
				return false;
			}

	}
	@Override
	public mfrctact getMfrctact(String tMfrctactid) {
		// TODO Auto-generated method stub
			return mfrctactdao.selectByPrimaryKey(tMfrctactid);
	}
	
}
