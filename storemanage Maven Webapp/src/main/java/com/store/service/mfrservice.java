package com.store.service;

import java.util.HashMap;
import java.util.List;

import com.store.model.mfr;
import com.store.model.mfrctact;

public interface mfrservice {
	public List<mfr> getfullmfr(mfr mfr);
	public boolean addmfr(mfr mfr);
	public boolean delmfr(mfr mfr);
	public boolean updatemfr(mfr mfr);
	public boolean addmfrctacts(mfrctact mfrctact);
	public boolean delmfrctacts(mfrctact mfrctact);
	public boolean updatemfrctacts(mfrctact mfrctact);

	public List<mfr> getfullmfrlist(HashMap<String, Object> map);

}
