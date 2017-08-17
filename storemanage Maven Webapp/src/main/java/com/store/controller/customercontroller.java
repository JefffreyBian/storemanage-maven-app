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
import com.store.model.customer;
import com.store.service.imp.customerserviceimp;
import com.store.service.imp.mangerserviceimp;
import com.store.util.staticvale;
@Controller
@CrossOrigin
@RequestMapping(value="/customer")
public class customercontroller {
	@Autowired
	private customerserviceimp customerservice;
	@Autowired
	private mangerserviceimp managerservice;
	@RequestMapping(value="/custctacts")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public List<custctact> GetCustctacts(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tCustomerid=String.valueOf(map.get("tCustomerid"));
			String tManagerid=String.valueOf(map.get("tManagerid"));
			customer customer=new customer();
			if(tCustomerid!=null&!tCustomerid.equals("null")){
			customer.settCustomerid(tCustomerid);}
			if(tManagerid!=null&!tManagerid.equals("null")){
			customer.settManagerid(tManagerid);}
			customer custbk=null;
			if(tCustomerid!=null){
			custbk=customerservice.getfullcustomer(customer).get(0);}
			if(custbk!=null){
				
				return custbk.getCustctacts();
			}else {
				return null;
			}
			
		}
		return null;
	}
	@RequestMapping(value="/fullcustomer")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public List<customer> Getfullcustomer(@RequestBody Map<String, Object> map){
		if (map!=null) {
			String tCustomerid=map.get("tCustomerid").toString();
			String tManagerid=String.valueOf(map.get("tManagerid"));
			customer customer=new customer();
			if(tCustomerid!=null&!tCustomerid.equals("null")){
			customer.settCustomerid(tCustomerid);}
			if(tManagerid!=null&!tManagerid.equals("null")){
			customer.settManagerid(tManagerid);}
			List<customer> custbk=null;
			if(tCustomerid!=null){
			custbk=customerservice.getfullcustomer(customer);}
			if(custbk!=null){
				
				return custbk;
			}else {
				return null;
			}
			
		}
		return null;
	}

	@RequestMapping(value="/add")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean AddCustomer(@RequestBody customer customer){
		if (customer!=null&!customer.gettManagerid().equals("")) {
			customer.settCustomerid(staticvale.getcustid());
			return customerservice.addcustomer(customer);
		}
		return false;
	}
	
	@RequestMapping(value="/del")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean delcustomer(@RequestBody customer customer){
		if (customer.gettCustomerid()!=null&customer.gettManagerid()!=null) {
			return customerservice.delcustomer(customer);
		}
		return false;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	@CrossOrigin
	public boolean updatecustomer(@RequestBody customer customer){
		if (customer.gettCustomerid()!=null&customer.gettManagerid()!=null) {
			return customerservice.updatecustomer(customer);
		}
		return false;
	}
	

	@RequestMapping(value="/addcustctact")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean addcustctact(@RequestBody custctact custctact){
		if (custctact!=null&!custctact.gettCcmanagerid().equals("")) {
			custctact.settCcid(staticvale.getcustcid());
			return customerservice.addcustctact(custctact);
		}
		return false;
	}
	@RequestMapping(value="/delcustctact")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean delcustctact(@RequestBody custctact custctact){
		if (custctact!=null&!custctact.gettCcmanagerid().equals("")) {
			return customerservice.delcustctact(custctact);
		}
		return false;
	}
	@RequestMapping(value="/updatecustctact")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public boolean updatecustctact(@RequestBody custctact custctact){
		if (custctact!=null&!custctact.gettCcmanagerid().equals("")) {
			return customerservice.updatecustctact(custctact);
		}
		return false;
	}


}
