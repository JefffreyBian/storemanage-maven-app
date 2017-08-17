package com.store.model;

import java.util.List;

public class mfrctact {
    private String tMfrcontactid;

    private String tMfrcontactname;

    private String tMfrcontactaddress;

    private String tMfrcontactmail;

    private String tMfrcontactphone;

    private String tMfrid;

    private String tMfrcmanagerid;

    private List<purchase> purchases;
    public List<purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<purchase> purchases) {
		this.purchases = purchases;
	}

	public String gettMfrcontactid() {
        return tMfrcontactid;
    }

    public void settMfrcontactid(String tMfrcontactid) {
        this.tMfrcontactid = tMfrcontactid == null ? null : tMfrcontactid.trim();
    }

    public String gettMfrcontactname() {
        return tMfrcontactname;
    }

    public void settMfrcontactname(String tMfrcontactname) {
        this.tMfrcontactname = tMfrcontactname == null ? null : tMfrcontactname.trim();
    }

    public String gettMfrcontactaddress() {
        return tMfrcontactaddress;
    }

    public void settMfrcontactaddress(String tMfrcontactaddress) {
        this.tMfrcontactaddress = tMfrcontactaddress == null ? null : tMfrcontactaddress.trim();
    }

    public String gettMfrcontactmail() {
        return tMfrcontactmail;
    }

    public void settMfrcontactmail(String tMfrcontactmail) {
        this.tMfrcontactmail = tMfrcontactmail == null ? null : tMfrcontactmail.trim();
    }

    public String gettMfrcontactphone() {
        return tMfrcontactphone;
    }

    public void settMfrcontactphone(String tMfrcontactphone) {
        this.tMfrcontactphone = tMfrcontactphone == null ? null : tMfrcontactphone.trim();
    }

    public String gettMfrid() {
        return tMfrid;
    }

    public void settMfrid(String tMfrid) {
        this.tMfrid = tMfrid == null ? null : tMfrid.trim();
    }

    public String gettMfrcmanagerid() {
        return tMfrcmanagerid;
    }

    public void settMfrcmanagerid(String tMfrcmanagerid) {
        this.tMfrcmanagerid = tMfrcmanagerid == null ? null : tMfrcmanagerid.trim();
    }
}