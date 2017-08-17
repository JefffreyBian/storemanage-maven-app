package com.store.model;

public class saledetail {
    private String tSaleid;

    private String tProductid;

    private String tSalequt;

    private String tSaleprice;

    private String tSldtmanagerid;

	private String tSlid;
    
	public String gettSlid() {
			return tSlid;
		}

	public void settSlid(String tSlid) {
			this.tSlid = tSlid;
		}


	
    public String gettSaleid() {
        return tSaleid;
    }

    public void settSaleid(String tSaleid) {
        this.tSaleid = tSaleid == null ? null : tSaleid.trim();
    }

    public String gettProductid() {
        return tProductid;
    }

    public void settProductid(String tProductid) {
        this.tProductid = tProductid == null ? null : tProductid.trim();
    }

    public String gettSalequt() {
        return tSalequt;
    }

    public void settSalequt(String tSalequt) {
        this.tSalequt = tSalequt == null ? null : tSalequt.trim();
    }

    public String gettSaleprice() {
        return tSaleprice;
    }

    public void settSaleprice(String tSaleprice) {
        this.tSaleprice = tSaleprice == null ? null : tSaleprice.trim();
    }

    public String gettSldtmanagerid() {
        return tSldtmanagerid;
    }

    public void settSldtmanagerid(String tSldtmanagerid) {
        this.tSldtmanagerid = tSldtmanagerid == null ? null : tSldtmanagerid.trim();
    }
}