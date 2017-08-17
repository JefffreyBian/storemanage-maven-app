package com.store.model;

import java.util.List;

public class product {
    private String tProid;

    private String tProname;

    private String tProtype;

    private Integer tProqut;

    private String tPropctotal;

    private Integer tProprice;

    private String tPromanagerid;
    
    private List<purchase> purchases;
    
    
    
    public List<purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<purchase> purchases) {
		this.purchases = purchases;
	}

	public String gettProid() {
        return tProid;
    }

    public void settProid(String tProid) {
        this.tProid = tProid == null ? null : tProid.trim();
    }

    public String gettProname() {
        return tProname;
    }

    public void settProname(String tProname) {
        this.tProname = tProname == null ? null : tProname.trim();
    }

    public String gettProtype() {
        return tProtype;
    }

    public void settProtype(String tProtype) {
        this.tProtype = tProtype == null ? null : tProtype.trim();
    }

    public Integer gettProqut() {
        return tProqut;
    }

    public void settProqut(Integer tProqut) {
        this.tProqut = tProqut;
    }

    public String gettPropctotal() {
        return tPropctotal;
    }

    public void settPropctotal(String tPropctotal) {
        this.tPropctotal = tPropctotal == null ? null : tPropctotal.trim();
    }

    public Integer gettProprice() {
        return tProprice;
    }

    public void settProprice(Integer tProprice) {
        this.tProprice = tProprice;
    }

    public String gettPromanagerid() {
        return tPromanagerid;
    }

    public void settPromanagerid(String tPromanagerid) {
        this.tPromanagerid = tPromanagerid == null ? null : tPromanagerid.trim();
    }
}