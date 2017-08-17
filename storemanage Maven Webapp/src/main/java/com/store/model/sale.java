package com.store.model;

import java.util.Date;
import java.util.List;

public class sale {
    private String tSaleid;

    private String tCustid;

    private String tUserid;

    private String tSlmanagerid;

    private Date tSaledate;

    private Date tDeliverdate;

    private Date tArrivaldate;

    private String tSaleaddress;

    private String tContacthuman;
     
    private List<receipt> receipts;
    
    private List<saledetail> saledetails;
    
    public List<receipt> getReceipts() {
		return receipts;
	}

	public void setReceipts(List<receipt> receipts) {
		this.receipts = receipts;
	}

    public List<saledetail> getSaledetails() {
		return saledetails;
	}

    public void setSaledetails(List<saledetail> saledetails) {
		this.saledetails = saledetails;
	}

	public String gettSaleid() {
        return tSaleid;
    }

    public void settSaleid(String tSaleid) {
        this.tSaleid = tSaleid == null ? null : tSaleid.trim();
    }

    public String gettCustid() {
        return tCustid;
    }

    public void settCustid(String tCustid) {
        this.tCustid = tCustid == null ? null : tCustid.trim();
    }

    public String gettUserid() {
        return tUserid;
    }

    public void settUserid(String tUserid) {
        this.tUserid = tUserid == null ? null : tUserid.trim();
    }

    public String gettSlmanagerid() {
        return tSlmanagerid;
    }

    public void settSlmanagerid(String tSlmanagerid) {
        this.tSlmanagerid = tSlmanagerid == null ? null : tSlmanagerid.trim();
    }

    public Date gettSaledate() {
        return tSaledate;
    }

    public void settSaledate(Date tSaledate) {
        this.tSaledate = tSaledate;
    }

    public Date gettDeliverdate() {
        return tDeliverdate;
    }

    public void settDeliverdate(Date tDeliverdate) {
        this.tDeliverdate = tDeliverdate;
    }

    public Date gettArrivaldate() {
        return tArrivaldate;
    }

    public void settArrivaldate(Date tArrivaldate) {
        this.tArrivaldate = tArrivaldate;
    }

    public String gettSaleaddress() {
        return tSaleaddress;
    }

    public void settSaleaddress(String tSaleaddress) {
        this.tSaleaddress = tSaleaddress == null ? null : tSaleaddress.trim();
    }

    public String gettContacthuman() {
        return tContacthuman;
    }

    public void settContacthuman(String tContacthuman) {
        this.tContacthuman = tContacthuman == null ? null : tContacthuman.trim();
    }
}