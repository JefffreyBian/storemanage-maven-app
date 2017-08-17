package com.store.model;

import java.util.List;

public class user {
    private String tUserid;

    private String tUsername;

    private String tUsefirm;

    private String tUsermail;

    private String tUseraccount;

    private String tUserpw;

    private String tUserjob;

    private String tUserphone;

    private String tUsermanager;
    
    private List<sale> sales;
    
	private List<purchase> purchases;
	
	private List<receipt> receipts;
	
	private List<payform> payforms;

    public List<payform> getPayforms() {
		return payforms;
	}

	public void setPayforms(List<payform> payforms) {
		this.payforms = payforms;
	}

	public List<receipt> getReceipts() {
		return receipts;
	}

	public void setReceipts(List<receipt> receipts) {
		this.receipts = receipts;
	}

	public List<sale> getSales() {
		return sales;
	}

	public void setSales(List<sale> sales) {
		this.sales = sales;
	}

	public List<purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<purchase> purchases) {
		this.purchases = purchases;
	}

    public String gettUserid() {
        return tUserid;
    }

    public void settUserid(String tUserid) {
        this.tUserid = tUserid == null ? null : tUserid.trim();
    }

    public String gettUsername() {
        return tUsername;
    }

    public void settUsername(String tUsername) {
        this.tUsername = tUsername == null ? null : tUsername.trim();
    }

    public String gettUsefirm() {
        return tUsefirm;
    }

    public void settUsefirm(String tUsefirm) {
        this.tUsefirm = tUsefirm == null ? null : tUsefirm.trim();
    }

    public String gettUsermail() {
        return tUsermail;
    }

    public void settUsermail(String tUsermail) {
        this.tUsermail = tUsermail == null ? null : tUsermail.trim();
    }

    public String gettUseraccount() {
        return tUseraccount;
    }

    public void settUseraccount(String tUseraccount) {
        this.tUseraccount = tUseraccount == null ? null : tUseraccount.trim();
    }

    public String gettUserpw() {
        return tUserpw;
    }

    public void settUserpw(String tUserpw) {
        this.tUserpw = tUserpw == null ? null : tUserpw.trim();
    }

    public String gettUserjob() {
        return tUserjob;
    }

    public void settUserjob(String tUserjob) {
        this.tUserjob = tUserjob == null ? null : tUserjob.trim();
    }

    public String gettUserphone() {
        return tUserphone;
    }

    public void settUserphone(String tUserphone) {
        this.tUserphone = tUserphone == null ? null : tUserphone.trim();
    }

    public String gettUsermanager() {
        return tUsermanager;
    }

    public void settUsermanager(String tUsermanager) {
        this.tUsermanager = tUsermanager == null ? null : tUsermanager.trim();
    }
}