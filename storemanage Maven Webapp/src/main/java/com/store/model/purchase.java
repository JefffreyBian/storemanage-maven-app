package com.store.model;

import java.util.Date;
import java.util.List;

public class purchase {
    private String tPurchaseid;

    private String tMfrid;

    private String tUserid;

    private String tPcmanagerid;

    private Date tPcdate;

    private Date tArrivaldate;

    private String tPcaddress;

    private String tContacthuman;

    private payform payform;

	public payform getPayform() {
		return payform;
	}

	public void setPayform(payform payform) {
		this.payform = payform;
	}

	private List<pcdetail> pcdetails;
	  
    public List<pcdetail> getPcdetails() {
		return pcdetails;
	}

	public void setPcdetails(List<pcdetail> pcdetails) {
		this.pcdetails = pcdetails;
	}

    public String gettPurchaseid() {
        return tPurchaseid;
    }

    public void settPurchaseid(String tPurchaseid) {
        this.tPurchaseid = tPurchaseid == null ? null : tPurchaseid.trim();
    }

    public String gettMfrid() {
        return tMfrid;
    }

    public void settMfrid(String tMfrid) {
        this.tMfrid = tMfrid == null ? null : tMfrid.trim();
    }

    public String gettUserid() {
        return tUserid;
    }

    public void settUserid(String tUserid) {
        this.tUserid = tUserid == null ? null : tUserid.trim();
    }

    public String gettPcmanagerid() {
        return tPcmanagerid;
    }

    public void settPcmanagerid(String tPcmanagerid) {
        this.tPcmanagerid = tPcmanagerid == null ? null : tPcmanagerid.trim();
    }

    public Date gettPcdate() {
        return tPcdate;
    }

    public void settPcdate(Date tPcdate) {
        this.tPcdate = tPcdate;
    }

    public Date gettArrivaldate() {
        return tArrivaldate;
    }

    public void settArrivaldate(Date tArrivaldate) {
        this.tArrivaldate = tArrivaldate;
    }

    public String gettPcaddress() {
        return tPcaddress;
    }

    public void settPcaddress(String tPcaddress) {
        this.tPcaddress = tPcaddress == null ? null : tPcaddress.trim();
    }

    public String gettContacthuman() {
        return tContacthuman;
    }

    public void settContacthuman(String tContacthuman) {
        this.tContacthuman = tContacthuman == null ? null : tContacthuman.trim();
    }
}