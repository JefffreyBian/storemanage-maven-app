package com.store.service;

import java.util.HashMap;
import java.util.List;

import com.store.model.mfrctact;
import com.store.model.pcdetail;
import com.store.model.purchase;

public interface purchaseservice {
	public List<purchase> getfullpurchase(purchase purchase);
	public boolean addpurchase(purchase purchase);
	public boolean delpurchase(purchase purchase);
	public boolean updatepurchase(purchase purchase);
	public boolean addpcdetail(pcdetail pcdetail);
	public boolean delpcdetail(pcdetail pcdetail);
	public boolean updatepcdetail(pcdetail pcdetail);
	public List<purchase> getfullpurchaselist(HashMap<String, Object> map);
	public mfrctact getMfrctact(String tMfrctactid);

}
