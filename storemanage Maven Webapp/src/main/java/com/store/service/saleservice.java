package com.store.service;

import java.util.HashMap;
import java.util.List;

import com.store.model.custctact;
import com.store.model.sale;
import com.store.model.saledetail;

public interface saleservice {
	public List<sale> getfullsale(sale sale);
	public boolean addsale(sale sale);
	public boolean delsale(sale sale);
	public boolean updatesale(sale sale);
	public boolean addsaledetail(saledetail saledetail);
	public boolean delsaledetail(saledetail saledetail);
	public boolean updatesaledetail(saledetail saledetail);
	public List<sale> getfullsalelist(HashMap<String, Object> map);
	public custctact getCustctact(String tCcid);
}
