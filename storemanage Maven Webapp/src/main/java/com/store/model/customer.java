package com.store.model;

import java.util.List;

public class customer {
    private String tCustomerid;

    private String tCustomername;

    private String tCustomeraddress;

    private String tManagerid;
    
    private List<custctact> custctacts;

    public List<custctact> getCustctacts() {
		return custctacts;
	}

	public void setCustctacts(List<custctact> custctacts) {
		this.custctacts = custctacts;
	}

	public String gettCustomerid() {
        return tCustomerid;
    }

    public void settCustomerid(String tCustomerid) {
        this.tCustomerid = tCustomerid == null ? null : tCustomerid.trim();
    }

    public String gettCustomername() {
        return tCustomername;
    }

    public void settCustomername(String tCustomername) {
        this.tCustomername = tCustomername == null ? null : tCustomername.trim();
    }

    public String gettCustomeraddress() {
        return tCustomeraddress;
    }

    public void settCustomeraddress(String tCustomeraddress) {
        this.tCustomeraddress = tCustomeraddress == null ? null : tCustomeraddress.trim();
    }

    public String gettManagerid() {
        return tManagerid;
    }

    public void settManagerid(String tManagerid) {
        this.tManagerid = tManagerid == null ? null : tManagerid.trim();
    }
}