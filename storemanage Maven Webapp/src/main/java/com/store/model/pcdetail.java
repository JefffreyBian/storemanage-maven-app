package com.store.model;

public class pcdetail {
    private String tPcdetailid;

    private String tPcdetailproid;

    private Integer tPurchasequt;

    private Integer tPcdetailprice;

    private String tPcdtmanagerid;
    
    private String tPcdtpurchaseid;

    public String getTpcdtpurchaseid() {
		return tPcdtpurchaseid;
	}

	public void setTpcdtpurchaseid(String tpcdtpurchaseid) {
		this.tPcdtpurchaseid = tpcdtpurchaseid;
	}

	public String gettPcdetailid() {
        return tPcdetailid;
    }

    public void settPcdetailid(String tPcdetailid) {
        this.tPcdetailid = tPcdetailid == null ? null : tPcdetailid.trim();
    }

    public String gettPcdetailproid() {
        return tPcdetailproid;
    }

    public void settPcdetailproid(String tPcdetailproid) {
        this.tPcdetailproid = tPcdetailproid == null ? null : tPcdetailproid.trim();
    }

    public Integer gettPurchasequt() {
        return tPurchasequt;
    }

    public void settPurchasequt(Integer tPurchasequt) {
        this.tPurchasequt = tPurchasequt;
    }

    public Integer gettPcdetailprice() {
        return tPcdetailprice;
    }

    public void settPcdetailprice(Integer tPcdetailprice) {
        this.tPcdetailprice = tPcdetailprice;
    }

    public String gettPcdtmanagerid() {
        return tPcdtmanagerid;
    }

    public void settPcdtmanagerid(String tPcdtmanagerid) {
        this.tPcdtmanagerid = tPcdtmanagerid == null ? null : tPcdtmanagerid.trim();
    }
}