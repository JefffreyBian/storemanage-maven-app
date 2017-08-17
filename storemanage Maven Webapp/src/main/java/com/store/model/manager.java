package com.store.model;

import java.util.List;

public class manager {
    private String tManagerid;

    private String tManagername;

    private String tManageraddress;

    private String tManagermail;

    private String tManageraccount;

    private String tManagerpw;
    
    private List<mfr> mfrs;
    
	private List<customer> customers;
    
    private  List<user> users;
    
    public List<mfr> getMfrs() {
		return mfrs;
	}

	public void setMfrs(List<mfr> mfrs) {
		this.mfrs = mfrs;
	}

	public List<customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<customer> customers) {
		this.customers = customers;
	}

    
    public List<user> getUsers() {
		return users;
	}

	public void setUsers(List<user> users) {
		this.users = users;
	}

	public String gettManagerid() {
        return tManagerid;
    }

    public void settManagerid(String tManagerid) {
        this.tManagerid = tManagerid == null ? null : tManagerid.trim();
    }

    public String gettManagername() {
        return tManagername;
    }

    public void settManagername(String tManagername) {
        this.tManagername = tManagername == null ? null : tManagername.trim();
    }

    public String gettManageraddress() {
        return tManageraddress;
    }

    public void settManageraddress(String tManageraddress) {
        this.tManageraddress = tManageraddress == null ? null : tManageraddress.trim();
    }

    public String gettManagermail() {
        return tManagermail;
    }

    public void settManagermail(String tManagermail) {
        this.tManagermail = tManagermail == null ? null : tManagermail.trim();
    }

    public String gettManageraccount() {
        return tManageraccount;
    }

    public void settManageraccount(String tManageraccount) {
        this.tManageraccount = tManageraccount == null ? null : tManageraccount.trim();
    }

    public String gettManagerpw() {
        return tManagerpw;
    }

    public void settManagerpw(String tManagerpw) {
        this.tManagerpw = tManagerpw == null ? null : tManagerpw.trim();
    }
}