package com.store.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.model.mfrctact;
import com.store.model.pcdetail;
import com.store.model.purchase;
import com.store.service.imp.mangerserviceimp;
import com.store.service.imp.purchaseserviceimp;
import com.store.util.staticvale;
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value="/purchase")
public class purchasecontroller {
	@Autowired
	private purchaseserviceimp purchaseservice;
	@Autowired
	private mangerserviceimp managerservice;
	@RequestMapping(value="/pcdetails")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public List<pcdetail> Getpcdetails(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tpurchaseid=String.valueOf(map.get("tPurchaseid"));
			String tUserid=String.valueOf(map.get("tUserid"));
			purchase purchase=new purchase();
			if (tpurchaseid!=null&!tpurchaseid.equals("null")) {
				purchase.settPurchaseid(tpurchaseid);
			}
			if (tUserid!=null&!tUserid.equals("null")) {
				purchase.settUserid(tUserid);
			}
			purchase purchasebk=null;
			if(purchase!=null){
			purchasebk=purchaseservice.getfullpurchase(purchase).get(0);}
			if(purchasebk!=null){
				return purchasebk.getPcdetails();
			}else {
				return null;
			}
			
		}
		return null;
	}
	@RequestMapping(value="/fullpurchase")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public List<purchase> GetfullPurchase(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tpurchaseid=String.valueOf(map.get("tPurchaseid"));
			String tUserid=String.valueOf(map.get("tUserid"));
			purchase purchase=new purchase();
			if (tpurchaseid!=null&!tpurchaseid.equals("null")) {
				purchase.settPurchaseid(tpurchaseid);
			}
			if (tUserid!=null&!tUserid.equals("null")) {
				purchase.settUserid(tUserid);
			}
			List<purchase> purchasebk=null;
			if(tpurchaseid!=null){
			purchasebk=purchaseservice.getfullpurchase(purchase);}
			if(purchasebk!=null){
				
				return purchasebk;
			}else {
				return null;
			}
			
		}
		return null;
	}

	@RequestMapping(value="/add")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean Addpurchase(@RequestBody purchase purchase){
		if (purchase!=null&!purchase.gettPcmanagerid().equals("")) {
			purchase.settPurchaseid(staticvale.getpurchaseid());
			List<pcdetail> pcdetails=purchase.getPcdetails();
			if (pcdetails!=null&pcdetails.size()!=0) {
				for (pcdetail p:pcdetails) {
					p.settPcdetailid("d"+staticvale.getpurchaseid());
					purchaseservice.addpcdetail(p);
				}
			}
			return purchaseservice.addpurchase(purchase);
		}
		return false;
	}
	
	@RequestMapping(value="/del")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean delpurchase(@RequestBody purchase purchase){
		if (purchase.gettPurchaseid()!=null&purchase.gettPcmanagerid()!=null) {
			purchase purchase2=purchaseservice.getfullpurchase(purchase).get(0);
			List<pcdetail> pcdetails=purchase2.getPcdetails();
			if (pcdetails!=null&pcdetails.size()!=0) {
				for (pcdetail p:pcdetails) {
					purchaseservice.delpcdetail(p);
				}
			}
			return purchaseservice.delpurchase(purchase);
		}
		return false;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean updatepurchase(@RequestBody purchase purchase){
		if (purchase.gettPurchaseid()!=null&purchase.gettPcmanagerid()!=null) {
			List<pcdetail> pcdetails=purchase.getPcdetails();
			if (pcdetails!=null&pcdetails.size()!=0) {
				for (pcdetail p:pcdetails) {
					purchaseservice.updatepcdetail(p);
				}
			}
			return purchaseservice.updatepurchase(purchase);
		}
		return false;
	}
	@RequestMapping(value="/addpcdetail")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean Addpcdetail(@RequestBody pcdetail pcdetail){
		if (pcdetail!=null&!pcdetail.gettPcdtmanagerid().equals("")) {
			pcdetail.settPcdetailid("d"+staticvale.getpurchaseid());
			return purchaseservice.addpcdetail(pcdetail);
		}
		return false;
	}
	@RequestMapping(value="/delpcdetail")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean delpcdetail(@RequestBody pcdetail pcdetail){
		if (pcdetail!=null&!pcdetail.gettPcdtmanagerid().equals("")) {
			return purchaseservice.delpcdetail(pcdetail);
		}
		return false;
	}
	@RequestMapping(value="/updatepcdetail")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean updatepcdetail(@RequestBody pcdetail pcdetail){
		if (pcdetail!=null&!pcdetail.gettPcdtmanagerid().equals("")) {
			return purchaseservice.updatepcdetail(pcdetail);
		}
		return false;
	}

	@RequestMapping(value="/mfrctact")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public mfrctact getmfrctact(@RequestBody purchase purchase){
		if (purchase.gettContacthuman()!=null) {
			return purchaseservice.getMfrctact(purchase.gettContacthuman());
		}
		return null;
	}
}
