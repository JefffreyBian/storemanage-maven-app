package com.store.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.model.mfr;
import com.store.model.mfrctact;
import com.store.service.imp.mangerserviceimp;
import com.store.service.imp.mfrserviceimp;
import com.store.util.staticvale;
@Controller
@CrossOrigin
@RequestMapping(value="/mfr")
public class mfrcontroller {
	@Autowired
	private mfrserviceimp mfrservice;
	@Autowired
	private mangerserviceimp managerservice;
	@RequestMapping(value="/mfrcontacts")
	@ResponseBody
	@CrossOrigin
	public List<mfrctact> Getmfrctacts(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tMfrid=String.valueOf(map.get("tMfrid"));
			String tManagerid=String.valueOf(map.get("tManagerid"));
			mfr mfr=new mfr();
			if(tMfrid!=null&!tMfrid.equals("null")){
				mfr.settMfrid(tMfrid);}
			if(tManagerid!=null&!tManagerid.equals("null")){
				mfr.settMfrmanagerid(tManagerid);}			
			mfr mfrbk=null;
			if(tMfrid!=null){
			mfrbk=mfrservice.getfullmfr(mfr).get(0);}
			if(mfrbk!=null){
				
				return mfrbk.getMfrctacts();
			}else {
				return null;
			}
			
		}
		return null;
	}
	@RequestMapping(value="/fullmfr")
	@ResponseBody
	@CrossOrigin
	public List<mfr> Getfullmfr(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tMfrid=String.valueOf(map.get("tMfrid"));
			String tManagerid=String.valueOf(map.get("tManagerid"));
			mfr mfr=new mfr();
			if(tMfrid!=null&!tMfrid.equals("null")){
				mfr.settMfrid(tMfrid);}
			if(tManagerid!=null&!tManagerid.equals("null")){
				mfr.settMfrmanagerid(tManagerid);}
			List<mfr> mfrsbk=null;
			if(mfr!=null){
				mfrsbk=mfrservice.getfullmfr(mfr);}
			if(mfrsbk!=null){
				return mfrsbk;
			}else {
				return null;
			}
			
		}
		return null;
	}

	@RequestMapping(value="/add")
	@ResponseBody
	@CrossOrigin
	public boolean Addmfr(@RequestBody mfr mfr){
		if (mfr!=null&!mfr.gettMfrmanagerid().equals("")) {
			mfr.settMfrid(staticvale.getuid());
			return mfrservice.addmfr(mfr);
		}
		return false;
	}
	
	@RequestMapping(value="/del")
	@ResponseBody
	@CrossOrigin
	public boolean delmfr(@RequestBody mfr mfr){
		if (mfr.gettMfrid()!=null&mfr.gettMfrmanagerid()!=null) {
			return mfrservice.delmfr(mfr);
		}
		return false;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	@CrossOrigin
	public boolean updatemfr(@RequestBody mfr mfr){
		if (mfr.gettMfrid()!=null&mfr.gettMfrmanagerid()!=null) {
			return mfrservice.updatemfr(mfr);
		}
		return false;
	}
	
	@RequestMapping(value="/addmfrctact")
	@ResponseBody
	@CrossOrigin
	public boolean addmfrctact(@RequestBody mfrctact mfrctact){
		if (mfrctact!=null&!mfrctact.gettMfrcmanagerid().equals("")) {
			mfrctact.settMfrcontactid(staticvale.getmfrcid());
			return mfrservice.addmfrctacts(mfrctact);
		}
		return false;
	}
	@RequestMapping(value="/delmfrctact")
	@ResponseBody
	@CrossOrigin
	public boolean delmfrctact(@RequestBody mfrctact mfrctact){
		if (mfrctact!=null&!mfrctact.gettMfrcmanagerid().equals("")) {
			return mfrservice.delmfrctacts(mfrctact);
		}
		return false;
	}
	@RequestMapping(value="/updatemfrctact")
	@ResponseBody
	@CrossOrigin
	public boolean updatemfrctact(@RequestBody mfrctact mfrctact){
		if (mfrctact!=null&!mfrctact.gettMfrcmanagerid().equals("")) {
			return mfrservice.updatemfrctacts(mfrctact);
		}
		return false;
	}


}
