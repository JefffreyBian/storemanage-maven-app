package com.store.service.imp;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.store.dao.mfrMapper;
import com.store.dao.mfrctactMapper;
import com.store.dao.purchaseMapper;
import com.store.dao.userMapper;
import com.store.model.mfr;
import com.store.model.mfrctact;
import com.store.service.mfrservice;
@Service(value="mfrService")
public class mfrserviceimp implements mfrservice {
	@Resource
	private userMapper userdao;
	@Resource
	private mfrctactMapper mfrctactdao;
	@Resource
	private mfrMapper mfrdao;
	@Resource
	private purchaseMapper purchasedao;
	@Override
	public List<mfr> getfullmfr(mfr mfr) {
		// TODO Auto-generated method stub
		return mfrdao.queryforlistByPrimaryKey(mfr);
	}
	@Override
	public boolean addmfr(mfr mfr) {
		// TODO Auto-generated method stub
		if(mfrdao.insertSelective(mfr)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean delmfr(mfr mfr) {
		// TODO Auto-generated method stub
		if(mfrdao.deleteByPrimaryKey(mfr.gettMfrid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatemfr(mfr mfr) {
		// TODO Auto-generated method stub
		if(mfrdao.updateByPrimaryKey(mfr)==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public List<mfr> getfullmfrlist(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean addmfrctacts(mfrctact mfrctact) {
		// TODO Auto-generated method stub
		if(mfrctactdao.updateByPrimaryKey(mfrctact)==1){
			return true;}else {
				return false;
			}

	}
	@Override
	public boolean delmfrctacts(mfrctact mfrctact) {
		// TODO Auto-generated method stub
		if(mfrctactdao.deleteByPrimaryKey(mfrctact.gettMfrcontactid())==1){
			return true;}else {
				return false;
			}
	}
	@Override
	public boolean updatemfrctacts(mfrctact mfrctact) {
		// TODO Auto-generated method stub
		if(mfrctactdao.updateByPrimaryKeySelective(mfrctact)==1){
			return true;}else {
				return false;
			}

	}
}
