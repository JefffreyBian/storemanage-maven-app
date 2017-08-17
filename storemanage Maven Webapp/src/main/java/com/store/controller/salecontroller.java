package com.store.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.model.custctact;
import com.store.model.sale;
import com.store.model.saledetail;
import com.store.service.imp.mangerserviceimp;
import com.store.service.imp.saleserviceimp;
import com.store.util.staticvale;
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value="/sale")
public class salecontroller {

	@Autowired
	private saleserviceimp saleservice;
	@Autowired
	private mangerserviceimp managerservice;
	@RequestMapping(value="/saledetails")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public List<saledetail> Getsaledetails(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tsaleid=String.valueOf(map.get("tSaleid"));
			String tUserid=String.valueOf(map.get("tUserid"));
			sale sale=new sale();
			if (tsaleid!=null&!tsaleid.equals("null")) {
				sale.settSaleid(tsaleid);
			}
			if (tUserid!=null&!tUserid.equals("null")) {
				sale.settUserid(tUserid);
			}
			sale salebk=null;
			if(tsaleid!=null){
			salebk=saleservice.getfullsale(sale).get(0);}
			if(salebk!=null){
				return salebk.getSaledetails();
			}else {
				return null;
			}
			
		}
		return null;
	}	
	@RequestMapping(value="/fullsale")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public List<sale> Getfullsale(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tsaleid=String.valueOf(map.get("tSaleid"));
			String tUserid=String.valueOf(map.get("tUserid"));
			sale sale=new sale();
			if (tsaleid!=null&!tsaleid.equals("null")) {
				sale.settSaleid(tsaleid);
			}
			if (tUserid!=null&!tUserid.equals("null")) {
				sale.settUserid(tUserid);
			}
			List<sale> salebk=null;
			if(tsaleid!=null){
			salebk=saleservice.getfullsale(sale);}
			if(salebk!=null){
				return salebk;
			}else {
				return null;
			}
			
		}
		return null;
	}

	
	@RequestMapping(value="/add")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean Addsale(@RequestBody sale sale){
		if (sale!=null&!sale.gettSlmanagerid().equals("")) {
			sale.settSaleid(staticvale.getsaleid());		
			List<saledetail> saledetails=sale.getSaledetails();
			if (saledetails!=null&saledetails.size()!=0) {
				for (saledetail s:saledetails) {
							s.settSaleid("d"+staticvale.getsaleid());
							saleservice.addsaledetail(s);
						}
			}
			return saleservice.addsale(sale);
		}
		return false;
	}
	
	@RequestMapping(value="/del")
	@ResponseBody
	@CrossOrigin
	public boolean delsale(@RequestBody sale sale){
		if (sale!=null&!sale.gettSlmanagerid().equals("")) {
			sale sale2=saleservice.getfullsale(sale).get(0);
			List<saledetail> saledetails=sale2.getSaledetails();
			if (saledetails!=null&saledetails.size()!=0) {
				for (saledetail s:saledetails) {
							saleservice.delsaledetail(s);
						}
			}
			return saleservice.delsale(sale);
		}
		return false;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	@CrossOrigin
	public boolean updatesale(@RequestBody sale sale){
		if (sale!=null&!sale.gettSlmanagerid().equals("")) {
			List<saledetail> saledetails=sale.getSaledetails();
			if (saledetails!=null&saledetails.size()!=0) {
				for (saledetail s:saledetails) {
							saleservice.updatesaledetail(s);
						}
			}
			return saleservice.updatesale(sale);
		}
		return false;
	}
	
	@RequestMapping(value="/addsalectact")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean Addsalectact(@RequestBody saledetail saledetail){
		if (saledetail!=null&!saledetail.gettSldtmanagerid().equals("")) {
			saledetail.settSaleid("d"+saledetail.gettSlid());
			return saleservice.addsaledetail(saledetail);
		}
		return false;

	}
	
	@RequestMapping(value="/desalectactl")
	@ResponseBody
	@CrossOrigin
	public boolean delsaledetail(@RequestBody saledetail saledetail){
		if (saledetail.gettSaleid()!=null&saledetail.gettSldtmanagerid()!=null) {
			return saleservice.delsaledetail(saledetail);
		}
		return false;
	}
	
	@RequestMapping(value="/updatesalectact")
	@ResponseBody
	@CrossOrigin
	public boolean updatesale(@RequestBody saledetail saledetail){
		if (saledetail.gettSaleid()!=null&saledetail.gettSldtmanagerid()!=null) {
			return saleservice.updatesaledetail(saledetail);
		}
		return false;
	}

	@RequestMapping(value="/custctact")
	@ResponseBody
	@CrossOrigin
	public custctact getcustctact(@RequestBody sale sale){
		if (sale.gettContacthuman()!=null&sale.gettSlmanagerid()!=null) {
			return saleservice.getCustctact(sale.gettContacthuman().toString());
		}
		return null;
	}
	
}
