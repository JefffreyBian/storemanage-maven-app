package com.store.model;

import java.util.List;

public class mfr {
    private String tMfrid;

    private String tMfrname;

    private String tMfraddress;

    private String tMfrmanagerid;
    
    private List<mfrctact> mfrctacts; 
    
    public List<mfrctact> getMfrctacts() {
		return mfrctacts;
	}

	public void setMfrctacts(List<mfrctact> mfrctacts) {
		this.mfrctacts = mfrctacts;
	}

	public String gettMfrid() {
        return tMfrid;
    }

    public void settMfrid(String tMfrid) {
        this.tMfrid = tMfrid == null ? null : tMfrid.trim();
    }

    public String gettMfrname() {
        return tMfrname;
    }

    public void settMfrname(String tMfrname) {
        this.tMfrname = tMfrname == null ? null : tMfrname.trim();
    }

    public String gettMfraddress() {
        return tMfraddress;
    }

    public void settMfraddress(String tMfraddress) {
        this.tMfraddress = tMfraddress == null ? null : tMfraddress.trim();
    }

    public String gettMfrmanagerid() {
        return tMfrmanagerid;
    }

    public void settMfrmanagerid(String tMfrmanagerid) {
        this.tMfrmanagerid = tMfrmanagerid == null ? null : tMfrmanagerid.trim();
    }
}